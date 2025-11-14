package rvt;

public class statistics {
    private int count;

public statistics() {
    this.count = 0;
}
public void addNumber(int number) {
    this.count++;
}
public int getCount() {
    return this.count;
}
public static void main(String[] args) {
    statistics s = new statistics();

        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);
        s.addNumber(0);

    System.out.println("Count: " + s.getCount());    
   }
}

