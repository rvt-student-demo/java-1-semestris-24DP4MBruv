package rvt;

import java.util.Scanner;

public class grading {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points: ");
        int points = scanner.nextInt();
        int grade = 0;

        if(points < 0) {
        System.out.println("Impossible");
        
        if (points <= 49) 
            System.out.println("Failed"); 
        
        if (points <= 59) 
            System.out.println("1");    
        
        if (points <= 69) 
            System.out.println("2");
        
        if (points <= 79) 
            System.out.println("3"); 
        
        if (points <= 89) 
            System.out.println("4");
        
        if (points <= 99) 
            System.out.println("5");
        
        if (points >= 100) 
            System.out.println("Incedible!");
        }
        System.out.println("Grade: "  );
        scanner.close();
    }
}
