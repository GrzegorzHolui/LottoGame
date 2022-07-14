package lottogame;

import java.util.Optional;
import java.util.Set;

public class NumberValidator {

    public static final int MINIMAL_RANGE_NUMBER = 1;

    public void checkTheNumberAndAddValueSetOfSixNumbersReceivedFromUser(Set<Integer> setOfUserNumbers, String currentValueInputByUser) {
        Optional<Integer> numberFromUser = parseToNumber(currentValueInputByUser);

        if (numberFromUser.isPresent()) {
            Integer currentValue = numberFromUser.get();
            if (isNumberInRange(currentValue)) {
                boolean addedNumber = setOfUserNumbers.add(numberFromUser);
                if (addedNumber) {
                    System.out.println("You added number " + numberFromUser);
                } else {
                    System.out.println("Number has been already added");
                }
            } else {
                System.out.println("Number is not in the scope");
            }
        }
    }

    private Optional<Integer> parseToNumber(String currentValueInputByUser) {
        int numberFromUser;
        try {
            numberFromUser = Integer.parseInt(currentValueInputByUser);
        } catch (NumberFormatException exception) {
            System.out.println("Your number is not a number");
            return Optional.empty();
        }
        return Optional.of(numberFromUser);
    }

    private boolean isNumberInRange(int currentValue) {
        return currentValue >= MINIMAL_RANGE_NUMBER && currentValue <= 49;
    }
}
