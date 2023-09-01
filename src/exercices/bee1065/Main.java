package exercices.bee1065;

import java.util.Scanner;

public class Main {

    public static final String MENSAGEM_VALORES_PARES = " valores pares";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        int quantidadeValoresPares = 0;

        for (int i = 0; i < 5; i++) {

            valor = scanner.nextInt();

            if(valor % 2 == 0) {
                quantidadeValoresPares++;
            }

        }

        System.out.println(quantidadeValoresPares + MENSAGEM_VALORES_PARES);

        scanner.close();

    }

}
