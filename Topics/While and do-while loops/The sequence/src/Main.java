import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numOfElements = scanner.nextInt();
        int divisibleBy4 = 0;

        int loopIteration = 0;
        while (loopIteration < numOfElements) {
            int numCheck = scanner.nextInt();
            if (numCheck % 4 == 0) {
                divisibleBy4 = Math.max(numCheck, divisibleBy4);
            }
            loopIteration++;
        }
        System.out.println(divisibleBy4);
    }
}