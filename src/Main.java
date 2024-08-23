import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your name, playa: ");
        String name = sc.nextLine();

        System.out.print("(M)ale or (F)emale? ");
        String gender_input = sc.nextLine();
        char gender = gender_input.charAt(0);

        String firstName = "";
        String lastName = "";
        for ( int i = 0; i < name.length(); i++ ) {
            if ( name.charAt(i) == ' ' ) {
                firstName = name.substring(0, i);
                lastName = name.substring(i+1);
            }
        }

        System.out.print( firstName.charAt(0) + ". " + lastName.toUpperCase());

        if ( gender == 'M' ) {
            System.out.print(" Daddy ");
        }
        else { //if gender == 'F'
            System.out.print(" Goddess ");
        }

        System.out.print(firstName + "-izzle");
    }

}