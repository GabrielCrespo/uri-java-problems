package exercices.bee1865;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String THOR_NAME = "Thor";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {

            String name = scanner.next();
            int strength = scanner.nextInt();

            char result = THOR_NAME.equals(name) ? 'Y' : 'N';
            System.out.println(result);

        }

        scanner.close();

    }

}
