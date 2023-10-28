import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input=scanner.nextLine().toLowerCase(); 
        scanner.close();

        boolean isPangram=isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] alphabetCheck=new boolean[26];

        for (int i=0; i<input.length(); i++) {
            char c=input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c-'a';
                alphabetCheck[index] = true;
            }
        }

        for (boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
