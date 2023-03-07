package src.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();

        int numOfNum = scanner.nextInt();

        for (int i = 0; i < numOfNum; i++) {
            int num = scanner.nextInt();
            counter.increment(num);
        }

        System.out.println(counter.getCounter());
    }
}