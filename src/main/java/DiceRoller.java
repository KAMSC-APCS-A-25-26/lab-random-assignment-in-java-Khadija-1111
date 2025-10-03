import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        Random noSeed1 = new Random();
        Random noSeed2 = new Random();
        Random noSeed3 = new Random();
        Random seed = new Random(17);
        // TODO: Generate random integers for dice rolls
        int rand1 = noSeed1.nextInt(7);
        int rand2 = noSeed2.nextInt(7);
        int rand3 = noSeed3.nextInt(7);
        int rand4 = seed.nextInt(7);
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        System.out.println("Unseeded Die 1: " + rand1);
        System.out.println("Unseeded Die 2: " + rand2);
        System.out.println("Unseeded Die 3: " + rand3);
        System.out.println("Seeded Die 1: " + rand4);
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
