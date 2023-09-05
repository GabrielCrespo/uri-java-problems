package exercices.bee1071;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[2];

        valores[0] = scanner.nextInt();
        valores[1] = scanner.nextInt();

        int soma = 0;

        trocarValores(valores);

        for (int i = valores[0]+1; i < valores[1]; i++) {
            if(ehImpar(i))
                soma+=i;
        }

        System.out.println(soma);

        scanner.close();

    }

    private static boolean ehImpar(int valor) {
        return valor % 2 != 0;
    }

    private static void trocarValores(int[] arr) {
        if(arr[0] > arr[1]) {
           int tmp = arr[0];
           arr[0] = arr[1];
           arr[1] = tmp;
        }
    }

}
