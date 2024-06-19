package exercices.bee2176;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.next();

        String messageWithParityBit = insertParityBitOnMessage(message);

        System.out.println(messageWithParityBit);

        scanner.close();

    }

    private static String insertParityBitOnMessage(String message) {

        StringBuilder newMessage = new StringBuilder(message);
        int quantityOfOnes = 0;

        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) == '1')
                quantityOfOnes++;

        }

        if (quantityOfOnes % 2 != 0)
           return newMessage.append("1").toString();


        return newMessage.append("0").toString();

    }

}
