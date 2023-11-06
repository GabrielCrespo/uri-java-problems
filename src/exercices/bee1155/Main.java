package exercices.bee1155;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float soma = 1.0f;

        for (int i = 2; i < 101; i++) {
            soma += 1.0f / i;
        }

        System.out.printf("%.2f\n", soma);


        scanner.close();


    }

}
