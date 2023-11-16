package exercices.bee1172;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[ARRAY_SIZE];
        int value;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            value = scanner.nextInt();

            if(isLessOrEqualToZero(value)) {
                value = 1;
            }

            array[i] = value;
        }

        printArray(array);

        scanner.close();

    }

    private static boolean isLessOrEqualToZero(int value) {
        return value <= 0;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("X[" + i + "] = " + array[i]);
        }
    }
}
