import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static String firstName;
    public static String lastName;
    public static String gradYear;

    public static void main(String[] args) {
        System.out.println("Please enter your first name:");
        firstName = sc.nextLine();
        System.out.println("Please enter your last name:");
        lastName = sc.nextLine();
        System.out.println("Please enter your graduation year(in [yyyy] format):");
        gradYear = sc.nextLine();

        System.out.println(firstName.toLowerCase() + lastName.substring(0,1).toLowerCase()+ gradYear.substring(2) + "@stu.koc.k12.tr");

        System.out.println();

        //Extra
        System.out.println("Are you student or teacher?");
        String role = sc.nextLine();
        System.out.println("Please enter your first name:");
        firstName = sc.nextLine();


        String secondName = "";
        if (role.equals("student") || role.equals("Student")) {
            System.out.println("Please enter your middle/second name:");
            secondName = sc.nextLine();
        }

        System.out.println("Please enter your last name:");
        lastName = sc.nextLine();

        gradYear = "";
        if (role.equals("student") || role.equals("Student")) {
            System.out.println("Please enter your graduation year:");
            gradYear = sc.nextLine();
        }

        String firstCharOfSecName = "";

        if ( !secondName.isEmpty()) {
            firstCharOfSecName = secondName.substring(0,1).toUpperCase() + secondName.substring(1);
        }
        System.out.println(firstName.toLowerCase() + firstCharOfSecName + lastName.charAt(0) + gradYear + "@koc.k12.tr");

        System.out.println();

        //AES Email Generator
        // --> numbers added at the end of the address when the students' grad year, first name and last name overlap
        //is not implemented.
        //The number requires efficient and comprehensive index data structure

        System.out.println("Welcome to AES!\nAre you a student or a teacher");
        role = sc.nextLine();
        System.out.println("What is your name (first, second, last name)?");
        String name = sc.nextLine();

        String firstCharName = name.substring(0,1).toLowerCase();

        int i = 0;
        int spaceIndex = 0;
        while ( i < name.length() ) {
            if ( name.charAt(i) == ' ' ) {
                spaceIndex = i;
            }
            i++;
        }
        lastName = name.substring(spaceIndex + 1);

        System.out.println("What is your graduation year? (Format: [yyyy])");
        if ( role.charAt(0) == 's' || role.charAt(0) == 'S') {
            gradYear = sc.nextLine();
        }

        String email = gradYear.substring(2) + firstCharName + lastName.toLowerCase();

        System.out.println( email + "@aes.ac.in");

    }

}