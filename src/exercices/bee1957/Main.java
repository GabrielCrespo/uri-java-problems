package exercices.bee1957;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int naturalNumber = scanner.nextInt();
        String hexadecimalNumber = decimalToHex(naturalNumber);

        System.out.println(hexadecimalNumber);

        scanner.close();

    }

    private static String decimalToHex(int decimal) {

        StringBuilder hexadecimalNumber = new StringBuilder();

        boolean isNotRemainderEqualToZero = true;

        int quotient = decimal;
        int remainder;

        while (isNotRemainderEqualToZero) {

            remainder = quotient % 16;
            quotient = quotient / 16;

            if (remainder > 9) {
                hexadecimalNumber.append(getHexadecimalCharacter(remainder));
            } else {
                hexadecimalNumber.append(remainder);
            }

            if (quotient == 0) {
                isNotRemainderEqualToZero = false;
            }

        }

        return hexadecimalNumber.reverse().toString();

    }

    private static char getHexadecimalCharacter(int value) {

        switch (value) {

            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
        }

        return 0;
    }

}
