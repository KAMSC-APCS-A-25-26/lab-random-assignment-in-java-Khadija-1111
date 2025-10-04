import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random seeded = new Random();
        Random unseeded = new Random(17);
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double rand1 = seeded.nextDouble();
        double rand2 = unseeded.nextDouble();
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        System.out.printf("%.2f%%\n", rand1 * 100);
        System.out.printf("%.2f%%\n", rand2 * 100);
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}