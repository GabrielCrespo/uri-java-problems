package exercices.bee2172;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int mosterExpIncrease = scanner.nextInt();
        long monsterExp = scanner.nextLong();

        while (mosterExpIncrease > 0 && monsterExp > 0) {

            System.out.println(mosterExpIncrease*monsterExp);

            mosterExpIncrease = scanner.nextInt();
            monsterExp = scanner.nextLong();

        }

        scanner.close();

    }

}
