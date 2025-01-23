import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double celcius = scanner.nextDouble();
        
        double farenheit = celcius * 1.8 + 32;

        System.out.println(farenheit);
    }
}