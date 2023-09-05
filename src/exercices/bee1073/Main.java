package exercices.bee1073;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorInteiroMaximo = scanner.nextInt();

        for (int i = 1; i <= valorInteiroMaximo; i++) {
            if(ehPar(i)) System.out.println(i + "^2 = " + i*i);
        }

        scanner.close();

    }

    private static boolean ehPar(int valor) {
        return valor % 2 == 0;
    }
}
