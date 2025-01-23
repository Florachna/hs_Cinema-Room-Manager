import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int bridgeAmount = scanner.nextInt();

        for (int i = 1;; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.printf("Will crash on bridge %d\n", i);
                break;
            } else if (!scanner.hasNextInt()) {
                System.out.println("Will not crash");
                break;
            }
        }
    }
}