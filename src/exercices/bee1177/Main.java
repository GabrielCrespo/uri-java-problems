package exercices.bee1177;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final int ARRAY_SIZE = 1000;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int count = 0;
        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {

            if(isDivisibleByValue(i, value)) {
                count = 0;
            }

            array[i] = count;
            count++;
        }

        printArray(array);
        scanner.close();

    }

    private static boolean isDivisibleByValue(int num, int value) {
        return num % value == 0;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("N[" + i + "] = " + array[i]);
        }
    }

}
