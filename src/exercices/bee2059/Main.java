package exercices.bee2059;

import java.util.Scanner;

public class Main {

    public static final int IS_EVEN = 1;
    public static final int IS_ODD = 0;
    public static final int PLAYER_1_STOLE = 1;
    public static final int PLAYER_1_NOT_STOLE = 0;
    public static final int PLAYER_2_ACCUSED_OF_STEALING = 1;
    public static final int PLAYER_2_NOT_ACCUSED_OF_STEALING = 0;
    public static final String PLAYER_1_WIN = "Jogador 1 ganha!";
    public static final String PLAYER_2_WIN = "Jogador 2 ganha!";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int playerOneChoice = scanner.nextInt();

        int playerOneNumber = scanner.nextInt();
        int playerTwoNumber = scanner.nextInt();

        int playerOneStole = scanner.nextInt();

        int playerTwoAccusedOfStealing = scanner.nextInt();

        String result = defineGameResult(playerOneChoice, playerOneNumber,
                playerTwoNumber, playerOneStole, playerTwoAccusedOfStealing);

        System.out.println(result);

        scanner.close();

    }

    private static boolean isEven(int a, int b) {
        return (a + b) % 2 == 0;
    }

    private static boolean isOdd(int a, int b) {
        return (a + b) % 2 != 0;
    }

    private static boolean playerOneStole(int playerStole) {
        return PLAYER_1_STOLE == playerStole;
    }

    private static boolean playerOneNotStole(int playerStole) {
        return PLAYER_1_NOT_STOLE == playerStole;
    }

    private static boolean playerTwoAccusedOfStealing(int playerAccused) {
        return PLAYER_2_ACCUSED_OF_STEALING == playerAccused;
    }

    private static boolean playerTwoNotAccusedOfStealing(int playerAccused) {
        return PLAYER_2_NOT_ACCUSED_OF_STEALING == playerAccused;
    }

    private static String defineGameResult(int playerOneChoice, int playerOneNumber,
                                           int playerTwoNumber, int playerOneStole,
                                           int playerTwoAccusedOfStealing) {

        String result = "";

        if (IS_EVEN == playerOneChoice) {

            if (isEven(playerOneNumber, playerTwoNumber)) {

                if (playerOneNotStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                } else if (playerOneStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_2_WIN;
                } else if (playerOneStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                } else if (playerOneNotStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                }

            } else {

                if (isOdd(playerOneNumber, playerTwoNumber)) {

                    if (playerOneNotStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_2_WIN;
                    } else if (playerOneStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_2_WIN;
                    } else if (playerOneStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_1_WIN;
                    } else if (playerOneNotStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_1_WIN;
                    }

                }

            }

        }

        if (IS_ODD == playerOneChoice) {

            if (isOdd(playerOneNumber, playerTwoNumber)) {

                if (playerOneNotStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                } else if (playerOneStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_2_WIN;
                } else if (playerOneStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                } else if (playerOneNotStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                    result = PLAYER_1_WIN;
                }

            } else {

                if (isEven(playerOneNumber, playerTwoNumber)) {

                    if (playerOneNotStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_2_WIN;
                    } else if (playerOneStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_2_WIN;
                    } else if (playerOneStole(playerOneStole) && playerTwoNotAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_1_WIN;
                    } else if (playerOneNotStole(playerOneStole) && playerTwoAccusedOfStealing(playerTwoAccusedOfStealing)) {
                        result = PLAYER_1_WIN;
                    }

                }

            }

        }

        return result;
    }

}
