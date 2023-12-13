package exercices.bee1759;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String SANTA_CLAUS_SOUND = "Ho";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int howManyHos = scanner.nextInt();

        for (int i = 0; i < howManyHos-1; i++) {
            System.out.print(SANTA_CLAUS_SOUND + " ");
        }

        System.out.println(SANTA_CLAUS_SOUND + "!");

        scanner.close();

    }

}
