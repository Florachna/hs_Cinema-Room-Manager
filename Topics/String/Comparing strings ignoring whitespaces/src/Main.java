import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        string1 = string1.replaceAll(" ", "");
        string2 = string2.replaceAll(" ", "");

        System.out.println(string1.equals(string2));
    }
}