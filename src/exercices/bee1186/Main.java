package exercices.bee1186;

import java.util.Scanner;

public class Main {
    public static final int MATRIX_LINE_SIZE = 12;
    public static final int MATRIX_COLUMN_SIZE = 12;
    public static final int QUANTITY_OF_ELEMENTS_DOWN_MAIN_DIAGONAL = (MATRIX_COLUMN_SIZE * (MATRIX_COLUMN_SIZE - 1)) / 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[][] matrix = new float[MATRIX_LINE_SIZE][MATRIX_COLUMN_SIZE];

        char operationToBeExecuted = scanner.next().charAt(0);

        float result = 0.0f;

        for (int i = 0; i < MATRIX_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIX_COLUMN_SIZE; j++) {
                matrix[i][j] = scanner.nextFloat();
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

    public static float sum(float[][] array) {
        float sum = 0;

        for (int j = MATRIX_COLUMN_SIZE-1 ; j > 0 ; j--) {
            for (int i = MATRIX_LINE_SIZE-j; i < MATRIX_LINE_SIZE; i++) {
                sum += array[i][j];
            }
        }

        return sum;
    }

    public static float average(float[][] array) {
        float sum = sum(array);
        return sum / QUANTITY_OF_ELEMENTS_DOWN_MAIN_DIAGONAL;
    }
}