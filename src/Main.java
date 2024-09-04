import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        /*
        for ( int i = 1; i  <= 5; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 0; j < 10; j++) {
                System.out.print(" ");
                if ( 10-(2*i) <= j) {
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
        }*/

        /*
        for ( int i = 1; i <= 5; i++ ) {
            for ( int j = 1; j <= 5; j++ ) {
                if ( 5 - i < j ) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         */
        /*System.out.println();

        for ( int i = 1; i <= 20; i++ ) {

            //int J = 1;
            for ( int j = 1; j <= 20 - i - 1; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 20-i; j <= 20+i; j++ ) {
                System.out.print(" *");
            }
            for ( int j = 20+(2 * i); j <= 40; j++ ) {
                System.out.print(" ");
            }

            System.out.println();
        }
        */

        System.out.print("She said" + " \"Hello\" to me" +
                "\nI want to write \\" +
                "\n\tIn this sentence I started with an indention." +
                "\nMy name is \'Alice\'" +
                "\n\tHere is some \"Text\" that" +
                 "\n" +
                "\nI'd like to be \"escaped\" for Java." +
                "\n" +
                "\nI'll try a couple special characters here: \\");


    }

}