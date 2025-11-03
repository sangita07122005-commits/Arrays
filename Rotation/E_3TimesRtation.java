package Rotation;

import java.util.Arrays;

public class E_3TimesRtation {
    public static void main(String[] args) {
        int [] arr = new int [] {70, 50, 10, 20, 40, 30};

        System.out.println("approach 1: ");
        System.out.println("original Array: " + Arrays.toString(arr));

        int k = 3;
        int a = arr.length;
        int [] temp = new int [k]; // k element store

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



        System.out.println("final Array: " + Arrays.toString(arr));

    }
}
