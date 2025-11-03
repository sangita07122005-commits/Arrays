package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class E_01_CreateArrays {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the 10 numbers:");
        int [] number = new int[10];
        for(int i=0; i<10; i++){ number[i] = Sc.nextInt();
        }
        System.out.println("the final arrays:" + Arrays.toString(number)); }
    }
