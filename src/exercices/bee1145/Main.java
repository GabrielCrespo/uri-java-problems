package exercices.bee1145;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeValoresPorLinha = scanner.nextInt();
        int quantidadeValores = scanner.nextInt();

        for (int i = 1; i <= quantidadeValores; i++) {

            if(i % quantidadeValoresPorLinha == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        scanner.close();

    }

}
