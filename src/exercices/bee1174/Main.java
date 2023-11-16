package exercices.bee1174;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final int ARRAY_SIZE = 100;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double[] array = new double[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = scanner.nextDouble();
        }

        printArray(array);

        scanner.close();


    }

    private static boolean isLessOrEqualToTen(double value) {
        return value <= 10.0;
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if(isLessOrEqualToTen(array[i]))
                System.out.println("A[" + i + "] = " + String.format("%.1f", array[i]));
        }
    }

}
