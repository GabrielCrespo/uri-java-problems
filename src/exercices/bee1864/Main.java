package exercices.bee1864;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String QUOTATION = "LIFE IS NOT A PROBLEM TO BE SOLVED";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int nChars = scanner.nextInt();

        System.out.println(QUOTATION.substring(0, nChars));

        scanner.close();


    }

}
