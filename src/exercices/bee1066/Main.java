package exercices.bee1066;

import java.util.Scanner;

public class Main {

    private static final String MENSAGEM_VALORES_PARES = " valor(es) par(es)";
    private static final String MENSAGEM_VALORES_IMPARES = " valor(es) impar(es)";
    private static final String MENSAGEM_VALORES_POSITIVOS = " valor(es) positivo(s)";
    private static final String MENSAGEM_VALORES_NEGATIVOS = " valor(es) negativo(s)";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;
        int quantidadeValoresPares = 0;
        int quantidadeValoresImpares = 0;
        int quantidadeValoresPositivos = 0;
        int quantidadeValoresNegativos = 0;

        for (int i = 0; i < 5; i++) {

            valor = scanner.nextInt();

            if (ehValorPar(valor)) {
                quantidadeValoresPares++;
            }

            if (ehValorImpar(valor)) {
                quantidadeValoresImpares++;
            }

            if (ehValorPositivo(valor)) {
                quantidadeValoresPositivos++;
            }

            if(ehValorNegativo(valor)) {
                quantidadeValoresNegativos++;
            }

        }

        System.out.println(quantidadeValoresPares + MENSAGEM_VALORES_PARES);
        System.out.println(quantidadeValoresImpares + MENSAGEM_VALORES_IMPARES);
        System.out.println(quantidadeValoresPositivos + MENSAGEM_VALORES_POSITIVOS);
        System.out.println(quantidadeValoresNegativos + MENSAGEM_VALORES_NEGATIVOS);

        scanner.close();

    }

    private static boolean ehValorPar(int valor) {
        return valor % 2 == 0;
    }

    private static boolean ehValorImpar(int valor) {
        return valor % 2 != 0;
    }

    private static boolean ehValorPositivo(int valor) {
        return valor > 0;
    }

    private static boolean ehValorNegativo(int valor) {
        return valor < 0;
    }
}
