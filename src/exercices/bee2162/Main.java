package exercices.bee2162;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfMeasures = scanner.nextInt();
        var measeures = new int[numberOfMeasures];

        for (int i = 0; i < numberOfMeasures; i++) {
            measeures[i] = scanner.nextInt();
        }

        int theLandscapeFollowsThePattern = doesTheLandscapeFollowThePattern(measeures);
        System.out.println(theLandscapeFollowsThePattern);

        scanner.close();

    }

    private static int doesTheLandscapeFollowThePattern(int[] measures) {

        if (measures.length == 2 && measures[0] == measures[1])
            return 0;

        boolean isNotLandscapePattern;

        for (int i = 1; i < measures.length-1; i++) {

            isNotLandscapePattern = (isPeak(measures[i - 1], measures[i]) && isPeak(measures[i], measures[i + 1]))
                    || (isValley(measures[i - 1], measures[i]) && isValley(measures[i], measures[i + 1]));

            if (isNotLandscapePattern)
                return 0;

        }

        return 1;

    }

    private static boolean isPeak(int previousMeasure, int actualMeasure) {
        return actualMeasure >= previousMeasure;
    }

    private static boolean isValley(int previousMeasure, int actualMeasure) {
        return actualMeasure <= previousMeasure;
    }

}
