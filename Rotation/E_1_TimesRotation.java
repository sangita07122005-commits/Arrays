package Rotation;
import java.util.Arrays;


public class E_1_TimesRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, -1, 5, 9, 10};
        int temp = arr[0];// first element store karo
        int a = arr.length-1;

        // har element ko ek step left shift karo
        for (int i = 0; i < a; i++) {
            arr[i] = arr[i+1];
        }

        // last position me first element daal do
        arr[a] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
