import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int butterCupAmount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean groundhogSuccess = isWeekend
                ? (butterCupAmount >= 15 && butterCupAmount <= 25)
                : (butterCupAmount >= 10 && butterCupAmount <= 20);

        /*if (isWeekend) {
            groundhogSuccess = (butterCupAmount >= 15) && (butterCupAmount <= 25);
        } else {
            groundhogSuccess = (butterCupAmount >= 10) && (butterCupAmount <= 20);
        }*/
        System.out.println(groundhogSuccess);
    }
}