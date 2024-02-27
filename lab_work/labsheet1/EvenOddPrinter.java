public class EvenOddPrinter {
    private static final int LIMIT = 20;
    private static int number = 1;

    public static void main(String[] args) {
        Object lock = new Object();

        // Creating the threads
        Thread evenThread = new Thread(() -> printEven(lock));
        Thread oddThread = new Thread(() -> printOdd(lock));

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }

    public static void printEven(Object lock) {
        synchronized (lock) {
            while (number <= LIMIT) {
                if (number % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify waiting thread (oddThread)
                } else {
                    try {
                        lock.wait(); // Wait for oddThread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void printOdd(Object lock) {
        synchronized (lock) {
            while (number <= LIMIT) {
                if (number % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify waiting thread (evenThread)
                } else {
                    try {
                        lock.wait(); // Wait for evenThread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
