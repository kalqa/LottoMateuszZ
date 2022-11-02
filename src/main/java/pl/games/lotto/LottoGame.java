package pl.games.lotto;

import pl.games.GameResult;
import pl.games.messenger.UserMessenger;

import java.util.List;

public class LottoGame {

    GetUserNumbers getUserNumbers;

    public LottoGame(GetUserNumbers getUserNumbers) {
        this.getUserNumbers = getUserNumbers;
    }

    public GameResult play() {
//        GetUserNumbers getUserNumbers = new UserNumbersReceiver();
//        UserNumbersReceiver userNumberGenerator = new UserNumbersReceiver();
        List<Integer> userNumbers = getUserNumbers.getUserNumbers(); // z testów jednostkowych

        UserMessenger numberDisplayer = new UserMessenger();
        numberDisplayer.displayUserNumber(userNumbers);

        System.out.println();
        WinningNumberGenerator winningNumberGenerator = new WinningNumberGenerator();
        List<Integer> lotteryNumbers = winningNumberGenerator.drawWinningNumbers();

        numberDisplayer.printDrawnWinningNumbers(lotteryNumbers);

        System.out.println();

        ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
        resultAnnouncer.announceResults(userNumbers, lotteryNumbers);

        return new GameResult("you won", true);
    }
}
