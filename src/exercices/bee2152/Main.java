package exercices.bee2152;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final int DOOR_OPENED = 1;
    private static final String MSG_DOOR_OPENED = "A porta abriu!";
    private static final int DOOR_CLOSED = 0;
    private static final String MSG_DOOR_CLOSED = "A porta fechou!";


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int hour = 0;
        int minute = 0;
        int occurrence = 0;

        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {

            hour = scanner.nextInt();
            minute = scanner.nextInt();
            occurrence = scanner.nextInt();

            String answer = getFormatedOcurrenceTime(hour, minute, occurrence);

            System.out.println(answer);

        }

        scanner.close();

    }

    private static String getFormatedOcurrenceTime(int hour, int minute, int ocurrence) {

        StringBuilder builder = new StringBuilder();

        if (hour < 10) {
            builder.append("0");
            builder.append(hour);
        } else {
            builder.append(hour);
        }

        builder.append(":");

        if (minute < 10) {
            builder.append("0");
            builder.append(minute);
        } else {
            builder.append(minute);
        }

        builder.append(" - ");

        if (ocurrence == DOOR_OPENED) {
            builder.append(MSG_DOOR_OPENED);
        }

        if (ocurrence == DOOR_CLOSED) {
            builder.append(MSG_DOOR_CLOSED);
        }

        return builder.toString();
    }

}
