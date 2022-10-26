package pl.games.lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WinningNumberGenerator {

    List<Integer> drawWinningNumbers() {
        Set<Integer> lotteryNumbers = new HashSet<>();
        while (lotteryNumbers.size() < 6) {
            int randomNum = (int) (Math.random() * 99);
            lotteryNumbers.add(randomNum);
        }
        return lotteryNumbers.stream().toList();
    }
}
