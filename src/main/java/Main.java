import java.util.*;

public class Main {
    public static void main(String[] lotteryGame) {
        Scanner scanner = new Scanner(System.in);
        int number;
//        int[] userNumber = new int[6];
        List<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
            while (true) {
                try {
                    number = scanner.nextInt();
                    if (validateNumberInGivenRange(number)) {
//                        userNumber[i] =number;
                        userNumbers.add(number);
                        break;
                    } else {
                        System.out.println(number + " is not between 1 and 99. Please try again.");
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("This is not a number. Please try again.");
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("This is not a number. Please try again.");
                    scanner.nextLine();
                    break;
                }
            }
        }

        NumberDisplayer numberDisplayer = new NumberDisplayer();
        numberDisplayer.displayUserNumber(userNumbers);

        System.out.println();
        List<Integer> lotteryNumbers = drawWinningNumbers();

        printDrawnWinningNumbers(lotteryNumbers);

        System.out.println();

        announceResults(userNumbers, lotteryNumbers);
    }

    private static void announceResults(List<Integer> userNumber, List<Integer> lotteryNumbers) {
        if (userNumber.containsAll(lotteryNumbers))
            System.out.println("Congratulations, you have won!");
        else {
            System.out.println("Sorry, but you didn't win. It's not you lucky day perhaps. Try your luck next time. ");
        }
    }

    private static void printDrawnWinningNumbers(List<Integer> lotteryNumbers) {
        System.out.println("Draw numbers are:");
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");

        }
    }

    private static List<Integer> drawWinningNumbers() {
//        int[] lotteryNumbers = new int[6];
        Set<Integer> lotteryNumbers = new HashSet<>();
        while (lotteryNumbers.size() < 6) {
            int randomNum = (int) (Math.random() * 99);
            lotteryNumbers.add(randomNum);
        }
//        int randomNum;
//        for (int i = 0; i < 6; i++) {
//            randomNum = (int) (Math.random() * 99);
//            for (int x = 0; x < i; x++) {
//                if (lotteryNumbers[x] == randomNum) {
//                    randomNum = (int) (Math.random() * 99);
//                    x = -1;
//                }
//            }
//            lotteryNumbers[i] = randomNum;
//        }
        return lotteryNumbers.stream().toList();
    }

    private static boolean validateNumberInGivenRange(int number) {
        return number >= 1 && number <= 99;
    }
}
