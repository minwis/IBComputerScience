import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //While loop solution
        int NOfStones = 20;
        int player = 1;
        while ( NOfStones > 0) {
            System.out.println("There are " + NOfStones + " stones left");
            System.out.print("Player " + player + " would you like to remove 1 or 2 stones? ");
            int take = sc.nextInt();

            while ( take != 1 && take != 2 ) {
                System.out.print("Please enter 1 or 2: ");
                take = sc.nextInt();
            }

            switch (player) {
                case 1: player = 2; break;
                case 2: player = 1; break;
            }

            NOfStones -= take;
            System.out.println();
        }

        System.out.println("Player " + player + " wins!");

        //Recursion Solution
        int NOfStones_ = 20;
        System.out.println("There are " + NOfStones_ + " stones left");
        System.out.print("Player 1 would you like to remove 1 or 2 stones? ");
        int Take = sc.nextInt();

        System.out.println("\nPlyaer " + NimmGame(NOfStones_, 2, Take) + " wins!");
    }

    public static int NimmGame(int NOfStones, int player, int take) {
        if ( NOfStones <= 0 ) {
            return player;
        }

        if ( take != 1 && take != 2 ) {
            System.out.print("Please enter 1 or 2: ");
        }
        else {
            System.out.println("\nThere are " + NOfStones + " stones left");
            System.out.print("Player " + player + " would you like to remove 1 or 2 stones? ");
            switch (player) {
                case 1: player = 2; break;
                case 2: player = 1; break;
            }
        }

        take = sc.nextInt();
        return NimmGame(NOfStones - take, player, take);
    }

}