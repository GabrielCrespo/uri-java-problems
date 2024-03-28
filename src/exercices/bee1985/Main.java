package exercices.bee1985;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Products, Double> productsPrice = getProductsPrice();

        Scanner scanner = new Scanner(System.in);

        double result = 0.0;

        int numberOfBoughtProducts = scanner.nextInt();

        for (int i = 0; i < numberOfBoughtProducts; i++) {

            long product = scanner.nextLong();
            int quantity = scanner.nextInt();

            double price = productsPrice.get(Products.getProduct(product));

            result += (price * quantity);


        }

        System.out.printf("%.2f\n", result);

        scanner.close();

    }

    public static Map<Products, Double> getProductsPrice() {
        return Map.of(Products._1001, 1.50, Products._1002, 2.50, Products._1003, 3.50,
                Products._1004, 4.50, Products._1005, 5.50);
    }

    public enum Products {
        _1001(1001),
        _1002(1002),
        _1003(1003),
        _1004(1004),
        _1005(1005);

        final long code;

        Products(long code) {
            this.code = code;
        }

        public static Products getProduct(long code) {
            return Arrays.stream(Products.values())
                    .filter(product -> product.code == code)
                    .findFirst()
                    .orElse(null);

        }
    }

}
