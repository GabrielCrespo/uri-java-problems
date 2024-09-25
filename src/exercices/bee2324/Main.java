package exercices.bee2324;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final BigInteger UM = BigInteger.valueOf(1);
    private static final BigInteger MENOS_UM = BigInteger.valueOf(-1);
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BigInteger quantityOfLittleDucks;

        boolean teste;

        do {

            quantityOfLittleDucks = scanner.nextBigInteger();
            teste = quantityOfLittleDucks.equals(MENOS_UM);

            if (quantityOfLittleDucks.equals(ZERO)) {
                System.out.println(0);
                continue;
            }

            if (!teste) {
                System.out.println(quantityOfLittleDucks.subtract(UM));
            }

        } while (!teste);

        scanner.close();

    }

}
