import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for ( int i = 0; i < 1000; i++ ) {
            String scratch_code = "109";
            for ( int j = 0; j < 7; j++ ) {
                double digit = Math.random() * 9 + 1;
                scratch_code += Integer.toString((int)digit);
            }

            System.out.println(scratch_code);
        }


    }

}