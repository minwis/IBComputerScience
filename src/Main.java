import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        if ( inputN >= 0 ) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }

        if ( inputN % 2 == 0 ) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        //Bonus 1
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println( Math.max(n1, n2) );

        //Bonus 2
        System.out.print("Enter the year number: ");
        int year = sc.nextInt();

        if ( year % 4 == 0 && year % 100 != 0 ) {
            System.out.println("\n" + year + "is a leap year");
        }
        else {
            System.out.println("\n" + year + "is NOT a leap year");
        }
    }


}