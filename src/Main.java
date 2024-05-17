import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {5, 5, 67, 43, 6, 21, 98, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int lengthOfArray = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elem " + (i + 1) + " = ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Min number of array = " + findMinNumberOfArray(array));
        System.out.println("Max number of array = " + findMaxNumberOfArray(array));
        System.out.println("Count of number \"5\" = " + countOfNumberFive(array));
        sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

//        System.out.print("Enter numbers of array: ");
//        String str = scanner.nextLine();
//        String[] arrayOfString = str.split(" ");
//        System.out.println(Arrays.toString(arrayOfString));
//        scanner.close();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(arrayOfString[i]);
//        }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int findMinNumberOfArray(int[] arr) {
        sortArray(arr);
        return arr[0];
    }

    public static int findMaxNumberOfArray(int[] arr) {
        sortArray(arr);
        return arr[arr.length - 1];
    }

    public static int countOfNumberFive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
              count++;
            }
        }
        return count;
    }
}