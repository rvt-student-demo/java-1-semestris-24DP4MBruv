package rvt;

import java.util.Scanner;

public class delikateses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = scanner.nextDouble();
        System.out.println("Ekspress piegade: (0 == ne, 1 == ja)");
        double expres = scanner.nextDouble();
        
       double piegade = 0.00;

       if(cena < 10){
        piegade = 2.00;
       }
       if(expres == 1){
        piegade += 3.00;
       }

       double kopa = cena + piegade;

        System.out.println("Rekins: ");

            System.out.println(prece + " " + cena);

            System.out.println("piegade " + piegade);

            System.out.println("Kopa " + kopa);

            scanner.close();
    }
}
