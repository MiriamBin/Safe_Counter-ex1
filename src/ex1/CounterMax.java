package src.ex1;

/**
 * The CounterMax class extends the Counter class and implements the Printable interface to create a counter with
 * a maximum possible value.
 */
public class CounterMax extends Counter implements Printable{
    private final int maxCounter;

    /**
     * constructor
     * @param max The maximum possible value of the counter.
     */
    public CounterMax(int max) {
        super();
        maxCounter = max;
    }

    /**
     * print out the information about the counter and his max value
     */
    public void print(){
        System.out.println("Counter value: " + getCounter() + ", Max counter value: " + maxCounter);
    }

    /**
     * @param num The value added to the counter
     *
     */
    @Override
    public void increment(int num) {
        super.increment(num);
        if (getCounter() + num > maxCounter) {
            throw new RuntimeException("Counter value exceeds maximum value");
        }
    }
}
