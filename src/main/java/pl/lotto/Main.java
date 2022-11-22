package pl.lotto;

public class Main {

    public static void main(String[] lotteryGame) {
        NumberReceivable numberReceiver = new NumberReceiver();
        LottoGame lottoGame = new LottoGame(numberReceiver);
        lottoGame.playLotto();
    }

}
