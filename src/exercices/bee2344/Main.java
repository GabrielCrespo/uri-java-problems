package exercices.bee2344;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        String result = defineConcept(grade);

        System.out.println(result);

        scanner.close();

    }

    private static String defineConcept(int grade) {

        if (grade >= 1 && grade < 36) {
            return Concepts.D.name();
        } else if (grade >= 36 && grade < 61) {
            return Concepts.C.name();
        } else if (grade >= 61 && grade < 86) {
            return Concepts.B.name();
        } else if (grade >= 86 && grade < 101) {
            return Concepts.A.name();
        }

        return Concepts.E.name();

    }

    private enum Concepts {
        A, B, C, D, E;
    }

}
