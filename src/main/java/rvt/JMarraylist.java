package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMarraylist {
    public static void main(String[] args) {
        OnlyTheseNumbers();
        ListSize();
        
    }
    
    public static void OnlyTheseNumbers() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num_List = new ArrayList<Integer>();

        while (true) {

        System.out.println("Ievadi skaitli: ");
        int number = scanner.nextInt();
        
        if (number == -1) {
            break;
    }   
        num_List.add(number);
    }
        System.out.println("Ievadi sakuma indeksu: ");
        int startindex = scanner.nextInt();

        System.out.println("Ievadi beigu indeksu: ");
        int endindex = scanner.nextInt();

        System.out.println("nummuri noteikta radiusa ir: ");
        for(int i = startindex; i <= endindex; i++) {
        System.out.println(num_List.get(i));
    }
        scanner.close();
}
    public static void ListSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name_List = new ArrayList<String>();
        int summ = 0;

        while (true) {
            
        System.out.println("Ievadiet vardus: ");
        String names = scanner.nextLine();
        

        if (names.isEmpty()) {
            break; 
        }
        

        name_List.add(names);

        

        System.out.println("Kopīgais ir: "+ summ);


    }



        
    }
}

    
