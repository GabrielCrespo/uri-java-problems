package exercices.bee1096;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int i = 1, j = 7;

        for(int k = 0; k < 15; k++) {

            System.out.println("I=" + i + " " + "J=" + j);
            j--;

            if(j < 5) {
                j=7;
                i+=2;
            }

        }

    }
}
