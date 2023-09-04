package exercices.bee1067;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for(int i = 0; i <= valor; i++) {
            if(ehImpar(i)) System.out.println(i);
        }

        scanner.close();

    }

    private static boolean ehImpar(int valor) {
        return valor % 2 != 0;
    }

}
