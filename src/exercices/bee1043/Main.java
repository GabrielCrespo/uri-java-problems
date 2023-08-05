package exercices.bee1043;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        boolean isRuleApplicableForTriangleSideA = isRuleApplicableForTriangleSide(a, b, c);
        boolean isRuleApplicableForTriangleSideB = isRuleApplicableForTriangleSide(b, a, c);
        boolean isRuleApplicableForTriangleSideC = isRuleApplicableForTriangleSide(c, a, b);

        if(isRuleApplicableForTriangleSideA && isRuleApplicableForTriangleSideB && isRuleApplicableForTriangleSideC) {
            System.out.printf("Perimetro = %.1f\n", calculateTrianglePerimeter(a, b, c));
        } else {
            System.out.printf("Area = %.1f\n", calculateTrapezeArea(a, b, c));
        }

    }
    private static boolean isRuleApplicableForTriangleSide(float x, float y, float z) {
        return Math.abs(y - z) < x && x < (y + z);
    }

    private static float calculateTrianglePerimeter(float x, float y, float z) {
        return x + y + z;
    }

    private static float calculateTrapezeArea(float x, float y, float z) {
        return ((x + y) * z) / 2.0f;
    }

}
