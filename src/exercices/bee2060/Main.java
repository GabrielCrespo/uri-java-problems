package exercices.bee2060;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int quantityOfNumbersInTheList = scanner.nextInt();

        int quantityOfMultiplesOf2 = 0;
        int quantityOfMultiplesOf3 = 0;
        int quantityOfMultiplesOf4 = 0;
        int quantityOfMultiplesOf5 = 0;

        for (int i = 0; i < quantityOfNumbersInTheList; i++) {

            int numberInList = scanner.nextInt();

            if (isMultipleOf2(numberInList)) {
                quantityOfMultiplesOf2++;
            }

            if (isMultipleOf3(numberInList)) {
                quantityOfMultiplesOf3++;
            }

            if (isMultipleOf4(numberInList)) {
                quantityOfMultiplesOf4++;
            }

            if (isMultipleOf5(numberInList)) {
                quantityOfMultiplesOf5++;
            }

        }

        printAnswer(quantityOfMultiplesOf2, quantityOfMultiplesOf3, quantityOfMultiplesOf4, quantityOfMultiplesOf5);

        scanner.close();

    }

    private static boolean isMultipleOf2(int value) {
        return value % 2 == 0;
    }

    private static boolean isMultipleOf3(int value) {
        return value % 3 == 0;
    }

    private static boolean isMultipleOf4(int value) {
        return value % 4 == 0;
    }

    private static boolean isMultipleOf5(int value) {
        return value % 5 == 0;
    }

    private static void printAnswer(int quantityOfMultiplesOf2, int quantityOfMultiplesOf3,
                             int quantityOfMultiplesOf4, int quantityOfMultiplesOf5) {

        StringBuilder builder = new StringBuilder();
        builder.append(quantityOfMultiplesOf2);
        builder.append(" Multiplo(s) de 2\n");
        builder.append(quantityOfMultiplesOf3);
        builder.append(" Multiplo(s) de 3\n");
        builder.append(quantityOfMultiplesOf4);
        builder.append(" Multiplo(s) de 4\n");
        builder.append(quantityOfMultiplesOf5);
        builder.append(" Multiplo(s) de 5");

        System.out.println(builder);

    }

}
