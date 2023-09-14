package exercices.bee1118;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static String MENSAGEM_NOTA_INVALIDA = "nota invalida";
    private final static String MENSAGEM_NOVO_CALCULO = "novo calculo (1-sim 2-nao)";

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int decisao = 1, quantidadeNotasValidas = 0;
        float nota, soma = 0.0f;

        while (decisao != 2) {

            if(decisao == 1) {

                while (quantidadeNotasValidas < 2) {

                    nota = scanner.nextFloat();

                    if(ehNotaValida(nota)) {
                        quantidadeNotasValidas++;
                        soma+=nota;
                    } else {
                        System.out.println(MENSAGEM_NOTA_INVALIDA);
                    }

                }

                System.out.printf("media = %.2f%n", calcularMedia(soma));
                quantidadeNotasValidas=0;
                soma = 0.0f;

            }

            System.out.println(MENSAGEM_NOVO_CALCULO);
            decisao = scanner.nextInt();

        }

        scanner.close();

    }

    private static boolean ehNotaValida(float nota) {
        return nota >= 0.0f && nota <= 10.0f;
    }

    private static float calcularMedia(float soma) {
        return soma / 2.0f;
    }

}
