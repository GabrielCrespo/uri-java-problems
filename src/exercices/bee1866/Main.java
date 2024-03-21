package exercices.bee1866;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {

            int value = scanner.nextInt();

            int result = isOdd(value) ? 1 : 0;

            System.out.println(result);

        }

        scanner.close();

    }

    private static boolean isOdd(int value) {
        return value % 2 != 0;
    }

}
