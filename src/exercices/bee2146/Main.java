package exercices.bee2146;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int closestPassword = scanner.nextInt();
            int password = closestPassword - 1;

            System.out.println(password);

        }

        scanner.close();

    }

}
