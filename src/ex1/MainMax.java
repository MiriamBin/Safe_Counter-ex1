package src.ex1;
import static src.ex1.Main.readNumber;

/**
 * The program asks the user for a maximum number and the number of numbers he wishes to enter.
 * The program adds up the numbers until we have reached the number of numbers or until we have
 * passed the maximum number.
 */
public class MainMax {
    public static void main(String[] args) {

        int max = readNumber("Please enter the max value");
        int numOfNums = readNumber("Please enter the number of numbers you would like to enter");
        CounterMax counter = new CounterMax(max);

        System.out.println("Please enter " + numOfNums + " values");

        // Reading values from the user and summing them
        for (int i = 0; i < numOfNums; i++) {
            int num = readNumber("Please enter a positive integer");
            try {
                counter.increment(num);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }

        counter.print();
    }

}
