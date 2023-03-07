package src.ex1;

public class Counter {
    public int counter;

    public Counter() {
        counter = 0;
    }
    public void increment(int num) {
        if (num >= 0) {
            counter += num;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(counter);
    }

    public int getCounter() {
        return Integer.valueOf(counter);
    }

}
