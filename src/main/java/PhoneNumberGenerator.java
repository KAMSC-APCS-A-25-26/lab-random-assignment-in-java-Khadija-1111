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
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int num4 = rand.nextInt(8);
        int num5 = rand.nextInt(5);
        int num6 = rand.nextInt(3);
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int num7 = rand.nextInt(10);
        int num8 = rand.nextInt(10);
        int num9 = rand.nextInt(10);
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.println(num1 + num2 + num3 + "-" + num4 + num5 + num6 + "-" + num7 + num8 + num9);
    }
}
