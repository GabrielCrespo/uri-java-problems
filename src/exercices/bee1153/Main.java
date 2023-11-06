package exercices.bee1153;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int fatorialDeValor = 1;

        for (int i = valor; i > 0; i--) {
            fatorialDeValor *= i;
        }

        System.out.println(fatorialDeValor);

        scanner.close();

    }

}
