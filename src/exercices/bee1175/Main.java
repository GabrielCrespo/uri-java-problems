package exercices.bee1175;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int ARRAY_SIZE = 20;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = scanner.nextInt();
        }

        array = fillInvertedArray(array);
        printArray(array);

        scanner.close();

    }

    private static int[] fillInvertedArray(int[] array) {
        int[] newArray = new int[ARRAY_SIZE];

        for (int i = ARRAY_SIZE; i > 0; i--) {
            newArray[ARRAY_SIZE - i] = array[i-1];
        }

        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("N[" + i + "] = " + array[i]);
        }
    }
}
