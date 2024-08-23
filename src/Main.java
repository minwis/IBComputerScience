import java.util.*;

public class Main {

    public static void main(String[] args) {
        int hits = 27, atBats = 80, roundedAvg = 0;
        double battingAvg = (double)hits/atBats;;
        battingAvg /= 0.0001;

        double n = battingAvg % 10;
        if ( n >= 5) {
            roundedAvg += (int) ((battingAvg - n) % 100) / 10 + 1;
        }

        roundedAvg += (int) (((battingAvg-(battingAvg%100)) / 100) * 10);

        System.out.println(roundedAvg);
    }

}