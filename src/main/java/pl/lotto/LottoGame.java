package pl.lotto;

import java.util.HashSet;
import java.util.Set;

class LottoGame {

    NumberReceivable numberReceiver;

    LottoGame(NumberReceivable numberReceiver) {
        this.numberReceiver = numberReceiver;
    }

    GameResult playLotto() {
        Set<Integer> userNumber = numberReceiver.receiveNumbersFromUser();
        NumberValidator numberValidator = new NumberValidator();
        ValidationResult valid = numberValidator.validateNumbers(userNumber);
        if (!valid.isValid()) {
            return new GameResult("validation error");
        }

        System.out.println("Your numbers are:");
        for (int i : userNumber) {
            System.out.print(i + " ");
        }

        System.out.println();

        Set<Integer> lotteryNumbers = new HashSet<>();
        int randomNum;
        for (int i = 0; i < 6; i++) {
            randomNum = drawRandomWinningNumber();
            lotteryNumbers.add(randomNum);
        }


//        int[] lotteryNumbers = new int[6];
////        int randomNum;
//        for (int i = 0; i < 6; i++) {
//            randomNum = (int) (Math.random() * 99);
////            for (int x = 0; x < i; x++) {
////                if (lotteryNumbers[x] == randomNum) {
////                    randomNum = (int) (Math.random() * 99);
////                    x = -1;
////                }
////            }
//            lotteryNumbers[i] = randomNum;
//        }

        System.out.println("Draw numbers are:");
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");

        }

        System.out.println();

//        if (Arrays.equals(userNumber, lotteryNumbers))
//            System.out.println("Congratulations, you have won!");
//        else {
//            System.out.println("Sorry, but you didn't win. It's not you lucky day perhaps. Try your luck next time. ");
//        }
        return new GameResult("user won");
    }

    private static int drawRandomWinningNumber() {
        return (int) (Math.random() * 99);
    }
}
