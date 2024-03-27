package exercices.bee1959;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        long numberOfSides = scanner.nextInt();
        long sizeOfEachSide = scanner.nextInt();

        long perimeter = numberOfSides * sizeOfEachSide;

        System.out.println(perimeter);

        scanner.close();

    }

}
