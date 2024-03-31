package exercices.bee1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double monetaryValue = sc.nextDouble();

        int banknotesOf100 = (int) monetaryValue / 100;
        monetaryValue -= banknotesOf100 * 100;

        int banknotesOf50 = (int) monetaryValue / 50;
        monetaryValue -= banknotesOf50 * 50;

        int banknotesOf20 = (int) monetaryValue / 20;
        monetaryValue -= banknotesOf20 * 20;

        int banknotesOf10 = (int) monetaryValue / 10;
        monetaryValue -= banknotesOf10 * 10;

        int banknotesOf5 = (int) monetaryValue / 5;
        monetaryValue -= banknotesOf5 * 5;

        int banknotesOf2 = (int) monetaryValue / 2;
        monetaryValue -= banknotesOf2 * 2;

        int bankcoinsOf1 = (int) monetaryValue;
        monetaryValue -= bankcoinsOf1;

        int bankcoinsOf050 = (int) (monetaryValue * 2.0);
        monetaryValue -= bankcoinsOf050 / 2.0;

        int bankcoinsOf025 = (int) (monetaryValue * 4.0);
        monetaryValue -= bankcoinsOf025 / 4.0;

        int bankcoinsOf010 = (int) (monetaryValue * 10.0);
        monetaryValue -= bankcoinsOf010 / 10.0;

        int bankcoinsOf005 = (int) (monetaryValue * 20.0);
        monetaryValue -= bankcoinsOf005 / 20.0;

        int bankcoinsOf001 = (int) (monetaryValue * 100.0);


        System.out.println("NOTAS:");
        System.out.println(banknotesOf100 + " nota(s) de R$ 100.00");
        System.out.println(banknotesOf50 + " nota(s) de R$ 50.00");
        System.out.println(banknotesOf20 + " nota(s) de R$ 20.00");
        System.out.println(banknotesOf10 + " nota(s) de R$ 10.00");
        System.out.println(banknotesOf5 + " nota(s) de R$ 5.00");
        System.out.println(banknotesOf2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(bankcoinsOf1 + " moeda(s) de R$ 1.00");
        System.out.println(bankcoinsOf050 + " moeda(s) de R$ 0.50");
        System.out.println(bankcoinsOf025 + " moeda(s) de R$ 0.25");
        System.out.println(bankcoinsOf010 + " moeda(s) de R$ 0.10");
        System.out.println(bankcoinsOf005 + " moeda(s) de R$ 0.05");
        System.out.println(bankcoinsOf001 + " moeda(s) de R$ 0.01");

        sc.close();

    }
    
}
