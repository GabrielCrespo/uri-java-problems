package exercices.bee1097;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int i = 1, j = 7, valorAtualJ=j;

        for (int k = 0; k < 15; k++) {

            System.out.println("I=" + i + " " + "J=" + j);
            j--;

            if(j == valorAtualJ-3) {
                j+=5;
                i+=2;
                valorAtualJ=j;
            }

        }

    }

}
