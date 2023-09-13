package exercices.bee1115;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private final static String MENSAGEM_PRIMEIRO_QUADRANTE = "primeiro";
    private final static String MENSAGEM_SEGUNDO_QUADRANTE = "segundo";
    private final static String MENSAGEM_TERCEIRO_QUADRANTE = "terceiro";
    private final static String MENSAGEM_QUARTO_QUADRANTE = "quarto";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int primeiraCoordenada = scanner.nextInt();
        int segundaCoordenada = scanner.nextInt();
        String resposta;

        while (primeiraCoordenada != 0 && segundaCoordenada != 0) {

            resposta = defineQuadrante(primeiraCoordenada, segundaCoordenada);
            System.out.println(resposta);

            primeiraCoordenada = scanner.nextInt();
            segundaCoordenada = scanner.nextInt();

        }

        scanner.close();

    }

    private static String defineQuadrante(int primeiraCoordenada, int segundaCoordenada) {

        if(primeiraCoordenada > 0 && segundaCoordenada > 0) {
            return MENSAGEM_PRIMEIRO_QUADRANTE;
        } else if (primeiraCoordenada < 0 && segundaCoordenada > 0) {
            return MENSAGEM_SEGUNDO_QUADRANTE;
        } else if (primeiraCoordenada < 0 && segundaCoordenada < 0) {
            return MENSAGEM_TERCEIRO_QUADRANTE;
        } else {
            return MENSAGEM_QUARTO_QUADRANTE;
        }
    }

}
