package rvt;

import java.util.Scanner;

public class numbers {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Ievadiet otro skaitli: ");
        double nr2 = scanner.nextDouble();
        System.out.println(nr1 + nr2  );
    }
}
