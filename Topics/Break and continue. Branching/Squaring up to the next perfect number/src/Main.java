import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        // Your code to find the first perfect square greater than N goes here
        // Use a loop and the break statement when you find the answer

        // Print the result here
        for (int i = N + 1;;i++) {
            int squareRoot = (int) Math.sqrt(i);
            int checkPerfectSquare = squareRoot * squareRoot;
            if (checkPerfectSquare == i) {
                System.out.println(checkPerfectSquare);
                break;
            }
        }
    }
}