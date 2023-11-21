package exercices.bee1179;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final int ARRAY_SIZE = 5;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = new int[ARRAY_SIZE];
        int[] oddNumbers = new int[ARRAY_SIZE];

        int value;
        int quantityOfEvenNumbers = 0, quantityOfOddNumbers = 0;

        for (int i = 0; i < 15; i++) {

            value = scanner.nextInt();

            if(isEven(value)) {
                evenNumbers[quantityOfEvenNumbers] = value;
                quantityOfEvenNumbers++;
            } else {
                oddNumbers[quantityOfOddNumbers] = value;
                quantityOfOddNumbers++;
            }

            if (quantityOfEvenNumbers == ARRAY_SIZE) {
                quantityOfEvenNumbers = 0;
                printEvenArray(evenNumbers);
            }

            if (quantityOfOddNumbers == ARRAY_SIZE) {
                quantityOfOddNumbers = 0;
                printOddArray(oddNumbers);
            }

        }

        printArray(oddNumbers, quantityOfOddNumbers, "impar");
        printArray(evenNumbers, quantityOfEvenNumbers, "par");

        scanner.close();

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printOddArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("impar[" + i + "] = " + array[i]);
        }
    }

    private static void printEvenArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("par[" + i + "] = " + array[i]);
        }
    }

    private static void printArray(int[] array, int length, String numberType) {
        for (int i = 0; i < length; i++) {
            System.out.println(numberType + "[" + i + "] = " + array[i]);
        }
    }
}
