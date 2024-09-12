import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while ( i < 26) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        i = 10;
        while ( i > 0 ) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("\n");
        i = 1;
        while ( i <= 39 ) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n");
        i = 1;
        while ( i <= 20) {
            System.out.print(i * 20 + " ");
            i++;
        }

        System.out.println("\n");
        i = 0;
        while ( i <= 200) {
            System.out.print(i + " ");
            i += 20;
        }

        System.out.println("\n");
        i = -10;
        while ( i >= -20 ) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("\n");
        //using function
        print(0, 25, 1);
        print(10, 1, -1);
        print(1, 39, 2);
        print(2, 40, 2);
        print(0, 200, 10);
        print(-10, -20, -1);


        System.out.println("\n");
        i = 0;
        while ( i < 10 ) {
            System.out.println("computer");
            i++;
        }

        System.out.println("\n");
        System.out.print("How many times would you like to see the same sentence?");
        i = sc.nextInt();
        while ( i > 0 ) {
            System.out.println("This will be printed x times to the screen");
            i--;
        }
    }

    public static void print(int startI, int endI, int rate) {
        int i = startI;
        if (rate < 0) {
            while (i >= endI) {
                System.out.print(i + " ");
                i += rate;
            }
        } else {
            while (i <= endI) {
                System.out.print(i + " ");
                i += rate;
            }
        }

        System.out.println("\n");
    }

}