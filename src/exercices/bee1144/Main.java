package exercices.bee1144;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeLinhas = scanner.nextInt();

        for (int i = 1; i <= quantidadeDeLinhas; i++) {
            System.out.printf("%d %d %d\n", i, calcularNumeroAoQuadrado(i), calcularNumeroAoCubo(i));
            System.out.printf("%d %d %d\n", i, calcularNumeroAoQuadrado(i)+1, calcularNumeroAoCubo(i)+1);
        }

        scanner.close();

    }

    private static int calcularNumeroAoQuadrado(int valor) {
        return valor * valor;
    }

    private static int calcularNumeroAoCubo(int valor) {
        return valor * valor * valor;
    }

}
