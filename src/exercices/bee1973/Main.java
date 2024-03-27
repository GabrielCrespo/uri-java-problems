package exercices.bee1973;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfStars = scanner.nextInt();

        long[] numberOfRamInStar = new long[numberOfStars];

        for (int i = 0; i < numberOfStars; i++) {
            numberOfRamInStar[i] = scanner.nextInt();
        }

        long[] result = simulateStarJourney(numberOfRamInStar);

        System.out.printf("%d %d\n", result[0], result[1]);

        scanner.close();


    }


    private static long[] simulateStarJourney(long[] stars) {

        int[] visited = new int[stars.length];

        long numberOfStolenRam = sumAllArrayElements(stars);
        int currentPosition = 0;

        while (currentPosition >= 0 && currentPosition < stars.length) {

            long numberOfRamInStar = stars[currentPosition];
            boolean isStarNotVisitedAlready = visited[currentPosition] == 0;

            if (isStarNotVisitedAlready) {

                if (isOdd(numberOfRamInStar)) {

                    if (numberOfRamInStar != 0) {
                        stars[currentPosition]--;
                        numberOfStolenRam--;
                    }
                    visited[currentPosition] = 1;
                    currentPosition++;


                } else {

                    if (numberOfRamInStar != 0) {
                        stars[currentPosition]--;
                        numberOfStolenRam--;
                    }
                    visited[currentPosition] = 1;
                    currentPosition--;

                }

            } else {

                if (isOdd(numberOfRamInStar)) {

                    if (numberOfRamInStar != 0) {
                        stars[currentPosition]--;
                        numberOfStolenRam--;
                    }

                    currentPosition++;

                } else {

                    if (numberOfRamInStar != 0) {
                        stars[currentPosition]--;
                        numberOfStolenRam--;
                    }

                    currentPosition--;

                }

            }

        }

        long numberOfStarsVisited = countNumberOfOnes(visited);

        return new long[]{numberOfStarsVisited, numberOfStolenRam};
    }

    private static boolean isOdd(long number) {
        return number % 2 != 0;
    }

    private static long sumAllArrayElements(long[] arr) {
        return Arrays.stream(arr).sum();
    }

    private static long countNumberOfOnes(int[] arr) {
        return Arrays.stream(arr).filter(value -> value == 1).toArray().length;
    }

}
