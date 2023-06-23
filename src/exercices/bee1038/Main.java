package exercices.bee1038;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        double price = getPrice(code);

        System.out.printf("Total: R$ %.2f\n", calculateCheckValueToPay(quantity, price));

        sc.close();

    }

    public static double calculateCheckValueToPay(int quantity, double value) {
        return quantity * value;
    }

    public static double getPrice(int code) {

        double price = 0.0;

        switch (code) {

            case 1:
                price = 4.0;
                break;
            case 2:
                price = 4.5;
                break;
            case 3:
                price = 5.0;
                break;
            case 4:
                price = 2.0;
                break;
            case 5:
                price = 1.5;
                break;
            default:
                break;
        }
        return price;
    }
}
