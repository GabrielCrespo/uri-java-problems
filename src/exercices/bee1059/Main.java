package exercices.bee1059;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        mostrarNumerosParesEntreIntervalo(1, 100);

    }

    private static void mostrarNumerosParesEntreIntervalo(int valorInicial, int valorFinal) {

        IntStream.range(valorInicial, valorFinal+1)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

    }

}
