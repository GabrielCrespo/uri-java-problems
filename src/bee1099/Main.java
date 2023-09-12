package bee1099;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeCasosDeTeste = scanner.nextInt();
        int primeiroValorIntervalo = 0;
        int segundoValorIntervalo = 0;
        int soma;

        for (int i = 0; i < quantidadeCasosDeTeste; i++) {

            soma = 0;

            primeiroValorIntervalo = scanner.nextInt();
            segundoValorIntervalo = scanner.nextInt();

            if(primeiroValorIntervalo > segundoValorIntervalo) {

                primeiroValorIntervalo = primeiroValorIntervalo + segundoValorIntervalo;
                segundoValorIntervalo = primeiroValorIntervalo - segundoValorIntervalo;
                primeiroValorIntervalo = primeiroValorIntervalo - segundoValorIntervalo;

            }

            for (int j = primeiroValorIntervalo+1; j < segundoValorIntervalo; j++) {
                if(j % 2 != 0) {
                    soma+=j;
                }
            }
            System.out.println(soma);
        }

        scanner.close();

    }

}
