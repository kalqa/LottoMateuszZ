package pl.games.lotto;

import java.util.List;

class ResultAnnouncer {

    void announceResults(List<Integer> userNumber, List<Integer> lotteryNumbers) {
        if (userNumber.containsAll(lotteryNumbers))
            System.out.println("Congratulations, you have won!");
        else {
            System.out.println("Sorry, but you didn't win. It's not you lucky day perhaps. Try your luck next time. ");
        }
    }
}
