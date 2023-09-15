package exercices.bee1134;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int tipoCombustivel = 1;
        int quantidadeAlcool = 0, quantidadeGasolina = 0, quantidadeDiesel = 0;

        while (tipoCombustivel != 4) {

            tipoCombustivel = scanner.nextInt();

            while (tipoCombustivel < 1 || tipoCombustivel > 4) {
                tipoCombustivel = scanner.nextInt();
            }

            switch (tipoCombustivel) {
                case 1:
                    quantidadeAlcool++;
                    break;
                case 2:
                    quantidadeGasolina++;
                    break;
                case 3:
                    quantidadeDiesel++;
                    break;
                default:
                    break;
            }

        }

        imprimeMensagemParaClientes(quantidadeAlcool, quantidadeGasolina, quantidadeDiesel);
        scanner.close();
    }

    private static void imprimeMensagemParaClientes(int quantidadeAlcool, int quantidadeGasolina, int quantidadeDiesel) {
        StringBuilder builder = new StringBuilder();

        builder.append("MUITO OBRIGADO\n");
        builder.append("Alcool: ");
        builder.append(quantidadeAlcool);
        builder.append("\n");
        builder.append("Gasolina: ");
        builder.append(quantidadeGasolina);
        builder.append("\n");
        builder.append("Diesel: ");
        builder.append(quantidadeDiesel);

        System.out.println(builder);
    }

}

