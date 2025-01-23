import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the first integer
        int num1 = scan.nextInt();

        // Read the second integer
        int num2 = scan.nextInt();

        // TODO: Perform addition, multiplication, and division operations
        int add = num1 + num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(add);
        System.out.println(mult);
        System.out.println(div);
    }
}