package exercices.bee1045;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float bigger = greatestAmongThreeFloats(a, b, c);
        float medium = mediumAmongThreeFloats(a, b, c);
        float smaller = smallestAmongThreeFloats(a, b, c);

        printTriangleClassification(bigger, medium, smaller);

        scanner.close();
    }

    private static void printTriangleClassification(float a, float b, float c) {
        if(isNotTriangle(a, b, c)) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if(isRectangleTriangle(a, b, c)) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if(isObtuseTriangle(a, b, c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if(isAcutangleTriangle(a, b, c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(isEquilateralTriangle(a, b, c)) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        if(isIsocelesTriangle(a, b, c)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

    private static boolean isNotTriangle(float x, float y, float z) {
        return x >= y + z;
    }

    private static boolean isRectangleTriangle(float x, float y, float z) {
        return x*x == y*y + z*z;
    }

    private static boolean isObtuseTriangle(float x, float y, float z) {
        return x*x > y*y + z*z;
    }

    private static boolean isAcutangleTriangle(float x, float y, float z) {
        return x*x < y*y + z*z;
    }

    private static boolean isEquilateralTriangle(float x, float y, float z) {
        return x == y && y == z;
    }

    private static boolean isIsocelesTriangle(float x, float y, float z) {
        return (x == y && x != z) || (x == z && x != y) || (y == z && y != x);
    }

    private static float greatestAmongThreeFloats(float x, float y, float z) {

        if(x >= y && x >= z) {
            return  x;
        } else if (y >= x && y >= z) {
            return y;
        }
        return z;
    }

    private static float smallestAmongThreeFloats(float x, float y, float z) {

        if(x <= y && x <= z) {
            return  x;
        } else if (y <= x && y <= z) {
            return y;
        }
        return z;
    }

    private static float mediumAmongThreeFloats(float x, float y, float z) {

        if((x <= y && x >= z) || (x >= y && x <= z)) {
            return  x;
        } else if ((y <= x && y >= z) || (y >= x && y <= z)) {
            return y;
        }
        return z;
    }

}
