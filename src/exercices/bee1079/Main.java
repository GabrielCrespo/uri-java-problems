package exercices.bee1079;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        float nota1;
        float nota2;
        float nota3;

        float resultado;

        for (int i = 0; i < quantidadeDeTestes; i++) {

            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            nota3 = scanner.nextFloat();

            resultado = calcularMediaPonderada(nota1, nota2, nota3);

            System.out.printf("%.1f\n", resultado);

        }

        scanner.close();

    }

    private static float calcularMediaPonderada(float nota1, float nota2, float nota3) {
        return ((nota1 * 2.0f) + (nota2 * 3.0f) + (nota3 * 5.0f)) / 10.0f;
    }
}
