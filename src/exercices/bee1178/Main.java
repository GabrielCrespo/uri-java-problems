package exercices.bee1178;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final int ARRAY_SIZE = 100;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double[] arrayOfHalves = new double[ARRAY_SIZE];
        double value = scanner.nextDouble();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            arrayOfHalves[i] = value;
            value = divideByTwo(value);
        }

        printArray(arrayOfHalves);

        scanner.close();

    }

    private static double formatDoubleValue(double value) {
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(4);
        return Double.parseDouble(df.format(value));
    }

    private static double divideByTwo(double value) {
        return value / 2.0000;
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, array[i]);
        }
    }
}
