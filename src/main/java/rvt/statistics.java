package rvt;

public class statistics {
    private int count;

    public statistics() {
        this.count = 0;
    }

    public void addNumber() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public static void main(String[] args) {
        statistics s = new statistics();
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

