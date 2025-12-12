package rvt;
import java.util.Scanner;

public class skaitli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitīvu skaitli (0 vai negatīvs skaitlis pārtrauc ievadi): ");
            int input = scanner.nextInt();

            if (input <= 0) {
                break; 
            }

            count++;
            sum += input;

            if (input > max) {
                max = input;
            }
            if (input < min) {
                min = input;
            }
        }

        System.out.println();

        if (count == 0) {
            System.out.println("Netika ievadīts neviens pozitīvs skaitlis!");
        } else {
            double average = (double) sum / count;

            System.out.println("Ievadīto skaitļu skaits: " + count);
            System.out.println("Skaitļu summa: " + sum);
            System.out.println("Vidējā vērtība: " + average);
            System.out.println("Lielākais skaitlis: " + max);
            System.out.println("Mazākais skaitlis: " + min);
        }

        scanner.close();
    }
}

