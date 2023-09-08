package exercices.bee1080;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor;
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++) {

            valor = scanner.nextInt();

            if(valor >= maior) {
                maior = valor;
                posicao = i+1;
            }

        }

        System.out.println(maior);
        System.out.println(posicao);

        scanner.close();

    }
}
