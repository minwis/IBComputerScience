import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] substitutingWords = new String[13];
        for ( int i = 1; i <= 12; i++ ) {
            System.out.print("[" + i + "] ");
            if ( i == 2 ) {
                System.out.print("Enter a type of VEHICLE --> ");
            }
            else if ( i == 8 ) {
                System.out.print("Enter a VERB ending in 'ed --> ");
            }
            else if ( i == 3 || i == 4 || i == 7 ) {
                System.out.print("Enter an ADJECTIVE --> ");
            }
            else {
                System.out.print("Enter a NOUN --> ");
            }
            substitutingWords[i] = sc.nextLine();
        }

        System.out.println("Just sit right back and you`ll hear a tale,");
        System.out.println("A tale of a fateful " + substitutingWords[1] + ",");
        System.out.println("That started from this tropic port,");
        System.out.println("Aboard this tiny " + substitutingWords[2] + ".");
        System.out.println();
        System.out.println("The mate was a " + substitutingWords[3]+ " sailor man,");
        System.out.println("The skipper " + substitutingWords[4]+ " and sure.");
        System.out.println("Five + " + substitutingWords[5] + " set sail that day,");
        System.out.println("For a three hour " + substitutingWords[6] + ", a three hour " + substitutingWords[6] + ".");
        System.out.println();
        System.out.println("The weather started getting " + substitutingWords[7] + ",");
        System.out.println("The tiny " + substitutingWords[2]+ " was " + substitutingWords[8] + ",");
        System.out.println("If not for the " + substitutingWords[9] + " of the fearless crew ,");
        System.out.println("The " + substitutingWords[10] + " would be lost, the " + substitutingWords[10] +" would be lost.");
        System.out.println();
        System.out.println("The " + substitutingWords[2] + " set ground on the shore of this uncharted desert isle,");
        System.out.println("With Gilligan, The Skipper too,");
        System.out.println("The millionaire and his " + substitutingWords[11] + " , The movie " + substitutingWords[12] + ",");
        System.out.println("And The Rest, Here on Gilligan`s Isle.");


    }

}