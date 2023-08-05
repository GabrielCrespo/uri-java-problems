package exercices.bee1042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int bigger = greatestAmongThreeIntegers(a, b, c);
        int smaller = smallestAmongThreeIntegers(a, b, c);
        int medium = mediumAmongThreeIntegers(a, b, c);


        System.out.printf("%d\n%d\n%d\n", smaller, medium, bigger);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n", a, b, c);

    }
    private static int greatestAmongThreeIntegers(int x, int y, int z) {

        if(x > y && x > z) {
            return  x;
        } else if (y > x && y > z) {
            return y;
        }
        return z;
    }

    private static int smallestAmongThreeIntegers(int x, int y, int z) {

        if(x < y && x < z) {
            return  x;
        } else if (y < x && y < z) {
            return y;
        }
        return z;
    }

    private static int mediumAmongThreeIntegers(int x, int y, int z) {

        if((x < y && x > z) || (x > y && x < z)) {
            return  x;
        } else if ((y < x && y > z) || (y > x && y < z)) {
            return y;
        }
        return z;
    }

}
