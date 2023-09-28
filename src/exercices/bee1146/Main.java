package exercices.bee1146;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = scanner.nextInt();
        int i = 0;

        while (quantidadeValores != 0) {

            for (i = 1; i < quantidadeValores; i++) {
                System.out.print(i + " ");
            }
            System.out.println(i);

            quantidadeValores = scanner.nextInt();
        }

        scanner.close();

    }

}
