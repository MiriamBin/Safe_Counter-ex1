package ex1;

/**
 * A class that represents a simple counter with increment functionality.
 */
public class Counter implements Printable{
    /**
     * The value of the counter.
     */
    private int counter;

    /**
     * constructor
     * Initializes the counter to 0
     */
    public Counter() {
        counter = 0;
    }

    /**
     * print out the information about the counter
     */
    public void print(){
        System.out.println("Counter value: " + counter);
    }

    /**
     * Increases the value of the counter by num.
     * Only positive values can be added.
     * @param num The value added to the counter
     */
    public void increment(int num) {
        if (num >= 0) {
            counter += num;
        }
    }

    /**
     * getter
     * @return the counter value
     */
    public int getCounter() {
        return counter;
    }

    /**
     * override the toString method
     * @return the counter value as a string
     */
    @Override
    public String toString() {
        return Integer.toString(counter);
    }

}
