package String;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = input.trim().split("\\s+");



        System.out.println("total number of words:" + words.length );
    }
}