package PracticeQuestion;
import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence :");
        String input = sc.nextLine();

        String words = input.replaceAll(" ","");


        System.out.println("removes space :" + words);
    }
}
