package exercices.bee1173;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[ARRAY_SIZE];
        int value = scanner.nextInt();

        array[0] = value;

        for (int i = 1; i < ARRAY_SIZE; i++) {
            value = multiplyIntForTwo(value);
            array[i] = value;
        }

        printArray(array);

        scanner.close();
    }
    private static int multiplyIntForTwo(int value) {
        return value * 2;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("N[" + i + "] = " + array[i]);
        }
    }

}
