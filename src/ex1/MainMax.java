package src.ex1;
import java.util.Scanner;

/**
 * The program asks the user for a maximum number and the number of numbers he wishes to enter.
 * The program adds up the numbers until we have reached the number of numbers or until we have
 * passed the maximum number.
 */
public class MainMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = readNumber(scanner, "Please enter the max value");
        int numOfNums = readNumber(scanner,"Please enter the number of numbers you would like to enter");
        CounterMax counter = new CounterMax(max);

        System.out.println("Please enter " + numOfNums + " values");

        // Reading values from the user and summing them
        for (int i = 0; i < numOfNums; i++) {
            int num = scanner.nextInt();
            try {
                counter.increment(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        counter.print();
    }

    /**
     * Reads user input using a scanner and ensures that only positive integers are accepted.
     * @param scanner The scanner object used to read user input.
     * @param msg the message to prompt the user for input
     * @return The positive integer entered by the user.
     */
    public static int readNumber(Scanner scanner, String msg){
        int num;
        do {
            System.out.print(msg + ": ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Input is not a number.");
                scanner.next();
            }
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Error: Input must be a positive integer.");
            }
        } while (num <= 0);

        return num;
    }

}
