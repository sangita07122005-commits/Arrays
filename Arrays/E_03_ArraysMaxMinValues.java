package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class E_03_ArraysMaxMinValues {
    public static int FMax, FMin, SMax, SMin;

    public static void approach1(int[] array) {
        System.out.println("Approach 1");
        System.out.println("Your first array is : " + Arrays.toString(array));

        FMax = Integer.MIN_VALUE;
        FMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > FMax) {
                FMax = array[i];
            }
            if (array[i] < FMin) {
                FMin = array[i];
            }
        }
    }

    public static void approach2(int[] array) {
        System.out.println("Approach 2");
        System.out.println("Your final array is : " + Arrays.toString(array));

        SMax = Integer.MIN_VALUE;
        SMin = Integer.MAX_VALUE;

        // calculate second max and min
        for (int i = 0; i < array.length; i++) {
            // second max
            if (array[i] != FMax && array[i] > SMax) {
                FMax = array[i];
            }
            // second min
            if (array[i] != FMin && array[i] < SMin) {
                FMin = array[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }



        // Print
        approach1(array);
        System.out.println("Maximum value: " + FMax);
        System.out.println("Second maximum value: " + SMax);
        approach2(array);
        System.out.println("Minimum value: " + FMin);
        System.out.println("Second minimum value: " + SMin);
    }
}