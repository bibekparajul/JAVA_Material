import java.util.Arrays;

public class SecondMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 15, 3, 7};

        int secondMin = findSecondMin(arr);
        int secondMax = findSecondMax(arr);

        System.out.println("Second minimum number: " + secondMin);
        System.out.println("Second maximum number: " + secondMax);
    }

    public static int findSecondMin(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                return arr[i];
            }
        }
        return min;
    }

    public static int findSecondMax(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < max) {
                return arr[i];
            }
        }
        return max;
    }
}
