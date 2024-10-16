import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Write a Java Program to find the second highest value in a numeric array.
        int[] array1 = new int[10];

        int highestValue = -1;
        int secondValue = -1;

        for ( int j = 0; j < 10; j++ ) {
            array1[j] = (int)(Math.random() * 100);
        }

        for (int k : array1) {
            if (highestValue < k) {
                highestValue = k;
            }
        }

        for (int j : array1) {
            if (secondValue < j && j < highestValue) {
                secondValue = j;
            }
        }

        System.out.println(secondValue);

        //Write a Java Program that merge two string arrays.
        String[] array2 = new String[] { "sea otters", "are", "cuter", "than", "cats", ":DD" };
        String[] array3 = new String[] { "my", "girlfriend", "is", "on", "her", "period", "HELP!!!" };
        int totalLength = array2.length + array3.length;
        String[] array4 = new String[totalLength];

        for ( int i = 0; i < totalLength; i++ ) {
            if ( i < array2.length ) {
                array4[i] = array2[i];
            }
            else {
                array4[i] = array3[i-array2.length];
            }
        }

        System.out.println(Arrays.toString(array4));

        //Write a Java Program to reverse the array contents inside the array.
        String[] arr5 = new String[] { "please", "not", "the", "formative" };
        String[] reversedArr5 = new String[arr5.length];
        for ( int i = 1; i <= arr5.length; i++ ) {
            reversedArr5[arr5.length - i] = arr5[i - 1];
        }
        System.out.println(Arrays.toString(reversedArr5));

        //Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
        int[] arr6 = new int[] { 0, 4, 16, 0, 5, 7, 0, 9, 3, 99, 0 };
        int[] orderedArr6 = new int[arr6.length];
        int index = 0;
        for ( int i = 0; i < arr6.length; i++ ) {
            if ( arr6[i] != 0 ) {
                orderedArr6[index] = arr6[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(orderedArr6));

    }

}