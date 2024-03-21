package exercices.bee1924;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String VITORIA_COURSE = "Ciencia da Computacao";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfCourses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfCourses; i++) {
            String course = scanner.nextLine();
        }

        System.out.println(VITORIA_COURSE);

        scanner.close();

    }

}
