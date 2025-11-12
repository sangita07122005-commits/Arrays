package String;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        String a = "sangita";
        int vowelcount = 0;
        int consonantcount = 0;


        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount++;
                } else {
                    consonantcount++;
                }
            }
        }
            System.out.println("calculate the vowel: " + vowelcount);
            System.out.println("calculate the consonant:  " + consonantcount);

        }

    }
