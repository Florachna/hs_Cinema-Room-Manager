import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int remainderByTwo = input % 2;
        System.out.println(remainderByTwo);
        // The second operation goes here
        int multiplyByThree = remainderByTwo * 3;
        System.out.println(multiplyByThree);


        scanner.close();
    }
}