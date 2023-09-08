package exercices.bee1094;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();
        int quantidadeTotalCobaias = 0;
        int quantidadeTotalTipoCobaia = 0;
        int quantidadeTotalCoelhos = 0;
        int quantidadeTotalRatos = 0;
        int quantidadeTotalSapos = 0;

        float porcentagemCoelhos = 0.0f;
        float porcentagemRatos = 0.0f;
        float porcentagemSapos = 0.0f;

        char tipoCobaia;

        for (int i = 0; i < quantidadeDeTestes; i++) {

            quantidadeTotalTipoCobaia = scanner.nextInt();
            tipoCobaia = scanner.next().charAt(0);

            switch (tipoCobaia) {
                case 'C':
                    quantidadeTotalCoelhos += quantidadeTotalTipoCobaia;
                    break;
                case 'R':
                    quantidadeTotalRatos += quantidadeTotalTipoCobaia;
                    break;
                case 'S':
                    quantidadeTotalSapos += quantidadeTotalTipoCobaia;
                    break;
                default:
                    break;
            }

            quantidadeTotalCobaias += quantidadeTotalTipoCobaia;

        }

        porcentagemCoelhos = (float) (quantidadeTotalCoelhos * 100) / quantidadeTotalCobaias;
        porcentagemRatos = (float) (quantidadeTotalRatos * 100) / quantidadeTotalCobaias;
        porcentagemSapos = (float) (quantidadeTotalSapos * 100) / quantidadeTotalCobaias;

        System.out.println("Total: " + quantidadeTotalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeTotalCoelhos);
        System.out.println("Total de ratos: " + quantidadeTotalRatos);
        System.out.println("Total de sapos: " + quantidadeTotalSapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", porcentagemCoelhos) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", porcentagemRatos) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", porcentagemSapos) + " %");

        scanner.close();

    }
}
