package rvt;
import java.util.Scanner;

public class averageofthreenumbers {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Ievadi otro skaitli: ");
        double nr2 = scanner.nextDouble();
        System.out.println("Ievadi treso skaitli: ");
        double nr3 = scanner.nextDouble();
        System.out.println("Videjais rezultats ir: " +  (nr1 + nr2 + nr3) / 3);
            
        }
        
        
        // var ari double bet tad tas bus ka decimalskaitlis
    }