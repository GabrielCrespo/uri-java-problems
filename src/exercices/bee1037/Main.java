package exercices.bee1037;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double number = sc.nextDouble();
        System.out.println(findInterval(number));

        sc.close();

    }
    private static String findInterval(double number) {

        String result = "";

        if(number >= 0 && number <= 25) {
            result = "Intervalo [0,25]";
        } else if (number > 25 && number <= 50) {
            result = "Intervalo (25,50]";
        } else if (number > 50 && number <= 75) {
            result = "Intervalo (50,75]";
        } else if (number > 75 && number <= 100) {
            result = "Intervalo (75,100]";
        } else {
            result = "Fora de intervalo";
        }

        return result;

    }
}
