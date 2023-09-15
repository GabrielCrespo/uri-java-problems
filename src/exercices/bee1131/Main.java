package exercices.bee1131;

import java.util.*;

public class Main {

    private final static String MENSAGEM_NOVO_GRENAL = "Novo grenal (1-sim 2-nao)";
    private final static String MENSAGEM_INTER_VENCEU_MAIS = "Inter venceu mais";
    private final static String MENSAGEM_GREMIO_VENCEU_MAIS = "Gremio venceu mais";
    private final static String MENSAGEM_NENHUM_VENCEU_MAIS = "Nao houve vencedor";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decisao = 1;
        int golsInterPartida = 0, quantidadeGolsInter = 0, quantidadeVitoriasInter = 0;
        int golsGremioPartida = 0, quantidadeGolsGremio = 0, quantidadeVitoriasGremio = 0;
        int quantidadeEmpates = 0;
        int quantidadeGrenais = 0;

        while (decisao != 2) {

            quantidadeGrenais++;

            golsInterPartida = scanner.nextInt();
            golsGremioPartida = scanner.nextInt();

            quantidadeGolsInter+=golsInterPartida;
            quantidadeGolsGremio+=golsGremioPartida;

            if(golsInterPartida > golsGremioPartida) {
                quantidadeVitoriasInter++;
            } else if (golsGremioPartida > golsInterPartida) {
                quantidadeVitoriasGremio++;
            } else {
                quantidadeEmpates++;
            }

            System.out.println(MENSAGEM_NOVO_GRENAL);
            decisao = scanner.nextInt();

        }
        imprimeEstatisticasGrenal(quantidadeGrenais, quantidadeVitoriasInter, quantidadeVitoriasGremio, quantidadeEmpates);

        scanner.close();

    }

    private static void imprimeEstatisticasGrenal(
            int quantidadeGrenais,
            int vitoriasInter,
            int vitoriasGremio,
            int empates)
    {
        StringBuilder builder = new StringBuilder();

        builder.append(quantidadeGrenais);
        builder.append(" grenais\n");
        builder.append("Inter:");
        builder.append(vitoriasInter);
        builder.append("\n");
        builder.append("Gremio:");
        builder.append(vitoriasGremio);
        builder.append("\n");
        builder.append("Empates:");
        builder.append(empates);
        builder.append("\n");

        if(vitoriasInter > vitoriasGremio) {
            builder.append(MENSAGEM_INTER_VENCEU_MAIS);
        } else if (vitoriasGremio > vitoriasInter) {
            builder.append(MENSAGEM_GREMIO_VENCEU_MAIS);
        } else {
            builder.append(MENSAGEM_NENHUM_VENCEU_MAIS);
        }

        System.out.println(builder);

    }

}
