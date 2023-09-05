package exercices.bee1018.bee1072;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = 0, quantidadeValoresDentro = 0, quantidadeValoresFora = 0;
        int quantidadeValoresInteiros = scanner.nextInt();

        for (int i = 0; i < quantidadeValoresInteiros; i++) {
            valor = scanner.nextInt();

            if(estaNoIntervaloDezAVinte(valor)) {
                quantidadeValoresDentro++;
            } else {
                quantidadeValoresFora++;
            }
        }

        System.out.println(quantidadeValoresDentro + " in");
        System.out.println(quantidadeValoresFora + " out");

        scanner.close();

    }

    private static boolean estaNoIntervaloDezAVinte(int valor) {
        return valor > 9 && valor < 21;
    }

}
