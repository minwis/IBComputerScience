import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number fo rows: ");
        int rowN = sc.nextInt();
        System.out.println("Enter the number fo columns: ");
        int columnN = sc.nextInt();
        int[] columnSums = new int[columnN];

        System.out.println();
        for ( int row = 0; row < rowN; row++ ) {
            int rowSum = 0;
            for ( int column = 0; column < columnN; column++) {
                int randomN = (int)(Math.random() * 10);
                System.out.print(randomN + " ");
                rowSum += randomN;
                columnSums[column] += randomN;
            }
            System.out.println( " " + rowSum );

        }

        System.out.println();
        for ( int i = 0; i < columnN; i++ ) {
            System.out.print(columnSums[i] + " ");
        }

    }

}