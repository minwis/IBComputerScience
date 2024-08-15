import java.util.*;

public class Main {

    public static void main(String[] args) {
        //intded ver.
        int apples = 35;
        int oranges = 22;
        int peaches = 18;
        int grapes = 10;
        int bananas = 8;
        int pineapples = 5;

        System.out.println("Totals \n ------------ \nApples = " + apples);
        System.out.println("Oranges = " + oranges);
        System.out.println("Peaches = " + peaches);
        System.out.println("Grapes = " + grapes);
        System.out.println("Bananas = " + bananas);
        System.out.println("Pineapples = " + pineapples);

        //hashmap ver.
        HashMap<String, Integer> FruitN = new HashMap<>();

        FruitN.put("apples", 35);
        FruitN.put("oranges", 22);
        FruitN.put("peaches", 18);
        FruitN.put("grapes", 10);
        FruitN.put("bananas", 8);
        FruitN.put("pineapples", 5);

        System.out.println(FruitN);

    }
}