package exercices.bee1828;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String SHELDON_VICTORY_REACTION = "Bazinga!";
    public static final String SHELDON_DRAW_REACTION = "De novo!";
    public static final String SHELDON_DEFEAT_REACTION = "Raj trapaceou!";


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();
        String sheldonChoice;
        String rajChoice;

        for (int i = 0; i < numberOfTests; i++) {

            sheldonChoice = scanner.next();
            rajChoice = scanner.next();

            System.out.printf("Caso #%d: %s\n", i+1, getGameResult(sheldonChoice, rajChoice));

        }

        scanner.close();

    }

    public static String getGameResult(String sheldonChoice, String rajChoice) {

        if (sheldonChoice.equals(rajChoice)) {
            return SHELDON_DRAW_REACTION;
        }

        List<String> rockWinsList = List.of(GameOptions.LIZARD.getName(), GameOptions.SCISSOR.getName());
        List<String> paperWinsList = List.of(GameOptions.ROCK.getName(), GameOptions.SPOCK.getName());
        List<String> scissorWinsList = List.of(GameOptions.PAPER.getName(), GameOptions.LIZARD.getName());
        List<String> lizardWinsList = List.of(GameOptions.SPOCK.getName(), GameOptions.PAPER.getName());
        List<String> spockWinsList = List.of(GameOptions.SCISSOR.getName(), GameOptions.ROCK.getName());

        boolean sheldonWins = (GameOptions.ROCK.getName().equals(sheldonChoice) && rockWinsList.contains(rajChoice))
                || (GameOptions.PAPER.getName().equals(sheldonChoice) && paperWinsList.contains(rajChoice))
                || (GameOptions.SCISSOR.getName().equals(sheldonChoice) && scissorWinsList.contains(rajChoice))
                || (GameOptions.LIZARD.getName().equals(sheldonChoice) && lizardWinsList.contains(rajChoice))
                || (GameOptions.SPOCK.getName().equals(sheldonChoice) && spockWinsList.contains(rajChoice));

        if(sheldonWins) {
            return SHELDON_VICTORY_REACTION;
        }

        return SHELDON_DEFEAT_REACTION;

    }

    public enum GameOptions {
        ROCK("pedra"),
        PAPER("papel"),
        SCISSOR("tesoura"),
        LIZARD("lagarto"),
        SPOCK("Spock");

        final private String name;
        GameOptions(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

}
