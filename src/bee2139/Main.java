package bee2139;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static final String CHRISTMAS_DATE = "25/12/2016";
    public static final int YEAR = 2016;
    public static final DateTimeFormatter DFT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int month = scanner.nextInt();
            int day = scanner.nextInt();

            String actualDate = formatDate(day, month);

            long days = getDaysBetweenDates(actualDate, CHRISTMAS_DATE);
            String answer = getAnswer(days);

            System.out.println(answer);

        }

        scanner.close();

    }

    private static long getDaysBetweenDates(String date1, String date2) {

        try {
            LocalDate d1 = LocalDate.parse(date1, DFT);
            LocalDate d2 = LocalDate.parse(date2, DFT);

            return d1.datesUntil(d2).count();
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    private static String getAnswer(long days) {

        if (days == 0) {
            return "E natal!";
        } else if (days == 1) {
            return "E vespera de natal!";
        } else if (days == -1) {
            return "Ja passou!";
        }

        return String.format("Faltam %d dias para o natal!", days);

    }

    private static String formatDate(int day, int month) {

        if (day < 10 && month < 10) {
            return String.format("0%d/0%d/%d", day, month, YEAR);
        } else if (day < 10) {
            return String.format("0%d/%d/%d", day, month, YEAR);
        } else if (month < 10) {
            return String.format("%d/0%d/%d", day, month, YEAR);
        }

        return String.format("%d/%d/%d", day, month, YEAR);

    }


}
