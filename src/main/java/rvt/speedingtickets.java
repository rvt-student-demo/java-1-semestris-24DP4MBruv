package rvt;

import java.util.Scanner;

public class speedingtickets {
    public static void main(String[] args) {
        // Your code goes here...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed: ");
        int speed = scanner.nextInt();
        if (speed >= 120){
            System.out.println("Speeding ticket!!!");

        } else if (speed <= 40) {
            System.out.println("Drive faster pssy!!!");
        
        }else{
            System.out.println("Keep driving safe, well done!!!");
        }
        scanner.close();
    }
}
