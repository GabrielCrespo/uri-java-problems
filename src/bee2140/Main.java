package bee2140;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<Integer> complements = List.of(2, 5, 20, 10, 50, 100);

        int purchaseValue = scanner.nextInt();
        int amountPaid = scanner.nextInt();

        while (purchaseValue != 0 && amountPaid != 0) {

            boolean isPossible = false;

            int change = amountPaid - purchaseValue;

            for (int i = 0; i < complements.size(); i++) {

                int complement = change - complements.get(i);

                if (complements.contains(complement)) {
                    isPossible = true;
                    break;
                }

            }

            String result = isPossible ? "possible" : "impossible";
            System.out.println(result);

            purchaseValue = scanner.nextInt();
            amountPaid = scanner.nextInt();

        }


        scanner.close();

    }

}
