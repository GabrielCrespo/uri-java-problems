package exercices.bee1074;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String PAR = "EVEN";
    private static final String IMPAR = "ODD";
    private static final String POSITIVO = "POSITIVE";
    private static final String NEGATIVO = "NEGATIVE";
    private static final String NULL = "NULL";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeValores = scanner.nextInt();
        int valor = 0;

        for(int i = 0; i < quantidadeDeValores; i++) {
            valor = scanner.nextInt();
            String mensagem = defineMensagem(valor);
            System.out.println(mensagem);
        }

        scanner.close();

    }

    private static String defineMensagem(int valor) {

        if(valor > 0 && valor % 2 == 0) {
            return PAR + " " + POSITIVO;
        } else if (valor < 0 && valor % 2 == 0) {
            return PAR + " " + NEGATIVO;
        } else if(valor > 0 && valor % 2 != 0) {
            return IMPAR + " " + POSITIVO;
        } else if (valor < 0 && valor % 2 != 0) {
            return IMPAR + " " + NEGATIVO;
        }

        return NULL;
    }
}
