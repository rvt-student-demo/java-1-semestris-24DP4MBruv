package rvt;

import java.util.Scanner;

public class gradesandpoints {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points: ");
        int points = scanner.nextInt();
        String grade = "";

        if(points < 0) {
        grade = "Impossible";
        }
        else if (points <= 49) {
            grade = "Failed";
        }
        else if (points <= 59) {
            grade = "1";  
        }
        else if (points <= 69) {
            grade = "2";
        }
        else if (points <= 79) {
            grade = "3";
        }
        else if (points <= 89) {
            grade = "4";
        }
        else if (points <= 99) {
            grade = "5";
        }
        else if (points >= 100) {
            grade = "Incredible!";
        }
        System.out.println("Grade: " + grade );
        scanner.close();
    }
}
