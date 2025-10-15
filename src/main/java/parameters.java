import java.util.Scanner;

public class parameters {
    public static void PrintUntilNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= number; i++){
            System.out.println(i);   
        }   
    }
    public static void main(String[] args) {
        PrintUntilNumber(5);
        System.out.println("------");
        PrintUntilNumber(3);
        
        
    }
}
