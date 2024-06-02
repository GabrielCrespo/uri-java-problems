package exercices.bee2160;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String textFits = getAnswerIfTextFits(text);
        System.out.println(textFits);

        scanner.close();

    }

    private static String getAnswerIfTextFits(String text) {
        return text.length() <= 80 ? YES : NO;
    }

}
