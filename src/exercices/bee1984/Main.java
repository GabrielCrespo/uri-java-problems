package exercices.bee1984;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        String invertedNumber = getInvertedNumber(number);

        System.out.println(invertedNumber);

        scanner.close();

    }

    private static String getInvertedNumber(long number) {

        StringBuilder stringNumber = new StringBuilder();
        long remainder = 0;

        while (number > 0) {

            remainder = number % 10;
            number /= 10;

            stringNumber.append(remainder);

        }

        return stringNumber.toString();

    }

}
