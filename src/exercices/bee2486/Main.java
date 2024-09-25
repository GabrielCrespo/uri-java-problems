package exercices.bee2486;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final int QUANTIDADE_DIARIA_MINIMA = 110;
    public static final int QUANTIDADE_DIARIA_MAXIMA = 130;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int quantidade, valorTotalVitaminaC, quantidadeErrada;
        String nomeAlimento, informacoes;

        while (t != 0) {

            valorTotalVitaminaC = 0;

            scanner.nextLine();

            for (int i = 0; i < t; i++) {

                informacoes = scanner.nextLine();
                quantidade = Integer.parseInt(informacoes.replaceAll("[^0-9]", ""));
                nomeAlimento = informacoes.substring(informacoes.indexOf(" ") + 1);

                valorTotalVitaminaC += (Alimentos.getQtdVitaminaCPorNome(nomeAlimento) * quantidade);

            }

            if (valorTotalVitaminaC > QUANTIDADE_DIARIA_MAXIMA) {
                quantidadeErrada = valorTotalVitaminaC - QUANTIDADE_DIARIA_MAXIMA;
                System.out.printf("Menos %d mg\n", quantidadeErrada);
            } else if (valorTotalVitaminaC < QUANTIDADE_DIARIA_MINIMA) {
                quantidadeErrada = QUANTIDADE_DIARIA_MINIMA - valorTotalVitaminaC;
                System.out.printf("Mais %d mg\n", quantidadeErrada);
            } else {
                System.out.printf("%d mg\n", valorTotalVitaminaC);
            }

            t = scanner.nextInt();
        }

        scanner.close();

    }

    private enum Alimentos {

        SUCO_DE_LARANJA("suco de laranja", 120),
        MORANGO_FRESCO("morango fresco", 85),
        MAMAO("mamao", 85),
        GOIABA_VERMELHA("goiaba vermelha", 70),
        MANGA("manga", 56),
        LARANJA("laranja", 50),
        BROCOLIS("brocolis", 34);

        final String nome;
        final int qtdVitaminaC;

        Alimentos(String nome, int qtdVitaminaC) {
            this.nome = nome;
            this.qtdVitaminaC = qtdVitaminaC;
        }

        public static int getQtdVitaminaCPorNome(String nome) {
            return Arrays.stream(Alimentos.values())
                    .filter(alimentos -> alimentos.nome.equals(nome))
                    .map(alimentos -> alimentos.qtdVitaminaC)
                    .findFirst()
                    .orElse(0);
        }
    }

}
