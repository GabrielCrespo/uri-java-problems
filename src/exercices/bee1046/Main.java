package exercices.bee1046;

import java.util.Scanner;

public class Main {

    private static final int TOTAL_QUANTITY_OF_HOURS = 24;
    public static final String MSG_DURACAO_JOGO = "O JOGO DUROU %d HORA(S)\n";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int finalTime = scanner.nextInt();

        if(startTime == finalTime) {
            System.out.printf(MSG_DURACAO_JOGO, TOTAL_QUANTITY_OF_HOURS);
        } else if (startTime > finalTime) {
            System.out.printf(MSG_DURACAO_JOGO, TOTAL_QUANTITY_OF_HOURS - (startTime - finalTime));
        } else if (startTime < finalTime) {
            System.out.printf(MSG_DURACAO_JOGO, finalTime - startTime);
        }

        scanner.close();

    }
}
