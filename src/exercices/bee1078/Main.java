package exercices.bee1078;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            imprimeTabuada(i+1, valor);
        }

        scanner.close();

    }

    private static void imprimeTabuada(int multiplicando, int multiplicador) {

        StringBuilder builder = new StringBuilder();
        builder.append(multiplicando);
        builder.append(" x ");
        builder.append(multiplicador);
        builder.append(" = ");
        builder.append(multiplicando*multiplicador);

        System.out.println(builder);
    }

}
