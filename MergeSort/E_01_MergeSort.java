package MergeSort;
import java.util.Scanner;
import java.util.Arrays;

public class E_01_MergeSort {

    // naive approach
    public static int[] approach1(int[] a, int[] b) {
        System.out.println("APPROACH 1");
        int[] merged = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            merged[k] = a[i];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            merged[k] = b[i];
            k++;
        }

        Arrays.sort(merged);
        return merged;
    }


    //Efficient approach
    public static int[] approach2(int[] a, int[] b) {
        System.out.println("APPROACH 2");
        int[] merged = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= a[j]) {
                merged[k++] = a[i++];

            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < a.length) {
            merged[k++] = a[i++];
        }
        while (i < b.length) {
            merged[k++] = a[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] a = {5, 9, 13, 14, 20};
        int[] b = {1, 7, 9, 14, 20, 25, 30, 32};

        int[] result1 = approach1(a, b);
        System.out.println("After merging : " + Arrays.toString(result1) + "\n");
        int[] result2 = approach2(a, b);
        System.out.println("After merging : " + Arrays.toString(result2));
    }
}
