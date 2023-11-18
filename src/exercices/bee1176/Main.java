package exercices.bee1176;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int casosDeTeste = scanner.nextInt();
        long element = 0, value = 0;

        for (int i = 0; i < casosDeTeste; i++) {

            element = scanner.nextLong();
            value = calculateFibonacciValueOfAElement(element);

            printResultFibonacci(element, value);

        }

        scanner.close();

    }

    private static void printResultFibonacci(long element, long value) {
        System.out.println("Fib(" + element + ") = " + value);
    }

    private static long calculateFibonacciValueOfAElement(long element) {

        long fibBefore = 0, fibAfter = 1, fibAux = 0;

        if(element == 0) {
            return fibBefore;
        }

        for (int i = 1; i < element; i++) {

            fibAux = fibAfter + fibBefore;
            fibBefore = fibAfter;
            fibAfter = fibAux;

        }

        return fibAfter;

    }

}
