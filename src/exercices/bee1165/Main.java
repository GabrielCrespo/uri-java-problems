package exercices.bee1165;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasosDeTestes = scanner.nextInt();
        int numero;

        for (int i = 0; i < quantidadeCasosDeTestes; i++) {

            numero = scanner.nextInt();

            if (ehNumeroPrimo(numero)) {
                System.out.println(numero + " eh primo");
            } else {
                System.out.println(numero + " nao eh primo");
            }
        }


        scanner.close();

    }

    private static boolean ehNumeroPrimo(int numero) {

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                soma++;
            }
        }

        return soma == 2;
    }

}
