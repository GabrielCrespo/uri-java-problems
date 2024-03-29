package exercices.bee2006;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final int NUMBER_OF_COMPETITORS = 5;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int rightAnswer = scanner.nextInt();
        int numberOfRightAnswers = 0;

        for (int i = 0; i < NUMBER_OF_COMPETITORS; i++) {

            int competitorAnswer = scanner.nextInt();

            if (competitorAnswer == rightAnswer)
                numberOfRightAnswers++;

        }

        System.out.println(numberOfRightAnswers);

        scanner.close();


    }

}
