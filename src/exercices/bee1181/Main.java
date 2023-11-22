package exercices.bee1181;

import java.util.Scanner;

public class Main {

    public static final int MATRIX_LINE_SIZE = 12;
    public static final int MATRIX_COLUMN_SIZE = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[][] matrix = new float[MATRIX_LINE_SIZE][MATRIX_COLUMN_SIZE];

        int lineToApplyOperation = scanner.nextInt();
        char operationToBeExecuted = scanner.next().charAt(0);

        float result = 0.0f;

        for (int i = 0; i < MATRIX_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIX_COLUMN_SIZE; j++) {
                matrix[i][j] = scanner.nextFloat();
            }
        }

        switch (operationToBeExecuted) {
            case 'S':
                result = sum(matrix[lineToApplyOperation]);
                break;
            case 'M':
                result = average(matrix[lineToApplyOperation]);
                break;
            default:
                break;
        }

        System.out.printf("%.1f\n", result);

        scanner.close();

    }

    public static float sum(float[] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
             sum += array[i];
        }

        return sum;
    }

    public static float average(float[] array) {
        float sum = sum(array);
        return sum / array.length;
    }

}
