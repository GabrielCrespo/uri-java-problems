package exercices.bee1041;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String resposta = "";

        float coordenadaX = scanner.nextFloat();
        float coordenadaY = scanner.nextFloat();

        if(pontoEstaNaOrigem(coordenadaX, coordenadaY)) {
            resposta = "Origem";
        } else if (pontoEstaNoEixoX(coordenadaX, coordenadaY)) {
            resposta = "Eixo X";
        } else if (pontoEstaNoEixoY(coordenadaX, coordenadaY)) {
            resposta = "Eixo Y";
        } else if (pontoEstaNoPrimeiroQuadrante(coordenadaX, coordenadaY)) {
            resposta = "Q1";
        } else if (pontoEstaNoSegundoQuadrante(coordenadaX, coordenadaY)) {
            resposta = "Q2";
        } else if (pontoEstaNoTerceiroQuadrante(coordenadaX, coordenadaY)) {
            resposta = "Q3";
        } else if (pontoEstaNoQuartoQuadrante(coordenadaX, coordenadaY)) {
            resposta = "Q4";
        }

        System.out.println(resposta);

        scanner.close();

    }

    private static boolean pontoEstaNaOrigem(float x, float y) {
        return x == 0.0f && y == 0.0f;
    }
    private static boolean pontoEstaNoPrimeiroQuadrante(float x, float y) {
        return x > 0.0f && y > 0.0f;
    }
    private static boolean pontoEstaNoSegundoQuadrante(float x, float y) {
        return x < 0.0f && y > 0.0f;
    }
    private static boolean pontoEstaNoTerceiroQuadrante(float x, float y) {
        return x < 0.0f && y < 0.0f;
    }
    private static boolean pontoEstaNoQuartoQuadrante(float x, float y) {
        return x > 0.0f && y < 0.0f;
    }
    private static boolean pontoEstaNoEixoX(float x, float y) {
        return x != 0.0f && y == 0.0f;
    }

    private static boolean pontoEstaNoEixoY(float x, float y) {
        return x == 0.0f && y != 0.0f;
    }

}
