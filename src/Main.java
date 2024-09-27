import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word and I will determine if it is a palindrome.");

        String Continue = "Y";
        while (Continue.equals("Y")) {
            System.out.print("\nWord --> ");
            String word = sc.nextLine();

            boolean isPalindrome = true;
            for ( int i = 0; i < word.length(); i++ ) {
                if ( word.charAt(i) != word.charAt(word.length() - 1 - i) ) {
                    isPalindrome = false;
                }
            }

            if ( isPalindrome ) {
                System.out.println(word + " is a palindrome");
            }
            else {
                System.out.println(word + " is not a palindrome");
            }

            System.out.print("\ncontinue[Y/N]? ");
            Continue = sc.nextLine();
        }
    }

}