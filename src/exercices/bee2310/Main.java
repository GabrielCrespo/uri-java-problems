package exercices.bee2310;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName;

        int anyPlayerServeAttempts = 0, anyPlayerBlockAttempts = 0, anyPlayerAtackAttempts = 0;
        int anyPlayerServeSuccess = 0, anyPlayerBlockSuccess = 0, anyPlayerAtackSuccess = 0;


        int numberOfPlayers = scanner.nextInt();

        for (int i = 0; i < numberOfPlayers; i++) {

            playerName = scanner.next();

            anyPlayerServeAttempts += scanner.nextInt();
            anyPlayerBlockAttempts += scanner.nextInt();
            anyPlayerAtackAttempts += scanner.nextInt();

            anyPlayerServeSuccess += scanner.nextInt();
            anyPlayerBlockSuccess += scanner.nextInt();
            anyPlayerAtackSuccess += scanner.nextInt();

        }

        double servers = getAllTeamSuccessServers(anyPlayerServeAttempts, anyPlayerServeSuccess);
        double blocks = getAllTeamSuccessBlocks(anyPlayerBlockAttempts, anyPlayerBlockSuccess);
        double atacks = getAllTeamSuccessAtacks(anyPlayerAtackAttempts, anyPlayerAtackSuccess);

        printResult(servers, blocks, atacks);

        scanner.close();

    }

    private static double getAllTeamSuccessServers(int anyPlayerServeAttempts, int anyPlayerServeSuccess) {
        return (double) anyPlayerServeSuccess / anyPlayerServeAttempts;
    }

    private static double getAllTeamSuccessBlocks(int anyPlayerBlockAttempts, int anyPlayerBlockSuccess) {
        return (double) anyPlayerBlockSuccess / anyPlayerBlockAttempts;
    }

    private static double getAllTeamSuccessAtacks(int anyPlayerAtackAttempts, int anyPlayerAtackSuccess) {
        return (double) anyPlayerAtackSuccess / anyPlayerAtackAttempts;
    }

    private static void printResult(double servers, double blocks, double attacks) {
        System.out.printf("Pontos de Saque: %.2f %%.\n", servers * 100.0);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", blocks * 100.0);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", attacks * 100.0);
    }

}
