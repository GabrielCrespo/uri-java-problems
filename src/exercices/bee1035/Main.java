package exercices.bee1035;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(isBiggerThan(b, c)
                && isBiggerThan(d, a)
                && isBiggerThan(addTwoNumbers(c, d), addTwoNumbers(a, b))
                && isPositive(c)
                && isPositive(d)
                && isEven(a)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();

    }

    private static boolean isBiggerThan(int x, int y) {
        return x > y;
    }

    private static boolean isPositive(int z) {
        return z >= 0;
    }

    private static boolean isEven(int w) {
        return w % 2 == 0;
    }

    private static int addTwoNumbers(int m, int n) {
        return m + n;
    }

}
