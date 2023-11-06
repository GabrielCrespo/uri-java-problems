package exercices.bee1158;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();
        int valorInicial;
        int quantidadeImparesConsecutivos;
        int soma;
        int contador = 0;

        while (contador < quantidadeDeTestes) {

            soma = 0;

            valorInicial = scanner.nextInt();
            quantidadeImparesConsecutivos = scanner.nextInt();

            if(valorInicial % 2 == 0) {
                valorInicial+=1;
            }

            for (int i = 0; i < quantidadeImparesConsecutivos; i++) {
                soma+=valorInicial;
                valorInicial+=2;
            }

            System.out.println(soma);

            contador++;

        }


        scanner.close();

    }

}
