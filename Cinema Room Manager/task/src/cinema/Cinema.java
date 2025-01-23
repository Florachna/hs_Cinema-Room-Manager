package cinema;

import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    static boolean[][] seatingArray = initializeSeating();
    final static int rowSize = seatingArray.length;
    final static int seatSize = seatingArray[0].length;

    static boolean[][] initializeSeating() {
        System.out.println("Enter the number of rows:");
        int rowAmount = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatAmount = scanner.nextInt();

        return new boolean[rowAmount][seatAmount];
    }

    public static void main(String[] args) {
        int menuChoice;
        do {
            menuChoice = runMenu();
            switch(menuChoice) {
                case 0:
                    scanner.close();
                    break;
                case 1:
                    displaySeats();
                    break;
                case 2:
                    buyTicket();
                    break;
                case 3:
                    displayStatistics();
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        } while (menuChoice != 0);
    }

    static int runMenu() {
        int menuChoice;
        while (true) {
            System.out.println("""
                \n1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
            menuChoice = scanner.nextInt();

            if (menuChoice < 0 || menuChoice > 3) {
                System.out.println("\nWrong input!");
                continue;
            }
            return menuChoice;
        }
    }

    static void displaySeats() {
        System.out.println("\nCinema:");
        for (int i = 0; i <= rowSize; i++) {
            if (i == 0) {
                for (int j = 0; j <= seatSize; j++) {
                    String headerState = j == 0 ? "  " : j + " ";
                    System.out.print(headerState);
                }
            } else {
                System.out.print("\n" + i);
                for (int j = 1; j <= seatSize; j++) {
                    String seatState = seatingArray[i - 1][j - 1] ? " B" : " S";
                    System.out.print(seatState);
                }
            }
        }
    }

    static void buyTicket() {
        int rowIndex, seatIndex;
        while (true) {
            System.out.println("Enter a row number:");
            rowIndex = scanner.nextInt() - 1;
            System.out.println("Enter a seat number in that row:");
            seatIndex = scanner.nextInt() - 1;

            if ((rowIndex < 0 || rowIndex >= rowSize) || (seatIndex < 0 || seatIndex >= seatSize)) {
                System.out.println("Wrong input!");
                continue;
            }
            if (seatingArray[rowIndex][seatIndex]) {
                System.out.println("That ticket has already been purchased!");
                continue;
            }
            break;
        }

        seatingArray[rowIndex][seatIndex] = true;
        int ticketPrice = calculateSeatPrice(rowIndex);

        System.out.println("\nTicket price: $" + ticketPrice);
    }

    static int calculateSeatPrice(int rowIndex) {
        int totalSeats = rowSize * seatSize;
        int frontRows = rowSize / 2;
        if (totalSeats <= 60 || rowIndex < frontRows) {
            return 10;
        } else {
            return 8;
        }
    }

    static void displayStatistics() {
        int totalSeats =  rowSize * seatSize;
        int frontRows = rowSize / 2;
        int backRows = rowSize - frontRows;
        int totalIncome = ((frontRows * seatSize) * 10) + ((backRows * seatSize) * 8);

        int ticketCount = 0, currentIncome = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < seatSize; j++) {
                if (seatingArray[i][j]) {
                    ticketCount += 1;
                    if (totalSeats <= 60 || i < frontRows) {
                        currentIncome += 10;
                    } else {
                        currentIncome += 8;
                    }
                }
            }
        }
        double boughtPercentage = ((double) ticketCount / totalSeats) * 100;

        System.out.printf("""
                \nNumber of purchased tickets: %d
                Percentage: %.2f%%
                Current income: $%d
                Total income: $%d""", ticketCount, boughtPercentage, currentIncome, totalIncome);
    }
}