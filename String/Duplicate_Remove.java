package String;
import java.util.Scanner;

public class Duplicate_Remove {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String input = Sc.nextLine();
        String result = "";
        for(int i =0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("remove the duplicate character: " + result);

    }
}
