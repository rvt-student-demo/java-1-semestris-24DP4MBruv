package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMarraylist {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        OnlyTheseNumbers();
        ListSize();
        OnTheList();

    
        ArrayList<String> demo = new ArrayList<>();
        demo.add("First");
        demo.add("Second");
        demo.add("Third");

        System.out.println("Before removeLast: " + demo);
        removeLast(demo);
        System.out.println("After removeLast: " + demo);
    }
   
    public static void OnlyTheseNumbers() {
        ArrayList<Integer> num_List = new ArrayList<>();

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

        System.out.println("Numuri noteikta radiusa ir:");
        for (int i = startindex; i <= endindex; i++) {
            System.out.println(num_List.get(i));
        }

        scanner.nextLine();
    }

    public static void ListSize() {
        ArrayList<String> name_List = new ArrayList<>();

        while (true) {
            System.out.println("Ievadiet vardus: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            name_List.add(name);
            System.out.println("Kopigais ir: " + name_List.size());
        }
    }

    public static void OnTheList() {
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Ievadi vardu sarakstam (tukss = stop): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        System.out.println("Search for:");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return;
        }

        strings.remove(strings.size() - 1);
    }
    public static void removeLastTest() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
}
}
