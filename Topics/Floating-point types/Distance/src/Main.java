import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double cityDistance = scanner.nextInt();
        double busTravelTime = scanner.nextInt();

        double busSpeed = cityDistance / busTravelTime;

        System.out.println(busSpeed);
    }
}