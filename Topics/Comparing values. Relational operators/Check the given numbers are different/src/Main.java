import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        boolean isDifferent = (numberOne != numberTwo) && (numberTwo != numberThree) && (numberOne != numberThree) ;
        System.out.println(isDifferent);
    }
}