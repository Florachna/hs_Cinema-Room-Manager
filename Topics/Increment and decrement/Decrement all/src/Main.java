import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            --number;
            System.out.print(number);
            if (scanner.hasNextInt()) {
                System.out.print(' ');
            }
        }
    }
}