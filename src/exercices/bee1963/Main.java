package exercices.bee1963;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double oldPrice = scanner.nextDouble();
        double newPrice = scanner.nextDouble();

        double percentage = getIncreasePercentage(oldPrice, newPrice);

        System.out.printf("%.2f%%\n", percentage);

        scanner.close();

    }

    private static double getIncreasePercentage(double a, double b) {
        double c = b - a;
        return (100.0 * c) / a;
    }
}
