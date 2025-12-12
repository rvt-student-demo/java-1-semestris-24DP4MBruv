package rvt;

public class OverloadedCounter {
    
    private int value;

    public OverloadedCounter(int startValue) {
        this.value = startValue;
    }

    public OverloadedCounter() {
        this(0); 
    }


    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;

    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
}