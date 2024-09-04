import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

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
        }

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
        System.out.println();

        int starStringLength = 1;

        for ( int i = 1; i <= 20; i++ ) {

            for ( int j = 1; j < 40-starStringLength; j++ ) {
                System.out.print(" ");
            }

            for ( int j = 0; j< starStringLength; j++ ) {
                System.out.print(" *");
            }

            starStringLength += 2;
            System.out.println();

        }



    }

}