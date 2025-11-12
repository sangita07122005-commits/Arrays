package PracticeQuestion;
import java.util.Scanner;

public class SmallestLargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String input = sc.nextLine();

        // split function use
        String words[] = input.split(" ");
        String smallest = words[0];
        String largest = words[0];

        //loop
        for(int i = 1; i < words.length; i++){
            if(words[i].length() < smallest.length()){
                smallest = words[i];
            }
            if(words[i].length() > largest.length()){
                largest = words[i];
            }
        }

        System.out.println("smallest number :" + smallest);
        System.out.println("largest number :" + largest);

    }
}
