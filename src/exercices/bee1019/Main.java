package exercices.bee1019;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        int duration = sc.nextInt();

        int hours = duration / 3600;
        duration -= hours * 3600;

        int minutes = duration / 60;
        duration -= minutes * 60;

        int seconds = duration;
    
        System.out.println(hours + ":" + minutes + ":" + seconds);

        sc.close();

    }
    
}
