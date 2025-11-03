package Rotation;
import java.util.Arrays;

public class E_3TimesRotation_2ndprocess {
    public static void approach1(int[] arr, int k) {
        System.out.println("Approach 1: Using Temporary Array");
        System.out.println("Original Array: " + Arrays.toString(arr));

        int a = arr.length;
        int[] temp = new int[k];

        // first step sab element k left shift karo
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        //second step abr left sift
        for (int i = 0; i < a-k; i++){
            arr[i] = arr[i + k];
        }

        // third step
        for (int i = 0; i < k; i++) {
            arr[a - k + i] = temp[i] ;
        }

        System.out.println("After 3 Left Rotations: " + Arrays.toString(arr));
        System.out.println("");
}

    public static void approach2(int[] arr, int k) {
        System.out.println("Approach 2: Rotate One-by-One");
        System.out.println("Original Array: " + Arrays.toString(arr));

        int a = arr.length;

        for (int r = 0; r < k; r++) {   // repeat rotation k times
            int temp = arr[0];          // store first element

            for (int i = 0; i < a - 1; i++) {
                arr[i] = arr[i + 1];    // shift elements left
            }

            arr[a - 1] = temp;          // put first element at end
        }

        System.out.println("After 3 Left Rotations: " + Arrays.toString(arr));
        System.out.println("");
    }

    // Main Function
    public static void main(String[] args) {
        int[] array1 = {70, 50, 10, 20, 40, 30};
        int[] array2 = {70, 50, 10, 20, 40, 30};
        int k = 3;

        approach1(array1, k);  // Using temporary array
        approach2(array2, k);  // Rotate one-by-one
    }
}
