package ex1;
import java.util.Scanner;

/**
 * The program asks the user for the number of numbers he wishes to enter.
 * The program adds up the numbers until we have reached the number of numbers.
 */
public class Main {
    /**
     * The main method of the program.
     * @param args not used
     */
    public static void main(String[] args) {

        Counter counter = new Counter();            // Counter object
        Scanner scanner = new Scanner(System.in);   // Scanner for input from user

        System.out.print("Please enter the number of numbers you would like to enter: ");
        int numOfNums = readNumber(scanner);

        System.out.printf("Please enter %d positive integer values: ", numOfNums);
        // Reading values from the user and summing them
        for (int i = 0; i < numOfNums; i++) {
            int num = readNumber(scanner);
            counter.increment(num);
        }
        counter.print();
    }

    /**
     * Reads user input using a scanner and ensures that only positive integers are accepted.
     * @param scanner for reading input from the user and check is validation
     * @return The positive integer entered by the user.
     */
    public static int readNumber(Scanner scanner) {

        int num;
        do {
            while (!scanner.hasNextInt()) {
                System.err.println("Error: Input is not an integer.");
                scanner.next();
            }

            num = scanner.nextInt();

            if (num <= 0) {
                System.err.println("Error: Input must be a positive integer.");
            }
        } while (num <= 0);

        return num;
    }
}
