package exercices.bee1151;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int nNumerosSequeciaDeFibonacci = scanner.nextInt();
        int valorFibAntes = 0;
        int valorFibAtual = 1;
        int n = 0;

        for (int i = 0; i < nNumerosSequeciaDeFibonacci-1; i++) {

            System.out.print(valorFibAntes + " ");

            n = valorFibAntes + valorFibAtual;
            valorFibAntes = valorFibAtual;
            valorFibAtual = n;

        }

        System.out.println(valorFibAntes);

        scanner.close();

    }

}
