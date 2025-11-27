package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bob's Discount Bolts");
        System.out.println("0.05 centi par skruvi");
        System.out.println("0.03 centi par uzgriezni");
        System.out.println("0.01 centi par paplaksni");

        final int skruvjucena = 5; 
        final int uzgrieznuprece = 3; 
        final int paplaksnescena = 1;

        System.out.println("Ievadiet skruvju daudzumu: ");
        double skruves = scanner.nextDouble();
        System.out.println("Ievadiet uzgrieznu daudzumu: ");
        double uzgriezni = scanner.nextDouble();
        System.out.println("Ievadiet paplaksnu daudzumu: ");
        double paplaksnes = scanner.nextDouble();

        double total = (skruves * 0.05 + uzgriezni * 0.03 + paplaksnes * 0.01);

        boolean error = false;
        if(uzgriezni < skruves){
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            error = true;
        }

        if(paplaksnes < 2 * skruves){
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            error = true;
        }

        if(!error){
            System.out.println("Pasutijums ir kartiba");
        }

        System.out.println("Kopeja cena: " + total);
        scanner.close();
    }
}
