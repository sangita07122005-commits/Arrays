package PracticeQuestion;
import java.util.Scanner;
public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("before swapping");
        System.out.println("enter the str1 :");
        String str1 = sc.nextLine();
        System.out.println("enter the str2 :");
        String str2 = sc.nextLine();


        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("after swapping");
        System.out.println("first string :" + str1);
        System.out.println("second string :" + str2);




    }
}
