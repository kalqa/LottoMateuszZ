package pl.games.messenger;

import java.util.List;

public class UserMessenger {

    SpecificMessenger specificMessenger = new SpecificMessenger();
    public void displayUserNumber(List<Integer> userNumbers) {
        specificMessenger.printYourNumbersMessage();
        for (int number : userNumbers) {
            System.out.print(number + " ");
        }
    }

    public void printDrawnWinningNumbers(List<Integer> lotteryNumbers) {
        specificMessenger.printWinningNumbersMessage();
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");

        }
    }


}
