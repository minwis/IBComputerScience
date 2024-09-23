import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        while ( true ) {
            System.out.println("Ask a yes or no question?");
            String useless_question = sc.nextLine();
            int randomN = (int) (Math.random() * 10);
            int randomN2 = (int) (Math.random() * 10);
            boolean randomBool = randomN2 < 5;

            if (randomN == 0 && randomBool) {
                System.out.println("Don't worry, everything will be alright..");
            }
            else {
                randomN /= 2;
                switch ( randomN ) {
                    case 0:
                        System.out.println("I don't think so.");
                        break;
                    case 1:
                        System.out.println("Without a doubt!!");
                        break;
                    case 2:
                        System.out.println("Yes.");
                        break;
                    case 3:
                        System.out.println("Ask again later.");
                        break;
                    case 4:
                        System.out.println("No..");
                        break;
                }

            }

            System.out.println();

        }
    }

}