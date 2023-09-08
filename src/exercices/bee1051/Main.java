package exercices.bee1051;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final float MENOR_VALOR_DE_IMPOSTO_DE_RENDA = 0.08f;
    private static final float MEDIO_VALOR_DE_IMPOSTO_DE_RENDA = 0.18f;
    private static final float MAIOR_VALOR_DE_IMPOSTO_DE_RENDA = 0.28f;

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float salario = scanner.nextFloat();
        String respostaValorImposto = defineRespostaValorImposto(salario);
        System.out.println(respostaValorImposto);

        scanner.close();

    }

    private static String defineRespostaValorImposto(float salario) {

        if(salario >= 0.0f && salario < 2000.01f) {
            return "Isento";
        } else if (salario >= 2000.01f && salario < 3000.01) {
            return "R$ " + String.format("%.2f", calculaMenorValorImpostoDeRenda(salario));
        } else if (salario >= 3000.01f && salario < 4500.01) {
            return "R$ " + String.format("%.2f", calculaMedioValorImpostaDeRenda(salario));
        } else {
            return "R$ " + String.format("%.2f", calculaMaiorValorImpostaDeRenda(salario));
        }
    }

    private static float calculaMenorValorImpostoDeRenda(float salario) {
        return (salario - 2000.00f) * MENOR_VALOR_DE_IMPOSTO_DE_RENDA;
    }

    private static float calculaMedioValorImpostaDeRenda(float salario) {
        return ((salario - 3000.00f) * MEDIO_VALOR_DE_IMPOSTO_DE_RENDA)
                + (1000.00f * MENOR_VALOR_DE_IMPOSTO_DE_RENDA);
    }

    private static float calculaMaiorValorImpostaDeRenda(float salario) {
        return ((salario - 4500.00f) * MAIOR_VALOR_DE_IMPOSTO_DE_RENDA)
                + (1500.00f * MEDIO_VALOR_DE_IMPOSTO_DE_RENDA)
                + (1000.00f * MENOR_VALOR_DE_IMPOSTO_DE_RENDA);
    }

}
