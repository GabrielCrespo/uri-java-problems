package exercices.bee1036;

import java.util.Locale;
import java.util.Scanner;

public class bee1036 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = calculateDelta(a, b, c);

        if(delta < 0.0 || a == 0.0) {
            System.out.println("Impossivel calcular");
        } else if (delta > 0.0) {
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", calculateFirstRealRoot(a, b, delta),
                    calculateSecondRealRoot(a, b, delta));
        }

        sc.close();

    }


    private static double calculateDelta(double a, double b, double c) {
        return (b * b) - (4.0 * a * c);
    }

    private static double calculateFirstRealRoot(double a, double b, double delta) {
        return ((-1 * b) + Math.sqrt(delta)) / (2.0 * a);
    }

    private static double calculateSecondRealRoot(double a, double b, double delta) {
        return ((-1 * b) - Math.sqrt(delta)) / (2.0 * a);
    }

}
