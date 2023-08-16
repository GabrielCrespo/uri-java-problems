package exercices.bee1048;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final float FIRST_READJUSTMENT_PERCENTAGE = 15.0f;
    public static final float SECOND_READJUSTMENT_PERCENTAGE = 12.0f;
    public static final float THIRD_READJUSTMENT_PERCENTAGE = 10.0f;
    public static final float FOURTH_READJUSTMENT_PERCENTAGE = 7.0f;
    public static final float FIFTH_READJUSTMENT_PERCENTAGE = 4.0f;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float employeeSalary = scanner.nextFloat();
        float percentage = 0.0f;

        if(employeeSalary >= 0.0f && employeeSalary < 400.01) {
            percentage = FIRST_READJUSTMENT_PERCENTAGE;
        } else if (employeeSalary < 800.01f) {
            percentage = SECOND_READJUSTMENT_PERCENTAGE;
        } else if(employeeSalary < 1200.01f) {
            percentage = THIRD_READJUSTMENT_PERCENTAGE;
        } else if(employeeSalary < 2000.01) {
            percentage = FOURTH_READJUSTMENT_PERCENTAGE;
        } else {
            percentage = FIFTH_READJUSTMENT_PERCENTAGE;
        }

        float newEmployeeSalary = calculateNewSalary(employeeSalary, percentage);
        float gainReadjustment = newEmployeeSalary - employeeSalary;

        System.out.printf("Novo salario: %.2f\n", newEmployeeSalary);
        System.out.printf("Reajuste ganho: %.2f\n", gainReadjustment);
        System.out.printf("Em percentual: %d %%\n", (int) percentage);

        scanner.close();

    }

    private static float calculateGainReadjustment(float readjustmentPercentage) {
        return (1 + (readjustmentPercentage / 100.00f));
    }

    private static float calculateNewSalary(float salary, float readjustmentPercentage) {
        return salary * calculateGainReadjustment(readjustmentPercentage);
    }



}
