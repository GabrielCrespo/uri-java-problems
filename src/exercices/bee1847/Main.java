package exercices.bee1847;

import java.util.Scanner;

public class Main {

    public static final String HAPPY_FACE = ":)";
    public static final String SAD_FACE = ":(";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstTemperature    = scanner.nextInt();
        int secondTemperature   = scanner.nextInt();
        int thirdTemperature    = scanner.nextInt();


        if(isHappyPeopleByTemperature(firstTemperature, secondTemperature, thirdTemperature)) {
            System.out.println(HAPPY_FACE);
        } else {
            System.out.println(SAD_FACE);
        }

        scanner.close();

    }


    private static boolean isHappyPeopleByTemperature(int firstTemperature, int secondTemperature, int thirdTemperature) {

        int differenceBetweenFirstAndSecondTemperature = Math.abs(firstTemperature-secondTemperature);
        int differenceBetweenSecondAndThirdTemperature = Math.abs(secondTemperature-thirdTemperature);

        return (firstTemperature > secondTemperature && secondTemperature <= thirdTemperature)
                || (firstTemperature < secondTemperature && secondTemperature < thirdTemperature && differenceBetweenSecondAndThirdTemperature >= differenceBetweenFirstAndSecondTemperature)
                || (firstTemperature > secondTemperature && secondTemperature > thirdTemperature && differenceBetweenSecondAndThirdTemperature < differenceBetweenFirstAndSecondTemperature)
                || (firstTemperature == secondTemperature && secondTemperature < thirdTemperature);
    }


}
