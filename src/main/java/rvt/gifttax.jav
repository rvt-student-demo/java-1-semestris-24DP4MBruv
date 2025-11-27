package rvt;

import java.util.Scanner;

public class gifttax {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a gift value: ");
        double giftvalue = scanner.nextDouble();
        double value = 0;

        if (giftvalue >= 5000) {
            value = 100 + (giftvalue - 5000) * 0.08;
        }
        else if (giftvalue >= 25000) {
            value = 1700 + (giftvalue - 25000) * 0.10;    
        }
        else if (giftvalue >= 55000) {
            value = 4700 + (giftvalue - 55000) * 0.12;
        }
        else if (giftvalue >= 200000) {
            value = 22100 + (giftvalue - 200000) * 0.15;
        }
        else if (giftvalue >= 1000000) {
            value = 142100 + (giftvalue - 1000000) * 0.17;
        }
        System.out.println("The gift tax is: " + value);
        scanner.close();



    }
}
