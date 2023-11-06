package exercices.bee1159;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valorInicial = scanner.nextInt();
        int soma;

        while (valorInicial != 0) {

            soma = 0;

            if(valorInicial % 2 == 1 || valorInicial % 2 == -1) {
                valorInicial+=1;
            }

            for (int i = 0; i < 5; i++) {
                soma+=valorInicial;
                valorInicial+=2;
            }

            System.out.println(soma);
            valorInicial = scanner.nextInt();
        }


        scanner.close();

    }

}
