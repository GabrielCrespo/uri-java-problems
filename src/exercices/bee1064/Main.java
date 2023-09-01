package exercices.bee1064;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final String MENSAGEM_VALORES_POSITIVOS = " valores positivos";

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float valor = 0.0f;
        float soma = 0.0f;
        int quantidadePositivos = 0;

        for (int i = 0; i < 6; i++) {

            valor = sc.nextFloat();

            if(valor >= 0) {
                soma += valor;
                quantidadePositivos++;
            }

        }

        System.out.println(quantidadePositivos + MENSAGEM_VALORES_POSITIVOS);
        System.out.printf("%.1f\n", soma / quantidadePositivos);

        sc.close();


    }

}
