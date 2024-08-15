import java.util.*;

public class Main {

    public static void main(String[] args) {
        double inch = 2.54, yard = 0.9144, mile = 1.609, centimeter = 0.3937, meter = 1.094, kilometer = 0.6214; //variables declaration
        System.out.println(1 + " inch = " + inch + " centimeters\n" +
                1 + " yard = " + yard + " meters \n" +
                1 + " mile = " + mile + " kilometers\n" +
                1 + " centimeter = " + centimeter + " inches\n" +
                1 + " meter = " + meter + " yards\n" +
                1 + " kilometer = " + kilometer + " miles"
                );

        /*
        1 inch
        12 inches = 1 foot
        3 feet = 1 yard
        1760 yard = 1 mile
        1 mile

        1cm
        100cm = 1m
        1000m = 1km
         */
        Scanner sc = new Scanner(System.in);
        String inputUnit = sc.nextLine();
        String outputUnit = sc.nextLine();

        int[] imperial = new int[] {1, 12, 1760, 1};
        int[] metric = new int[] {1, 100, 1000, 1};

    }


}