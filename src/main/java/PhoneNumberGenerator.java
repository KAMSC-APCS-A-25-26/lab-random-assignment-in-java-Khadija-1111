import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int num1 = rand.nextInt(8);
        int num2 = rand.nextInt(8);
        int num3 = rand.nextInt(8);
        int firstThree = num1 * 100 + num2 * 10 + num3;
        // TODO: Generate second three digits (XXX) 
        int secondThree = rand.nextInt(743);
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int lastThree = rand.nextInt(1000);
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.printf("%03d-%03d-%03d\n", firstThree, secondThree, lastThree);
    }
}
