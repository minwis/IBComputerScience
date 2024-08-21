import java.util.*;

public class Main {

    public static void main(String[] args) {
        int hits = 27, atBats = 80, roundedAvg = 0;
        double battingAvg = 0.0;

        battingAvg = (double)hits/atBats;
        battingAvg /= 0.0001;

        double n = battingAvg % 10;
        if ( n >= 5) {
            double output_first_digit = ((battingAvg - n) % 100) / 10 + 1;
            roundedAvg += output_first_digit;
        }

        roundedAvg += ((battingAvg-(battingAvg%100)) / 100) * 10;

        System.out.println(roundedAvg);
    }

}