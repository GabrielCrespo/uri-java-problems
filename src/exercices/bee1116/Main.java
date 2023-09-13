package exercices.bee1116;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static String MENSAGEM_DIVISAO_IMPOSSIVEL = "divisao impossivel";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeValoresPares = scanner.nextInt();
        int primeiroValor;
        int segundoValor;

        float resultado;

        for (int i = 0; i < quantidadeDeValoresPares; i++) {

            primeiroValor = scanner.nextInt();
            segundoValor = scanner.nextInt();

            if (segundoValor == 0) {
                System.out.println(MENSAGEM_DIVISAO_IMPOSSIVEL);
            } else {
                resultado = dividirValoresInteiros(primeiroValor, segundoValor);
                System.out.printf("%.1f%n", resultado);
            }

        }

        scanner.close();

    }

    private static float dividirValoresInteiros(int x, int y) {
        return (float) x /  (float) y;
    }

}
