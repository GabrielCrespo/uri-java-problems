package exercices.bee1143;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeLinhas = scanner.nextInt();

        for (int i = 1; i <= quantidadeLinhas; i++) {
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
        }

        scanner.close();

    }
}
