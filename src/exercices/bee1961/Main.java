package exercices.bee1961;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int frogJumpHeight = scanner.nextInt();
        int numberOfPipes = scanner.nextInt();

        List<Integer> pipesHeight = new ArrayList<>();

        for (int i = 0; i < numberOfPipes; i++) {
            pipesHeight.add(scanner.nextInt());
        }

        String result = getGameResult(pipesHeight, frogJumpHeight);

        System.out.println(result);

        scanner.close();

    }

    private static String getGameResult(List<Integer> pipesHeight, int frogJumpHeight) {

        boolean frogWins = true;

        for (int i = 0; i < pipesHeight.size() - 1; i++) {

            int actualPipe = pipesHeight.get(i);
            int nextPipe = pipesHeight.get(i + 1);

            int heightDifference = negativeToPositive((nextPipe - actualPipe));

            if (heightDifference > frogJumpHeight) {
                frogWins = false;
                break;
            }

        }

        return frogWins ? "YOU WIN" : "GAME OVER";
    }

    private static int negativeToPositive(int value) {
        return value < 0 ? (value * -1) : value;
    }

}
