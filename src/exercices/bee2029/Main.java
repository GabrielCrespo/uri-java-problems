package exercices.bee2029;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double N = 3.14;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {

            double volume = scanner.nextDouble();
            double diameter = scanner.nextDouble();

            double radius = diameter / 2.0;

            double height = getCylinderHeight(volume, radius);
            double area = getCylinderArea(radius, height);

            printAnswer(height, area);

        }

        scanner.close();


    }

    private static double getCylinderHeight(double volume, double radius) {
        return volume / (N * radius * radius);
    }

    private static double getCylinderArea(double radius, double height) {
        return N * radius * radius;
    }

    private static void printAnswer(double height, double area) {
        System.out.printf("ALTURA = %.2f\n", height);
        System.out.printf("AREA = %.2f\n", area);
    }


}
