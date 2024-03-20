package exercices.bee1858;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = scanner.nextInt();
        int[] peoples = new int[numberOfPeople];

        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = scanner.nextInt();
        }

        int result = getMinorsPosition(peoples) + 1;

        System.out.println(result);

        scanner.close();

    }

    private static int getMinorsPosition(int[] values) {
        return IntStream.range(0, values.length)
                .boxed().min(Comparator.comparingInt(value -> values[value]))
                .orElse(-1);
    }

}
