package exercices.bee1133;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int primeiroValorIntervalo = scanner.nextInt();
        int segundoValorIntervalo = scanner.nextInt();

        if(primeiroValorIntervalo > segundoValorIntervalo) {
            primeiroValorIntervalo += segundoValorIntervalo;
            segundoValorIntervalo = primeiroValorIntervalo - segundoValorIntervalo;
            primeiroValorIntervalo -= segundoValorIntervalo;
        }

        for (int i = primeiroValorIntervalo+1; i < segundoValorIntervalo; i++) {
            if(ehRestoDaDivisaoPor5IgualA2ouIgualA3(i)) {
                System.out.println(i);
            }
        }

        scanner.close();

    }

    private static boolean ehRestoDaDivisaoPor5IgualA2ouIgualA3(int valor) {
        return valor % 5 == 2 || valor % 5 == 3;
    }

}
