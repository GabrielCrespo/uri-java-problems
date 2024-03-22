package exercices.bee1933;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int firstCard = scanner.nextInt();
        int secondCard = scanner.nextInt();

        int answer = getCardToWinTheGame(firstCard, secondCard);

        System.out.println(answer);

        scanner.close();


    }

    private static int getCardToWinTheGame(int firstCard, int secondCard) {

        if(firstCard == secondCard || firstCard > secondCard) {
           return firstCard;
        } else {
            return secondCard;
        }

    }

}
