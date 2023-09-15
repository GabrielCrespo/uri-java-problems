package exercices.bee1142;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valorDeLinhas = scanner.nextInt();

        for (int i = 0; i < valorDeLinhas*4; i++) {
            if((i + 1) % 4 == 0) {
                System.out.println("PUM");
            } else {
                System.out.print((i+1) + " ");
            }
        }

        scanner.close();

    }

}
