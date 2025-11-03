package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class E_02_ReversArrays {
    // using 2 pointers - this provides in-place reversal. // Time complexity: O(n) // Space complexity: O(1)
    public static void approach1(int [] a) {
        System.out.println("Approach 1");
        System.out.println("Your original array is : " + Arrays.toString(a));
        int i = 0;
        int j = a.length - 1;
        int temp = 0;
        while(i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Your reversed array is : " + Arrays.toString(a));
    }
    // create another array. Copy the elements from original array in reverse order.
    // Time complexity : O(n)
    // Space complexity : O(n)
    public static void approach2(int [] a) {
        System.out.println("Approach 2");
        System.out.println("Your original array is : " + Arrays.toString(a));
        int [] newArray = new int[a.length];
        int j = 0;
        for(int i = a.length -1; i >= 0; i--) {
            newArray[j] = a[i];
            j++;
        }
        System.out.println("Your reversed array is : " + Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers : ");
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        for(int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
        } System.out.println("Your array is : " + Arrays.toString(a));
        approach1(a);
        System.out.println();
        System.out.println();
        approach2(a);
    }
}

