package exercices.bee2061;

import java.util.Scanner;

public class Main {

    public static final String FECHOU = "fechou";
    public static final String CLICOU = "clicou";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialNumberOfTabs = scanner.nextInt();
        int numberOfActions = scanner.nextInt();

        int finalNumberOfTabs = initialNumberOfTabs;

        for (int i = 0; i < numberOfActions; i++) {

            String action = scanner.next();

            if (FECHOU.equals(action)) {
                finalNumberOfTabs+=1;
            }

            if (CLICOU.equals(action)) {
                finalNumberOfTabs-=1;
            }

        }

        System.out.println(finalNumberOfTabs);

        scanner.close();

    }

}
