package exercices.bee2234;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalOfHotDogs = scanner.nextInt();
        int totalOfParticipants = scanner.nextInt();

        double averageOfConsumedHotDogs = getAverageOfConsumedHotDogs(totalOfHotDogs, totalOfParticipants);

        System.out.printf("%.2f\n", averageOfConsumedHotDogs);

        scanner.close();

    }

    private static double getAverageOfConsumedHotDogs(int totalOfHotDogs, int totalOfParticipants) {
        return (double) totalOfHotDogs / totalOfParticipants;
    }

}
