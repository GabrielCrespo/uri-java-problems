package exercices.bee2159;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final double CONSTANT = 1.25506;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double minInRangeForAproximatedPrimes = getMinInRangeForAproximatedPrimes(number);
        double maxInRangeForAproximatedPrimes = getMaxInRangeForAproximatedPrimes(number);

        System.out.printf("%.1f %.1f\n", minInRangeForAproximatedPrimes, maxInRangeForAproximatedPrimes);

        scanner.close();

    }

    private static double getMinInRangeForAproximatedPrimes(int number) {
        return number / Math.log(number);
    }

    private static double getMaxInRangeForAproximatedPrimes(int number) {
        return (number / Math.log(number)) * CONSTANT;
    }

}
