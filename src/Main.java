import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 2;
        A[1] = 4;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;
        for ( int i = 0; i < 5; i++ ) {
            System.out.print( A[i] + " " );
        }

        System.out.println();
        int[] B = new int[] {10, 20, 30, 40, 50};
        for ( int i = 0; i < 5; i++ ) {
            System.out.print( B[i] + " " );
        }

        System.out.println();
        String[] C = new String[3];
        C[0] = "Dog";
        C[2] = "Cat";
        for ( int i = 0; i < 3; i++ ) {
            System.out.print( C[i] + " " );
        }

        System.out.println();
        double[] D = new double[4];
        D[0] = 5.6;
        D[1] = 9.9;
        for ( int i = 0; i < 3; i++ ) {
            System.out.print( C[i] + " " );
        }

        System.out.println();
        String[] E = new String[10];
        for ( int i = 0; i < 10; i ++ ) {
            E[i] = sc.nextLine();
        }
        for ( int i = 0; i < 3; i++ ) {
            System.out.print( E[i] + " " );
        }

        System.out.println();
        int[] F = new int[20];
        for ( int i = 0; i < 20; i ++ ) {
            System.out.print("[" + (i+1) + "]");
            F[i] = sc.nextInt();
        }
        for ( int i = 19; i >= 0; i-- ) {
            System.out.print( F[i] + " " );
        }

    }

}