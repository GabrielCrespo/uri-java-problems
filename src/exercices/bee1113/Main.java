package exercices.bee1113;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String MENSAGEM_VALOR_CRESCENTE = "Crescente";
    private static final String MENSAGEM_VALOR_DECRESCENTE = "Decrescente";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int primeiroValor = scanner.nextInt();
        int segundoValor = scanner.nextInt();
        String resposta;

        while (primeiroValor != segundoValor) {

            resposta = defineOrdemValores(primeiroValor, segundoValor);
            System.out.println(resposta);

            primeiroValor = scanner.nextInt();
            segundoValor = scanner.nextInt();
        }

        scanner.close();

    }

    private static String defineOrdemValores(int x, int y) {

        if (x > y) {
            return MENSAGEM_VALOR_DECRESCENTE;
        }

        return MENSAGEM_VALOR_CRESCENTE;
    }

}
