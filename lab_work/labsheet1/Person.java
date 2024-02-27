public class Person {
    private String name;
    private int age;
    private String gender;

    // Constructor to initialize the attributes
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two instances of the Person class
        Person person1 = new Person("Suji", 30, "Female");
        Person person2 = new Person("Bibek", 23, "Male");

        // Displaying details of the persons
        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("Details of Person 2:");
        person2.displayDetails();
    }
}
