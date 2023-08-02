package exercices.bee1040;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final int PESO_1 = 2;
    public static final int PESO_2 = 3;
    public static final int PESO_3 = 4;
    public static final int PESO_4 = 1;
    public static final String ALUNO_APROVADO = "Aluno aprovado.";
    public static final String ALUNO_REPROVADO = "Aluno reprovado.";
    public static final String ALUNO_EM_EXAME = "Aluno em exame.";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String resposta = "";
        boolean alunoEstaEmExame = false;

        float primeiraNota = scanner.nextFloat();
        float segundaNota = scanner.nextFloat();
        float terceiraNota = scanner.nextFloat();
        float quartaNota = scanner.nextFloat();

        float notaExame = 0.0f;

        float mediaPonderada =
                ((PESO_1 * primeiraNota) + (PESO_2 * segundaNota) + (PESO_3 * terceiraNota) + (PESO_4 * quartaNota)) / 10.0f;

        if (mediaPonderada >= 7.0f) {
            resposta = ALUNO_APROVADO;
        } else if (mediaPonderada >= 5.0f && mediaPonderada < 7.0f) {
            resposta = ALUNO_EM_EXAME;
            alunoEstaEmExame = true;
        } else {
            resposta = ALUNO_REPROVADO;
        }

        System.out.printf("Media: %.1f\n", mediaPonderada);
        System.out.println(resposta);

        if (alunoEstaEmExame) {

            notaExame = scanner.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", notaExame);

            mediaPonderada = (mediaPonderada + notaExame) / 2.0f;

            if(mediaPonderada >= 5.0f) {
                resposta = ALUNO_APROVADO;
            } else {
                resposta = ALUNO_REPROVADO;
            }

            System.out.println(resposta);
            System.out.printf("Media final: %.1f\n", mediaPonderada);
        }

        scanner.close();

    }
}
