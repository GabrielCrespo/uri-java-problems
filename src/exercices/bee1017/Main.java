package exercices.bee1017;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int tempoGastoViagem = sc.nextInt();
        int velocidadeMediaViagem = sc.nextInt();

        int distanciaViagem = velocidadeMediaViagem * tempoGastoViagem;

        float quantidadeDeLitrosGastos = distanciaViagem / 12.0F;

        System.out.println(String.format("%.3f", quantidadeDeLitrosGastos));

        sc.close();

    }
    
}
