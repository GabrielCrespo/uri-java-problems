package exercices.bee1930;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        int t4 = scanner.nextInt();

        int answer = (t1 + t2 + t3 + t4) - 3;

        System.out.println(answer);

        scanner.close();

    }

}
