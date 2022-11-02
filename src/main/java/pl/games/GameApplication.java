package pl.games;

import pl.games.lotto.LottoGame;
import pl.games.lotto.UserNumbersReceiver;

class GameApplication {
    public static void main(String[] lotteryGame) {
        UserNumbersReceiver getUserNumbers = new UserNumbersReceiver();
        LottoGame lottoGame = new LottoGame(getUserNumbers);
        GameResult gameResult = lottoGame.play();
    }

}
