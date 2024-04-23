package exercices.bee2126;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int occurrence = 1;
        int subsequenceQuantity = 0;
        int position = 0;

        while (scanner.hasNext()) {

            String number1 = scanner.next();
            String number2 = scanner.next();

            int number1Length = number1.length();
            int stopCondition = number2.length() - number1Length;

            for (int i = 0; i <= stopCondition; i++) {

                String subsequence = number2.substring(i, number1Length);

                if (number1.equals(subsequence)) {
                    subsequenceQuantity++;
                    position = i;
                }

                number1Length++;

            }

            String answer = printAnswer(occurrence, subsequenceQuantity, position);
            System.out.println(answer);

            subsequenceQuantity = 0;
            position = 0;
            occurrence++;

        }

        scanner.close();

    }

    private static String printAnswer(int ocurrence, int subsequenceQuantity, int position) {

        StringBuilder builder = new StringBuilder();

        builder.append("Caso #");
        builder.append(ocurrence);
        builder.append(":");
        builder.append("\n");

        if (subsequenceQuantity == 0) {
            builder.append("Nao existe subsequencia");
        } else {
            builder.append("Qtd.Subsequencias: ");
            builder.append(subsequenceQuantity);
            builder.append("\n");
            builder.append("Pos: ");
            builder.append(position + 1);
        }

        builder.append("\n");

        return builder.toString();

    }

}
