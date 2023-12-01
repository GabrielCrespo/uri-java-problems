package exercices.bee1564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        int complainNumber;

        while ((line = br.readLine()) != null) {

            complainNumber = Integer.parseInt(line);

            if(complainNumber == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }


        }


    }

}
