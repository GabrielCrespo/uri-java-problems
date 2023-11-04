package exercices.bee1149;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        while (n <= 0) {
            n=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma += (a + i);
        }

        System.out.println(soma);

        scanner.close();

    }

}
