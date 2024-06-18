package exercices.bee2168;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        char[][] answer = new char[number][number];

        number = number + 1;

        int[][] square = new int[number][number];

        int count = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                square[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < number-1; i++) {
            for (int j = 0; j < number-1; j++) {

                if (square[i][j] == 1)
                    count++;

                if (square[i][j+1] == 1)
                    count++;

                if (square[i+1][j] == 1)
                    count++;

                if (square[i+1][j+1] == 1)
                    count++;

                if (count >= 2) {
                   answer[i][j] = 'S';
                } else {
                    answer[i][j] = 'U';
                }

                count = 0;

            }
        }

        for (int i = 0; i < number-1; i++) {
            for (int j = 0; j < number-1; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

        scanner.close();

    }

}
