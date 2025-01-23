import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in); // Create scanner to retrieve input from user
        int arrayLength = scanner.nextInt(); // Assign first integer as array length
        int[] array = new int[arrayLength]; // Create array with provided length
        boolean isSorted = true; // Assume array is sorted, changed when found incorrect

        for (int i = 0; i < arrayLength; i++) { // Add remaining integers that fit into the array
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < (arrayLength - 1); i++) { // Check array if it's sorted by ascending order.
            if (array[i + 1] < array[i]) { // If unsorted, mark as unsorted and break
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted); // Print results of check
        scanner.close(); // Close scanner
    }
}