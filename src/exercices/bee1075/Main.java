package exercices.bee1075;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if(ehRestoDaDivisaoPorValorIgualADois(i, valor))
                System.out.println(i);
        }

        scanner.close();

    }

    private static boolean ehRestoDaDivisaoPorValorIgualADois(int dividendo, int divisor) {
        return dividendo % divisor == 2;
    }
}
