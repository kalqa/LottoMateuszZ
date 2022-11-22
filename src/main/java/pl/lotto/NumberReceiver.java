package pl.lotto;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

class NumberReceiver implements NumberReceivable {

    @Override
    public Set<Integer> receiveNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        Set<Integer> userNumbers = new HashSet<>();
//        Set<Integer> userNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            displayReceiveSixNumbersFromUserMessage();
            while (true) {
                try {
                    number = scanner.nextInt();
                    userNumbers.add(number);
//                    userNumbers[i] = number;
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("This is not a number. Please try again.");
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("This is not a number. Please try again.");
                    scanner.nextLine();
                    break;
                }
            }
        }
        return userNumbers;
    }

    private void displayReceiveSixNumbersFromUserMessage() {
        System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
    }
}
