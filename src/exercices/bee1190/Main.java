package exercices.bee1190;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int MATRIX_LINE_SIZE = 12;
    public static final int MATRIX_COLUMN_SIZE = 12;
    public static final int QUANTITY_OF_ELEMENTS_RIGHT_AREA = 30;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[MATRIX_LINE_SIZE][MATRIX_COLUMN_SIZE];

        char operationToBeExecuted = scanner.next().charAt(0);

        double result = 0.0f;

        for (int i = 0; i < MATRIX_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIX_COLUMN_SIZE; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        switch (operationToBeExecuted) {
            case 'S':
                result = sum(matrix);
                break;
            case 'M':
                result = average(matrix);
                break;
            default:
                break;
        }

        System.out.printf("%.1f\n", result);

        scanner.close();

    }

    public static double sum(double[][] array) {
        double sum = 0;

        for (int i = 1; i < MATRIX_LINE_SIZE-1; i++) {

            if(i <= 5) {
                for (int j = 11; j > 11-i; j--) {
                    sum += array[i][j];
                }
            } else {
                for (int j = 11; j > i; j--) {
                    sum += array[i][j];
                }
            }


        }

        return sum;
    }

    public static double average(double[][] array) {
        double sum = sum(array);
        return sum / QUANTITY_OF_ELEMENTS_RIGHT_AREA;
    }
}