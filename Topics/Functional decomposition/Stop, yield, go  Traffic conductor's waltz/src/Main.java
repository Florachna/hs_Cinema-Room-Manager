import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        int nextState;
        if (currentState == 2) {
            nextState = 0;
        } else {
            nextState = currentState + 1;
        }
        return String.valueOf(nextState);
    }

    public static String getAction(int currentState) {
        int nextState;
        if (currentState == 2) {
            nextState = 0;
        } else {
            nextState = currentState + 1;
        }

        return switch (nextState) {
            case 0 -> "Change to Red";
            case 1 -> "Change to Yellow";
            case 2 -> "Change to Green";
            default -> "Invalid state";
        };
    }
}