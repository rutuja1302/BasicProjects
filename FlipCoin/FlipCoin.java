import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int tail = 0;  // Initialize counter for tails
        int head = 0;  // Initialize counter for heads

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coin flips: ");
        int numFlips = input.nextInt();

        if (numFlips > 0) {
            for (int i = 0; i < numFlips; i++) {
                double randomValue = Math.random();   // Generates random value between 0 and 1
                if (randomValue < 0.5) {
                    tail++;  // Increment tail counter
                } else {
                    head++;  // Increment head counter
                }
            }

            double percentHead = (head / (double) numFlips) * 100;  // Calculate percentage of heads
            double percentTail = (tail / (double) numFlips) * 100;  // Calculate percentage of tails

            System.out.println("Probability of heads: " + percentHead + "%");
            System.out.println("Probability of tails: " + percentTail + "%");
        } else {
            System.out.println("Invalid number of coin flips. Please enter a positive integer.");
        }
    }
}
