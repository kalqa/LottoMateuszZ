package pl.games.lotto;

import java.util.*;
import pl.games.messenger.UserMessenger;

class Main {
    public static void main(String[] lotteryGame) {
        List<Integer> userNumbers = getUserNumbers();

//        int number;
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> userNumbers = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
//            while (true) {
//                try {
//                    number = scanner.nextInt();
//                    if (validateNumberInGivenRange(number)) {
//                        userNumbers.add(number);
//                        break;
//                    } else {
//                        System.out.println(number + " is not between 1 and 99. Please try again.");
//                    }
//                } catch (NumberFormatException numberFormatException) {
//                    System.out.println("This is not a number. Please try again.");
//                } catch (InputMismatchException inputMismatchException) {
//                    System.out.println("This is not a number. Please try again.");
//                    scanner.nextLine();
//                    break;
//                }
//            }
//        }

        UserMessenger numberDisplayer = new UserMessenger();
        numberDisplayer.displayUserNumber(userNumbers);

        System.out.println();
        WinningNumberGenerator winningNumberGenerator = new WinningNumberGenerator();
        List<Integer> lotteryNumbers = winningNumberGenerator.drawWinningNumbers();

        numberDisplayer.printDrawnWinningNumbers(lotteryNumbers);

        System.out.println();

        ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
        resultAnnouncer.announceResults(userNumbers, lotteryNumbers);
    }

//    private static boolean validateNumberInGivenRange(int number) {
//        return number >= 1 && number <= 99;
//    }
}
