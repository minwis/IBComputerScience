import java.util.*;

public class Main {

    public static String[][] board = new String[3][3];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe();
    }

    public static void TicTacToe() {
        int depth = 0;
        String player1 = "X";
        String player2 = "O";
        String player = player1;

        while ( true ) {
            if ( depth == 9 ) {
                System.out.println("TIED!");
            }
            System.out.print("Row: ");
            int row = sc.nextInt();
            System.out.print("Column: ");
            int column = sc.nextInt();
            if (board[row][column] != null) {
                System.out.println("The place is already occupied, try again");
                continue;
            }
            board[row][column] = player;

            for ( int i = 0; i < 3; i++ ) {
                for ( int j = 0; j < 3; j++ ) {
                    if ( board[i][j] == null ) {
                        System.out.print("A");
                    }
                    else {
                        System.out.print(board[i][j] + " ");
                    }
                }
                System.out.println();
            }

            if ( isWinner(player) ) {
                if ( player.equals(player1) ) {
                    System.out.println("Player 1 won!");
                    return;
                }
                else {
                    System.out.println("Player 2 won!");
                    return;
                }
            }

            if ( player.equals(player1) ) {
                player = player2;
            }
            else {
                player = player1;
            }
            depth++;
        }

    }

    public static boolean isWinner(String player) {
        for ( int i = 0; i < 3; i++ ) {
                if (
                        Objects.equals(board[i][0], player) && Objects.equals(board[i][1], player) && Objects.equals(board[i][2], player) ||
                                Objects.equals(board[0][i], player) && Objects.equals(board[1][i], player) && Objects.equals(board[2][i], player) ) {
                    return true;
            }
        }

        if ( Objects.equals(board[0][0], player) && Objects.equals(board[1][1], player) && Objects.equals(board[2][2], player) ) {
            return true;
        }

        return false;

    }


}