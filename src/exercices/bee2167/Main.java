package exercices.bee2167;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSpeedMeasures = scanner.nextInt();

        int[] rpms = new int[numberOfSpeedMeasures];
        int index = 0;

        for (int i = 0; i < rpms.length; i++) {
            rpms[i] = scanner.nextInt();
        }

        for (int i = 0; i < rpms.length-1; i++) {
            if (rpms[i] > rpms[i+1]) {
                index = i+2;
                break;
            }
        }

        System.out.println(index);

        scanner.close();

    }

}
