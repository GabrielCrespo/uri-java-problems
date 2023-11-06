package exercices.bee1164;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasosDeTestes = scanner.nextInt();
        int numero;

        for (int i = 0; i < quantidadeCasosDeTestes; i++) {

            numero = scanner.nextInt();

            if (ehNumeroPerfeito(numero)) {
                System.out.println(numero + " eh perfeito");
            } else {
                System.out.println(numero + " nao eh perfeito");
            }
        }


        scanner.close();

    }

    private static boolean ehNumeroPerfeito(int numero) {

        int soma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma+=i;
            }
        }

        return numero == soma;
    }


}
