package exercices.bee2164;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final double SQUARE_ROOT_OF_FIVE = Math.sqrt(5.0);

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double fibonacciValue = getFibonacciValueFromBinetFormula(number);

        System.out.printf("%.1f\n", fibonacciValue);

        scanner.close();

    }

    private static double getFibonacciValueFromBinetFormula(int number) {
        double numerator = Math.pow(((1 + SQUARE_ROOT_OF_FIVE) / 2.0), number)
                - Math.pow(((1 - SQUARE_ROOT_OF_FIVE) / 2.0), number);

        return numerator / SQUARE_ROOT_OF_FIVE;
    }
}
