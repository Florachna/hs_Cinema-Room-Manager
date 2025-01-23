import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int year = scanner.nextInt();
        boolean divisibleBy4 = (year % 4) == 0;
        boolean divisibleCheck = ((year % 100) != 0) || ((year % 400) == 0);

        System.out.println((divisibleBy4 && divisibleCheck) ? "Leap" : "Regular");
    }
}