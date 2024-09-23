import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Carbon dating lookup table\npercent C-14 remaining: years passed\n----------------------------");
        double percent = 100.0;
        int age = 0;
        int i = 0;
        while ( i < 20 ) {
            System.out.println(percent + "%: " + age);
            age+=5700;
            percent /= 2;
            i++;
        }

        while ( true ) {
            System.out.print("\nWhat percent of natural carbon-14 does your sample have? ");
            percent = sc.nextDouble();
            System.out.println(percent + "% carbon-14...\n" +
                    "It is: " + (Math.log(percent / 100) / -0.693) * 5700 + " years old");
        }
    }

}