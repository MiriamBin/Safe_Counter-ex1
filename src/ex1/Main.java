package src.ex1;
import java.util.Scanner;

/**
 * The program reads numbers from the user, adds them up and prints the sum.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();
        int numOfNums = readNumber(scanner);

        System.out.println("Please enter " + numOfNums + " values");

        for (int i = 0; i < numOfNums; i++) {
            int num = scanner.nextInt();
            counter.increment(num);
        }

        counter.print();
    }

    /**
     * Reads user input using a scanner and ensures that only positive integers are accepted.
     * @param scanner The scanner object used to read user input.
     * @return The positive integer entered by the user.
     */
    public static int readNumber(Scanner scanner){
        int num;
        do {
            System.out.print("Please enter a positive integer: ");

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
