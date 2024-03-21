package exercices.bee1929;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        int sideD = scanner.nextInt();

        boolean isTriangle = isPossibleToBuildTriangle(sideA, sideB, sideC)
                || isPossibleToBuildTriangle(sideA, sideB, sideD)
                || isPossibleToBuildTriangle(sideA, sideC, sideD)
                || isPossibleToBuildTriangle(sideB, sideC, sideD);

        char answer = isTriangle ? 'S' : 'N';

        System.out.println(answer);

        scanner.close();


    }

    private static boolean isPossibleToBuildTriangle(int sideX, int sideY, int sideZ) {
        return (sideX < sideY + sideZ) && (sideY < sideX + sideZ) && (sideZ < sideX + sideY);
    }


}
