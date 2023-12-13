package exercices.bee1589;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        int radio1, radio2;

        for (int i = 0; i < testCases; i++) {

            radio1 = scanner.nextInt();
            radio2 = scanner.nextInt();

            System.out.println(radio1+radio2);

        }

        scanner.close();

    }

}
