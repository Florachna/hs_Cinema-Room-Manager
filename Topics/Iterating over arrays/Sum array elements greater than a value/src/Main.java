import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in); // Create scanner to scan with
        int arraySize = scanner.nextInt(); // First number indicates array size
        int[] array = new int[arraySize]; // Create array with provided size
        int arraySum = 0;

        for (int i = 0; i < arraySize; i++) { // Add next chunk of integers to array
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt(); // Last number as comparison number

        for (int i = 0; i < arraySize; i++) { // Loop to calculate sum with conditions
            if (array[i] <= n) { // Compare current number in array to n, if lesser than continue to next number
                continue;
            }
            arraySum += array[i]; // Add numbers larger than n to the total sum
        }

        System.out.println(arraySum); // Print results
        scanner.close(); // Close scanner
    }
}