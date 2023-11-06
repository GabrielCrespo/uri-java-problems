package exercices.bee1157;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numeroParaCalcularDivisores = scanner.nextInt();

        for (int i = 1; i <= numeroParaCalcularDivisores; i++) {
            if (numeroParaCalcularDivisores % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();

    }

}
