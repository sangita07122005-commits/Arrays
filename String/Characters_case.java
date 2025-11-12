package String;

public class Characters_case {
    public static void main(String[] args) {

        String a = "Sangita You Have a /Study";
        // calculate uppercase alphabets
        int uppercount = 0;
        int lowercount = 0;
        int specialcount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                uppercount++;
            }
        }

        //calculate lowercase

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLowerCase(a.charAt(i))) {
                lowercount++;
            }
        }

        // calculate speacial character

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                specialcount++;
            }
        }
        System.out.println("calculate the uppercase :" + uppercount);
        System.out.println("calculate the lowercase :" + lowercount);
        System.out.println("calculate the specail character :" + specialcount);

    }
}