import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        String isPositive = (num > 0) ? "YES" : "NO";

        System.out.println(isPositive);
    }
}