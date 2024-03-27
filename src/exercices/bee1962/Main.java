package exercices.bee1962;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String BEFORE_CHRIST = "A.C.";
    public static final String AFTER_CHRIST = "D.C.";
    public static final long BASE_YEAR = 2015;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = scanner.nextInt();

        long year = 0;

        for (int i = 0; i < numberOfLines; i++) {

            year = scanner.nextLong();

            String result = getCorrespondingYear(year);

            System.out.println(result);

        }

        scanner.close();

    }

    private static String getCorrespondingYear(long year) {

        StringBuilder builder = new StringBuilder();

        long result;

        if (year >= BASE_YEAR) {
            result = year - BASE_YEAR + 1;
            builder.append(result)
                    .append(" ")
                    .append(BEFORE_CHRIST);
        } else {
            result = BASE_YEAR - year;
            builder.append(result)
                    .append(" ")
                    .append(AFTER_CHRIST);
        }

        return builder.toString();

    }

}
