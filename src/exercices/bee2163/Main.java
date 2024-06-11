package exercices.bee2163;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int columns = scanner.nextInt();

        int lineFound = 0;
        int columnFound = 0;

        boolean hasPattern = false;

        int[][] land = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                land[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {

                if (land[i][j] == 42) {

                    if (i == 0 || i == lines - 1 || j == 0 || j == columns - 1)
                        continue;

                    if (land[i][j - 1] == 7 && land[i][j + 1] == 7
                            && land[i + 1][j - 1] == 7 && land[i + 1][j] == 7 && land[i + 1][j + 1] == 7
                            && land[i - 1][j - 1] == 7 && land[i - 1][j] == 7 && land[i - 1][j + 1] == 7) {

                        hasPattern = true;
                        lineFound = i;
                        columnFound = j;
                        break;
                    }

                }
            }
        }

        if (hasPattern) {
            System.out.print((lineFound + 1) + " " + (columnFound + 1));
        } else {
            System.out.print(lineFound + " " + columnFound);
        }

        System.out.println();

        scanner.close();


    }

}
