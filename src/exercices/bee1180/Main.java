package exercices.bee1180;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        int smaller;
        int position = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        smaller = array[0];

        for (int i = 0; i < arraySize; i++) {
            if(isSmaller(array[i], smaller)) {
                smaller = array[i];
                position = i;
            }
        }

        System.out.println("Menor valor: " + smaller);
        System.out.println("Posicao: " + position);

        scanner.close();

    }

    public static boolean isSmaller(int a, int b) {
        return a < b;
    }

}
