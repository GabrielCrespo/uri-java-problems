package exercices.bee2147;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final double SECONDS_OF_PRESSED_KEY = 0.01;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {

            String word = scanner.next();

            double spentTimeToWriteTheWord = SECONDS_OF_PRESSED_KEY * word.length();

            System.out.printf("%.2f\n", spentTimeToWriteTheWord);

        }

        scanner.close();

    }

}
