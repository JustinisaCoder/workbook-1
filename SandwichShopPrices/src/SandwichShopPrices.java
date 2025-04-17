import java.util.Scanner;

public class SandwichShopPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sandwich size
        System.out.print("Enter sandwich size (1 = Regular, 2 = Large): ");
        int size = scanner.nextInt();

        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        // Ask about loaded option
        System.out.print("Would you like it loaded? (yes/no): ");
        scanner.nextLine(); // eat leftover newline
        String loadedResponse = scanner.nextLine().toLowerCase();

        if (loadedResponse.equals("yes")) {
            if (size == 1) {
                basePrice += 1.00;
            } else {
                basePrice += 1.75;
            }
        }

        // Get age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate discount
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        // Apply discount and show final price
        double finalPrice = basePrice * (1 - discount);
        System.out.printf("The final cost of your sandwich is $%.2f\n", finalPrice);
    }
}

