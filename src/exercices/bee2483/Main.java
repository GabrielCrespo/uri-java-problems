package exercices.bee2483;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int repeatedTimes = scanner.nextInt();

        StringBuilder builder = new StringBuilder();
        builder.append("Feliz ");
        builder.append("nat");
        builder.append("a".repeat(repeatedTimes));
        builder.append("l!");

        System.out.println(builder);

        scanner.close();


    }

}
