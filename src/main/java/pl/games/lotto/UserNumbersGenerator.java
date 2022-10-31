package pl.games.lotto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static pl.games.lotto.Main.validateNumberInGivenRange;

public class UserNumbersGenerator {

    List<Integer> getUserNumbers(ArrayList<Integer> list) {
        int number;
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
            while (true) {
                try {
                    number = scanner.nextInt();
                    if (validateNumberInGivenRange(number)) {
                        userNumbers.add(number);
                        break;
                    } else {
                        System.out.println(number + " is not between 1 and 99. Please try again.");
                    }
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

}