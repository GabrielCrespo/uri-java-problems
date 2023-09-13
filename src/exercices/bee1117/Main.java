package exercices.bee1117;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static String MENSAGEM_NOTA_INVALIDA = "nota invalida";

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float soma = 0.0f;
        float nota;

        int quantidadeNotasValidas = 0;

        while (quantidadeNotasValidas < 2) {

            nota = scanner.nextFloat();

            if (validaNota(nota)) {
                quantidadeNotasValidas++;
                soma+=nota;
            } else {
                System.out.println(MENSAGEM_NOTA_INVALIDA);
            }


        }

        System.out.printf("media = %.2f%n", calcularMedia(soma));
        scanner.close();

    }

    private static boolean validaNota(float nota) {
        return nota >= 0.0f && nota <= 10.0f;
    }

    private static float calcularMedia(float somaNotas) {
        return somaNotas / 2.0f;
    }

}
