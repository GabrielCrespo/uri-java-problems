package exercices.bee1848;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String CROW_SCREAM = "caw caw";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int crowScreamCounter = 0;
        int sum = 0;
        String crowAction;

        while (crowScreamCounter < 3) {

            crowAction = scanner.nextLine();

            while (!CROW_SCREAM.equals(crowAction)) {

                int blinkedValue = getBlinkedValue(crowAction);
                sum += blinkedValue;

                crowAction = scanner.nextLine();
            }

            System.out.println(sum);
            crowScreamCounter++;

            sum = 0;

        }

        scanner.close();

    }

    private static int getBlinkedValue(String eyes) {

        int value = 0;

        String reversedEye = new StringBuilder(eyes).reverse().toString();

        for (int i = 0; i < reversedEye.length(); i++) {

            if (reversedEye.charAt(i) == '*') {
                value += (int) Math.pow(2, i);
            }

        }
        return value;
    }

}
