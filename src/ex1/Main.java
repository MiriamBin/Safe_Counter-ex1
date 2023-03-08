package src.ex1;
import java.util.Scanner;

/**
 * The program reads numbers from the user, adds them up and prints the sum.
 */
public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        int numOfNums = readNumber("Please enter the number of numbers you would like to enter");

        System.out.println("Please enter " + numOfNums + " values");

        for (int i = 0; i < numOfNums; i++) {
            int num = readNumber("Please enter a positive integer");
            counter.increment(num);
        }

        counter.print();
    }

    /**
     * Reads user input using a scanner and ensures that only positive integers are accepted.
     * @param msg the message to prompt the user for input
     * @return The positive integer entered by the user.
     */
    static int readNumber(String msg) {
        Scanner scanner = new Scanner(System.in);
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
