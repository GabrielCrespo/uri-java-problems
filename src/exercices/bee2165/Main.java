package exercices.bee2165;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String TWEET = "TWEET";
    private static final String MUTE = "MUTE";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String twitterPost = scanner.nextLine();

        System.out.println(getAnswerByPostLimit(twitterPost));

        scanner.close();

    }

    private static String getAnswerByPostLimit(String post) {
        return post.length() <= 140 ? TWEET : MUTE;
    }

}
