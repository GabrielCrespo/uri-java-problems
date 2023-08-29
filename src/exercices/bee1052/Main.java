package exercices.bee1052;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMes = scanner.nextInt();

        String nomeMes = Mes.getNomePorCodigo(numeroMes).getNome();
        System.out.println(nomeMes);

        scanner.close();


    }

    public enum Mes {
        JANUARY(1, "January"),
        FEBRUARY(2, "February"),
        MARCH(3, "March"),
        APRIL(4,"April"),
        MAY(5, "May"),
        JUNE(6, "June"),
        JULY(7, "July"),
        AUGUST(8, "August"),
        SEPTEMBER(9, "September"),
        OCTOBER(10, "October"),
        NOVEMBER(11, "November"),
        DECEMBER(12, "December");

        int codigo;
        String nome;

        Mes(int codigo, String nome) {
            this.codigo = codigo;
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public static Mes getNomePorCodigo(int codigo) {
            for(Mes mes : values()) {
                if(mes.codigo == codigo) {
                    return mes;
                }
            }
            return null;
        }
    }
}
