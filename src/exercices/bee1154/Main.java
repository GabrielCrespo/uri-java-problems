package exercices.bee1154;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int contador = 0;
        int soma = 0;

        while (idade >= 0) {
            soma+=idade;
            idade = scanner.nextInt();
            contador++;
        }

        float mediaIdades = calcularMediaIdade(soma, contador);
        System.out.printf("%.2f\n", mediaIdades);

        scanner.close();

    }

    private static float calcularMediaIdade(int somaIdades, int quantidadeDeIdedes) {
        return (float) somaIdades / quantidadeDeIdedes;
    }
}
