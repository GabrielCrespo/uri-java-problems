package exercices.bee1789;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int caseTests, actualFaster, faster=0;

        while (scanner.hasNextInt()) {

            caseTests = scanner.nextInt();

            for (int i = 0; i < caseTests; i++) {

                actualFaster = scanner.nextInt();

                if(actualFaster > faster)
                    faster = actualFaster;

            }

            System.out.println(defineSlugGroupBySpeed(faster));
            faster = 0;

        }

    }

    private static int defineSlugGroupBySpeed(int speed) {
        if(speed < 10) return 1;
        if(speed < 20) return 2;

        return 3;
    }

}
