import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while( i <= 20 );

        System.out.println();

        i = 1;
        do {
            if ( i % 2 == 1 ) {
                System.out.print(i + " ");
            }
            i++;
        } while ( i <= 50 );

        System.out.println();

        i = 0;
        do {
            System.out.print(i + " ");
            i+=10;
        } while( i <= 200 );

        System.out.println();

        i = 97;
        do {
            System.out.print((char)i + " ");
            i++;
        } while ( i <= 122 );
    }

}