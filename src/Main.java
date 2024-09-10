import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pattern 1
        for ( int i = 1; i  <= 5; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 2
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

        /* //Another solution for Pattern 2
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

        //Pattern 3
        int starStringLength = 1;

        for ( int i = 1; i <= 20; i++ ) {

            for ( int j = 1; j < 40-starStringLength; j++ ) {
                System.out.print(" ");
            }

            for ( int j = 0; j < starStringLength; j++ ) {
                System.out.print(" *");
            }

            starStringLength += 2;
            System.out.println();

        }

        System.out.println();

        //Pattern 4
        for ( int i = 1; i  <= 5; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Pattern 5
        System.out.println("How many rows you want in this pattern?");
        byte NOfRows = sc.nextByte();
        System.out.println("Here is the pattern! :D");
        for ( int i = 1; i <= NOfRows; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //Pattern 6
        System.out.println();

        int NOfStar = 1;
        int increaseStarN = 2;
        int NOfSpace = 4;
        int decreaseSpaceN = -1;
        for ( int i = 1; i <= 9; i++ ) {

            for ( int j = 0; j < NOfSpace; j++ ) {
                System.out.print(" ");
            }
            NOfSpace += decreaseSpaceN;

            for ( int j = 0; j < NOfStar; j++ ) {
                System.out.print("*");
            }
            NOfStar += increaseStarN;

            if ( i == 4 ) {
                decreaseSpaceN *= -1;
                increaseStarN *= -1;
            }

            System.out.println();
        }

        //Floyd's Triangle
        System.out.println("\nEnter the number of rows for floyd's triangle:");
        int FloydN = sc.nextInt();
        int outputN = 1;
        for ( int i = 1; i <= FloydN; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print(outputN++ + " ");
            }
            System.out.println();
        }

        //Final Pattern; Number and Stars
        System.out.println();
        for ( int i = 1; i <= 7; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(j);
            }
            for ( int j = i + 1; j < 7; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}