package exercices.bee2313;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String INVALID = "Invalido";
    private static final String VALID_SCALENE = "Valido-Escaleno";
    private static final String VALID_EQUILATERAL = "Valido-Equilatero";
    private static final String VALID_ISOCELES = "Valido-Isoceles";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        String result = findAnswer(sideA, sideB, sideC);
        System.out.println(result);

        scanner.close();

    }

    private static boolean isTriangle(int sideA, int sideB, int sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    private static boolean isScalene(int sideA, int sideB, int sideC) {
        return sideA != sideB && sideA != sideC && sideB != sideC;
    }

    private static boolean isIsoceles(int sideA, int sideB, int sideC) {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    private static boolean isEquilateral(int sideA, int sideB, int sideC) {
        return sideA == sideB && sideB == sideC;
    }

    private static boolean isRightTriangle(int sideA, int sideB, int sideC) {

        int hipotenusa = Math.max(sideA, sideB);
        hipotenusa = (int) Math.pow(Math.max(hipotenusa, sideC), 2);

        return (Math.pow(sideA, 2) + Math.pow(sideB, 2) == hipotenusa)
                || (Math.pow(sideA, 2) + Math.pow(sideC, 2) == hipotenusa)
                || (Math.pow(sideB, 2) + Math.pow(sideC, 2) == hipotenusa);
    }

    private static char getIsRightTriangleAnswer(boolean isRightTriangle) {
        return isRightTriangle ? 'S' : 'N';
    }

    private static String findAnswer(int sideA, int sideB, int sideC) {

        StringBuilder sb = new StringBuilder();

        if (!isTriangle(sideA, sideB, sideC)) {
            sb.append(INVALID);
            return sb.toString();
        }

        if (isScalene(sideA, sideB, sideC)){
            sb.append(VALID_SCALENE);
        } else if (isEquilateral(sideA, sideB, sideC)) {
            sb.append(VALID_EQUILATERAL);
        } else if (isIsoceles(sideA, sideB, sideC)) {
            sb.append(VALID_ISOCELES);
        }

        char resultIsRightTriangle = getIsRightTriangleAnswer(isRightTriangle(sideA, sideB, sideC));
        sb.append("\n");
        sb.append("Retangulo: ");
        sb.append(resultIsRightTriangle);

        return sb.toString();
    }

}
