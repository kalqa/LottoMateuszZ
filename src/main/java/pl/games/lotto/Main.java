package pl.games.lotto;

import java.util.*;

import pl.games.messenger.UserMessenger;

class Main {
    public static void main(String[] lotteryGame) {
        UserNumbersGenerator userNumberGenerator = new UserNumbersGenerator();
        List<Integer> userNumbers = userNumberGenerator.getUserNumbers(new ArrayList<>());

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

    static boolean validateNumberInGivenRange(int number) {
        return number >= 1 && number <= 99;
    }

}
