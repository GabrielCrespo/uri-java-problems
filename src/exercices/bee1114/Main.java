package exercices.bee1114;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final int SENHA_VALIDA = 2002;
    private static final String MENSAGEM_SENHA_INVALIDA = "Senha Invalida";
    private static final String MENSAGEM_ACESSO_PERMITIDO = "Acesso Permitido";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int senha = scanner.nextInt();

        while (senha != SENHA_VALIDA) {
            System.out.println(MENSAGEM_SENHA_INVALIDA);
            senha = scanner.nextInt();
        }

        System.out.println(MENSAGEM_ACESSO_PERMITIDO);

        scanner.close();

    }

}
