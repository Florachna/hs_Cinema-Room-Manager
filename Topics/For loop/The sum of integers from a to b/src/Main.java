import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            c += i;
        }
        System.out.println(c);
    }
}