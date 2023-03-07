package src.ex1;

public class CounterMax extends Counter {
    public int maxCounter;

    public CounterMax(int val) {
        super();
        maxCounter = val;
    }

    public void increment(int amount) {
        assert getCounter() + amount > maxCounter;
    }
}
