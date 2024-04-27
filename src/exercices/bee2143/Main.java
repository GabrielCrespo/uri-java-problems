package exercices.bee2143;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeopleAtTheTable = 0;
        int numberOfPeopleNotAtTheEndOfTable = 0;
        int numberOfPeopleAtTheEndOfTable = 0;

        int numberOfTests = scanner.nextInt();

        while (numberOfTests > 0) {

            for (int i = 0; i < numberOfTests; i++) {

                numberOfPeopleAtTheTable = scanner.nextInt();

                if (isOdd(numberOfPeopleAtTheTable)) {
                    numberOfPeopleNotAtTheEndOfTable = numberOfPeopleAtTheTable - 1;
                } else {
                    numberOfPeopleNotAtTheEndOfTable = numberOfPeopleAtTheTable - 2;
                }

                numberOfPeopleAtTheEndOfTable = numberOfPeopleAtTheTable - numberOfPeopleNotAtTheEndOfTable;

                int quantityOfOrders = getQuantityOfOrders(numberOfPeopleAtTheEndOfTable, numberOfPeopleNotAtTheEndOfTable);
                System.out.println(quantityOfOrders);

            }

            numberOfTests = scanner.nextInt();
        }

        scanner.close();

    }

    private static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    private static int getQuantityOfOrders(int numberOfPeopleAtTheEndOfTable, int numberOfPeopleNotAtTheEndOfTable) {
        return (numberOfPeopleNotAtTheEndOfTable * 2) + numberOfPeopleAtTheEndOfTable;
    }

}
