package exercices.bee1132;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int primeiroValorIntervalo = scanner.nextInt();
        int segundoValorIntervalo = scanner.nextInt();

        if(primeiroValorIntervalo > segundoValorIntervalo) {
            primeiroValorIntervalo += segundoValorIntervalo;
            segundoValorIntervalo = primeiroValorIntervalo - segundoValorIntervalo;
            primeiroValorIntervalo -= segundoValorIntervalo;
        }

        for (int i = primeiroValorIntervalo; i <= segundoValorIntervalo; i++) {
            if(!ehMultiplode13(i)) {
                soma += i;
            }
        }

        System.out.println(soma);

        scanner.close();

    }

    private static boolean ehMultiplode13(int valor) {
        return valor % 13 == 0;
    }

}
