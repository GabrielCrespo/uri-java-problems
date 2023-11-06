package exercices.bee1156;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        float soma = 1.0f;
        float denomindador = 2.0f;

        for (int i = 3; i < 40; i += 2) {
            soma += i / denomindador;
            denomindador*=2.0f;
        }

        System.out.printf("%.2f\n", soma);

        scanner.close();

    }
}
