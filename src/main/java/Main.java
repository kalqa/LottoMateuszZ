import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] lotteryGame) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int[] userNumber = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
            while (true) {
                try {
                    number = scanner.nextInt();
                    if (validateNumberInGivenRange(number)) {
                        userNumber[i] = number;
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
        numberDisplayer.displayUserNumber(userNumber);

        System.out.println();
        int[] lotteryNumbers = drawWinningNumbers();

        printDrawnWinningNumbers(lotteryNumbers);

        System.out.println();

        announceResults(userNumber, lotteryNumbers);
    }

    private static void announceResults(int[] userNumber, int[] lotteryNumbers) {
        if (Arrays.equals(userNumber, lotteryNumbers))
            System.out.println("Congratulations, you have won!");
        else {
            System.out.println("Sorry, but you didn't win. It's not you lucky day perhaps. Try your luck next time. ");
        }
    }

    private static void printDrawnWinningNumbers(int[] lotteryNumbers) {
        System.out.println("Draw numbers are:");
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");

        }
    }

    private static int[] drawWinningNumbers() {
        int[] lotteryNumbers = new int[6];
        int randomNum;
        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 99);
            for (int x = 0; x < i; x++) {
                if (lotteryNumbers[x] == randomNum) {
                    randomNum = (int) (Math.random() * 99);
                    x = -1;
                }
            }
            lotteryNumbers[i] = randomNum;
        }
        return lotteryNumbers;
    }

    private static boolean validateNumberInGivenRange(int number) {
        return number >= 1 && number <= 99;
    }
}
