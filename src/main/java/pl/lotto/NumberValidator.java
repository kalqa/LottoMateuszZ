package pl.lotto;

import java.util.Set;

class NumberValidator {

    public static final int LOWEST_POSSIBLE_NUMBER_FROM_USER = 1;
    public static final int HIGHEST_POSSIBLE_NUMBER_FROM_USER = 99;

    ValidationResult validateNumbers(Set<Integer> userNumbers) {
        boolean atleastOneNumberIsOutOfRange = userNumbers.stream()
                .anyMatch(number -> !isNumberInCorrectRange(number));

        if (atleastOneNumberIsOutOfRange) {
            return new ValidationResult("number out of range", false);
        }
        return new ValidationResult("not error", true);

//        for (int i = 0; i < 6; i++) {
//            int number = userNumbers[i];
//            if (!isNumberInCorrectRange(number)) {
//                return new ValidationResult("number out of range" + number, false);
//            } else {
//                System.out.println(number + " is not between 1 and 99. Please try again.");
//            }
//        }

    }

    private boolean isNumberInCorrectRange(int number) {
        return number >= LOWEST_POSSIBLE_NUMBER_FROM_USER && number <= HIGHEST_POSSIBLE_NUMBER_FROM_USER;
    }
}
