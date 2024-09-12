import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n <= 0 ) {
            System.out.println("Invalid input: The number should be an integer and greater than 0");
        }
        int processN = 0;
        while ( n != 1) {
            int n1 = n;
            if ( n % 2 == 0 ) {
                n /= 2;
                System.out.println(n1 + " is even, so I take half: " +  n);
            }
            else {
                n = n * 3 + 1;
                System.out.println(n1 + " is odd, so I make 3n + 1: " +  n);
            }
            processN++;
        }
        System.out.println("The process took" + processN + " to reach 1");
    }

}