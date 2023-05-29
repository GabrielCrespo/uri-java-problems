package exercices.bee1018;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int valueToBeDecomposed = sc.nextInt();
        int change = valueToBeDecomposed;

        int amountOfBanknotes100 = change / 100;
        change -= amountOfBanknotes100 * 100;

        int amountOfBanknotes50 = change / 50;
        change -= amountOfBanknotes50 * 50;

        int amountOfBanknotes20 = change / 20;
        change -= amountOfBanknotes20 * 20;

        int amountOfBanknotes10 = change / 10;
        change -= amountOfBanknotes10 * 10;

        int amountOfBanknotes5 = change / 5;
        change -= amountOfBanknotes5 * 5;

        int amountOfBanknotes2 = change / 2;
        change -= amountOfBanknotes2 * 2;

        int amountOfBanknotes1 = change / 1;
        change -= amountOfBanknotes1 * 1;

        System.out.println(valueToBeDecomposed);
        
        System.out.println(amountOfBanknotes100 + " nota(s) de R$ 100,00");
        System.out.println(amountOfBanknotes50 + " nota(s) de R$ 50,00");
        System.out.println(amountOfBanknotes20 + " nota(s) de R$ 20,00");
        System.out.println(amountOfBanknotes10 + " nota(s) de R$ 10,00");
        System.out.println(amountOfBanknotes5 + " nota(s) de R$ 5,00");
        System.out.println(amountOfBanknotes2 + " nota(s) de R$ 2,00");
        System.out.println(amountOfBanknotes1 + " nota(s) de R$ 1,00");


        sc.close();

    }
    
}
