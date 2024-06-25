package exercices.bee2221;

import java.util.Scanner;

public class Main {

    public static final String DABRIEL = "Dabriel";
    public static final String GUARTE = "Guarte";
    public static final String DRAW = "Empate";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int instance = scanner.nextInt();
        int bonus;

        int dabrielPokemonAttack, dabrielPokemonDefense, dabrielLevel, dabrielPokemonKnockValue;
        int guartePokemonAttack, guartePokemonDefense, guarteLevel, guartePokemonKnockValue;

        for (int i = 0; i < instance; i++) {

            bonus = scanner.nextInt();

            dabrielPokemonAttack = scanner.nextInt();
            dabrielPokemonDefense = scanner.nextInt();
            dabrielLevel = scanner.nextInt();

            guartePokemonAttack = scanner.nextInt();
            guartePokemonDefense = scanner.nextInt();
            guarteLevel = scanner.nextInt();

            dabrielPokemonKnockValue = isCoachLevelEven(dabrielLevel)
                    ? getKnockValueWithBonus(dabrielPokemonAttack, dabrielPokemonDefense, bonus)
                    : getKnockValueWithoutBonus(dabrielPokemonAttack, dabrielPokemonDefense);

            guartePokemonKnockValue = isCoachLevelEven(guarteLevel)
                    ? getKnockValueWithBonus(guartePokemonAttack, guartePokemonDefense, bonus)
                    : getKnockValueWithoutBonus(guartePokemonAttack, guartePokemonDefense);

            String battleResult = getBattleResult(dabrielPokemonKnockValue, guartePokemonKnockValue);

            System.out.println(battleResult);

        }

        scanner.close();

    }

    private static String getBattleResult(int dabrielPokemonKnockValue, int guartePokemonKnockValue) {

        if (dabrielPokemonKnockValue > guartePokemonKnockValue)
            return DABRIEL;

        if (guartePokemonKnockValue > dabrielPokemonKnockValue)
            return GUARTE;

        return DRAW;

    }

    private static int getKnockValueWithBonus(int attack, int defense, int bonus) {
        return ((attack + defense) / 2) + bonus;
    }

    private static int getKnockValueWithoutBonus(int attack, int defense) {
        return ((attack + defense) / 2);
    }

    private static boolean isCoachLevelEven(int level) {
        return level % 2 == 0;
    }

}
