package rvt;

public class Statistics {
    private int count;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Statistics s = new Statistics();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();
        s.addNumber();

        System.out.println("Count: " + s.getCount());
    }
}

