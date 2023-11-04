package exercices.bee1150;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int x = scanner.nextInt();
        int z = scanner.nextInt();

        while (z <= x) {
            z = scanner.nextInt();
        }

        for (int i = x; i < z; i++) {

            soma += i;
            contador++;

            if(soma > z){
                break;
            }
        }

        System.out.println(contador);
        scanner.close();

    }

}
