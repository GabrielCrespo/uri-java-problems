package exercices.bee1044;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String answer = isMultiple(a, b) ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(answer);

        scanner.close();

    }

    private static boolean isMultiple(int a, int b) {
        if (a < b) {
            return b % a == 0;
        }

        return a % b == 0;
    }

}
