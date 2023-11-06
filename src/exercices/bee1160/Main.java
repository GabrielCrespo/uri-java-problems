package exercices.bee1160;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasosDeTeste = scanner.nextInt();
        int populacaoCidadeA, populacaoCidadeB;
        int contador;
        double taxaCrescimentoPopulacaoCidadeA, taxaCrescimentoPopulacaoCidadeB;

        for (int i = 0; i < quantidadeCasosDeTeste; i++) {

            contador = 0;

            populacaoCidadeA = scanner.nextInt();
            populacaoCidadeB = scanner.nextInt();

            taxaCrescimentoPopulacaoCidadeA = scanner.nextDouble();
            taxaCrescimentoPopulacaoCidadeB = scanner.nextDouble();

            while (populacaoCidadeA <= populacaoCidadeB) {

                if(contador > 100) {
                    break;
                }

                populacaoCidadeA += (int) (populacaoCidadeA * (taxaCrescimentoPopulacaoCidadeA / 100));
                populacaoCidadeB += (int) (populacaoCidadeB * (taxaCrescimentoPopulacaoCidadeB / 100));

                contador++;
            }

            if(contador > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(contador + " anos.");
            }

        }

        scanner.close();

    }

}
