package exercices.bee2031;

import java.util.Scanner;

public class Main {

    public static final String PAPER_SIGNAL = "papel";
    public static final String ROCK_SIGNAL = "pedra";
    public static final String AIR_ATTACK_SIGNAL = "ataque";
    public static final String PLAYER_1_WINS = "Jogador 1 venceu";
    public static final String PLAYER_2_WINS = "Jogador 2 venceu";
    public static final String BOTH_PLAYER_WINS = "Ambos venceram";
    public static final String NO_PLAYER_WINS = "Sem ganhador";
    public static final String MUTUAL_ANNIHILATION = "Aniquilacao mutua";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGames = scanner.nextInt();

        for (int i = 0; i < numberOfGames; i++) {

            String playerOneSignal = scanner.next();
            String playerTwoSignal = scanner.next();

            String result = defineTheGame(playerOneSignal, playerTwoSignal);

            System.out.println(result);


        }


        scanner.close();

    }

    public static String defineTheGame(String playerOneSignal, String playerTwoSignal) {

        if (ROCK_SIGNAL.equals(playerOneSignal)) {

            if (AIR_ATTACK_SIGNAL.equals(playerTwoSignal)) {
                return PLAYER_2_WINS;
            }

            if (PAPER_SIGNAL.equals(playerTwoSignal)) {
                return PLAYER_1_WINS;
            }

            if (ROCK_SIGNAL.equals(playerTwoSignal)) {
                return NO_PLAYER_WINS;
            }

        }

        if (ROCK_SIGNAL.equals(playerTwoSignal)) {

            if (AIR_ATTACK_SIGNAL.equals(playerOneSignal)) {
                return PLAYER_1_WINS;
            }

            if (PAPER_SIGNAL.equals(playerOneSignal)) {
                return PLAYER_2_WINS;
            }

        }

        if (AIR_ATTACK_SIGNAL.equals(playerOneSignal)) {

            if (PAPER_SIGNAL.equals(playerTwoSignal)) {
                return PLAYER_1_WINS;
            }

            if (AIR_ATTACK_SIGNAL.equals(playerTwoSignal)) {
                return MUTUAL_ANNIHILATION;
            }

        }

        if (AIR_ATTACK_SIGNAL.equals(playerTwoSignal)) {

            if (PAPER_SIGNAL.equals(playerOneSignal)) {
                return PLAYER_2_WINS;
            }

        }

        if (PAPER_SIGNAL.equals(playerOneSignal)) {

            if (PAPER_SIGNAL.equals(playerTwoSignal)) {
                return BOTH_PLAYER_WINS;
            }

        }

        return null;

    }


}
