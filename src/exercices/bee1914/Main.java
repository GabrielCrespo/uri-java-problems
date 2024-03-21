package exercices.bee1914;

import java.util.Scanner;

public class Main {

    public static final String PAR = "PAR";
    public static final String IMPAR = "IMPAR";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {

            String firstPlayerName = scanner.next();
            String firstPlayerParityChoice = scanner.next();

            String secondPlayerName = scanner.next();
            String secondPlayerParityChoice = scanner.next();

            int firstPlayerNumberChoice = scanner.nextInt();
            int secondPlayerNumberChoice = scanner.nextInt();

            if (isEven(firstPlayerNumberChoice, secondPlayerNumberChoice)) {

                if (PAR.equals(firstPlayerParityChoice)) {
                    System.out.println(firstPlayerName);
                } else {
                    System.out.println(secondPlayerName);
                }

            } else {

                if (IMPAR.equals(firstPlayerParityChoice)) {
                    System.out.println(firstPlayerName);
                } else {
                    System.out.println(secondPlayerName);
                }

            }

        }

        scanner.close();

    }

    private static boolean isEven(int firstPlayerNumberChoice, int secondPlayerNumberChoice) {
        return (firstPlayerNumberChoice + secondPlayerNumberChoice) % 2 == 0;
    }

}
