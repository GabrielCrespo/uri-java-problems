package exercices.bee2235;

import java.util.Scanner;

public class Main {

    public static final char SIM = 'S';
    public static final char NAO = 'N';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstCredit = scanner.nextInt();
        int secondCredit = scanner.nextInt();
        int thirdCredit = scanner.nextInt();

        char answer = isPossibleToReturnToPresent(firstCredit, secondCredit, thirdCredit) ? SIM : NAO;
        System.out.println(answer);

        scanner.close();

    }

    private static boolean isPossibleToReturnToPresent(int firstCredit, int secondCredit, int thirdCredit) {
        return (firstCredit == secondCredit) || (firstCredit == thirdCredit) || (secondCredit == thirdCredit)
                || (firstCredit + secondCredit == thirdCredit) || (firstCredit + thirdCredit == secondCredit)
                || (secondCredit + thirdCredit == firstCredit);
    }

}
