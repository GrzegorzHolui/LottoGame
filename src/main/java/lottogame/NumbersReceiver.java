package lottogame;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class NumbersReceiver implements Receivable {

    private final Scanner scanner;
    private final NumberValidator validator;

    NumbersReceiver(Scanner scanner, NumberValidator validator) {
        this.scanner = scanner;
        this.validator = validator;
    }

    @Override
    public Set<Integer> receiveNumbers() {
        Set<Integer> setOfSixNumbersReceivedFromUser = new LinkedHashSet<>();
        while (setOfSixNumbersReceivedFromUser.size() < 6) {
            System.out.println("Gimme the number");
            String currentLine = scanner.nextLine();
            validator.checkTheNumberAndAddValueSetOfSixNumbersReceivedFromUser(setOfSixNumbersReceivedFromUser, currentLine);
        }
        scanner.close();
        return setOfSixNumbersReceivedFromUser;
    }

}
