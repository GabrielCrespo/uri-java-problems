package exercices.bee1011;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int primeiroValor = scanner.nextInt();
        int segundoValor = scanner.nextInt();
        int soma;

        while (primeiroValor > 0 && segundoValor > 0) {

            if (primeiroValor > segundoValor) {
                primeiroValor += segundoValor;
                segundoValor = primeiroValor - segundoValor;
                primeiroValor -= segundoValor;
            }

            soma = somarValoresDoIntervalo(primeiroValor, segundoValor);

            imprimeSequeciaValoresIntervalo(primeiroValor, segundoValor);
            System.out.println("Sum=" + soma);


            primeiroValor = scanner.nextInt();
            segundoValor = scanner.nextInt();

        }

        scanner.close();

    }

    private static int somarValoresDoIntervalo(int m, int n) {
        int soma = 0;

        for (int i = m; i <=n; i++) {
            soma+=i;
        }

        return soma;
    }

    private static void imprimeSequeciaValoresIntervalo(int m, int n) {
        for (int i = m; i <=n; i++) {
            System.out.print(i + " ");
        }
    }

}
