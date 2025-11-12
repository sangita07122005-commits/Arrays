package String;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String a = Sc.nextLine();

        String reverse = "";
        for (int i = a.length()-1; i>=0; i--) {
            reverse += a.charAt(i);
        }
        if (a.equals(reverse)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
