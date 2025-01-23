import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in); // Create scanner to retrieve input from user
        int arraySize = scanner.nextInt();// First input indicates array size
        int[] array = new int[arraySize]; // Create array using provided input
        int maxProduct = 0; // Used to store the largest product result

        for (int i = 0; i < arraySize; i++) { // Remaining inputs are added to array
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < (arraySize - 1); i++) { // Checks the product of two adjacent numbers
            int product = array[i] * array[i + 1]; // Temporarily store the current product
            if (product > maxProduct) { // Compare with the current largest product, if bigger replace the old value
                maxProduct = product;
            }
        }

        System.out.println(maxProduct); // Print the result
        scanner.close(); // Close the scanner
    }
}