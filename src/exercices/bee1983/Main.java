package exercices.bee1983;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String MESSAGE = "Minimum note not reached";


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();
        long theChosenOne = 0;
        double mostGrade = 0.0;


        for (int i = 0; i < numberOfStudents; i++) {

            long registration = scanner.nextLong();
            double grade = scanner.nextDouble();

            if (grade > mostGrade) {
                mostGrade = grade;
                theChosenOne = registration;
            }

        }

        if (mostGrade < 8) {
            System.out.println(MESSAGE);
        } else {
            System.out.println(theChosenOne);
        }


        scanner.close();


    }


}
