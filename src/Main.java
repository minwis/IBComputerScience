import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 10 words");

        String[] arr_word = new String[10];
        //Write a Java Program to find the second highest value in a numeric array.
        for ( int i = 0; i < 10; i ++ ) {
            System.out.print("Word " + (i+1) + " --> ");
            arr_word[i] = sc.nextLine();
        }

        for ( int i = 0; i < 10; i ++ ) {
            int count = 0;
            int j = 0;
            for ( j = 0; j < arr_word[i].length(); j++ ) {
                String word = arr_word[i];
                if ( word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u' ) {
                    count++;
                }

            }
            System.out.println(arr_word[i] + " --> " + count);
        }

    }

}