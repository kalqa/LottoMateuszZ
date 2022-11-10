package pl.games.lotto;

import java.util.List;
import pl.games.GameResult;
import pl.games.messenger.UserMessenger;

public class LottoGame {

    GetUserNumbers getUserNumbers;

    public LottoGame(GetUserNumbers getUserNumbers) {
        this.getUserNumbers = getUserNumbers;
    }

    public GameResult play() {
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
        UserNumbersValidator userNumbersValidator = new UserNumbersValidator();
        return userNumbersValidator.getGameResult(userNumbers);
    }


}
