package exercices.bee1060;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String MENSAGEM_FINAL = "valores positivos";

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();

        float valor = 0.0f;
        int quantidadePositivos = 0;

        for(int i = 0; i < 6; i++) {

            valor = sc.nextFloat();

            if(valor >= 0) {
                quantidadePositivos++;
            }
        }

        builder.append(quantidadePositivos);
        builder.append(" ");
        builder.append(MENSAGEM_FINAL);

        System.out.println(builder);

        sc.close();

    }
}
