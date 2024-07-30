package exercices.bee2311;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        String competitorName;
        int numberOfCompetitors = scanner.nextInt();
        double difficultyLevel;

        double[] grade = new double[7];
        double highestGrade, lowestGrade;
        double sum, result;

        for (int i = 0; i < numberOfCompetitors; i++) {

            competitorName = scanner.next();
            difficultyLevel = scanner.nextDouble();

            for (int j = 0; j < grade.length; j++) {
                grade[j] = scanner.nextDouble();
            }

            sum = Arrays.stream(grade).sum();
            highestGrade = Arrays.stream(grade).max().getAsDouble();
            lowestGrade = Arrays.stream(grade).min().getAsDouble();

            result = ((sum - highestGrade - lowestGrade) * difficultyLevel);
            System.out.printf("%s %.2f\n", competitorName, result);

        }

    }

}
