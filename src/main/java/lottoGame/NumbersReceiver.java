package lottoGame;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class NumbersReceiver implements Receivable {
    private final Scanner scanner;

    public NumbersReceiver(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Set<Integer> receiveNumbers() {
        Set<Integer> setOfSixNumbersReceivedFromUser = new LinkedHashSet<>();
        while (setOfSixNumbersReceivedFromUser.size() < 6) {
            System.out.println("Gimme the number");
            String currentLine = scanner.nextLine();
            checkTheNumberAndAddValueSetOfSixNumbersReceivedFromUser(setOfSixNumbersReceivedFromUser, currentLine);
        }
        scanner.close();
        return setOfSixNumbersReceivedFromUser;
    }

    private void checkTheNumberAndAddValueSetOfSixNumbersReceivedFromUser(Set<Integer> setOfUserNumbers, String currentValueInputByUser) {
        int currentValue = 0;
        try {
            currentValue = Integer.parseInt(currentValueInputByUser);
        } catch (NumberFormatException exception) {
            System.out.println("Your number is not a number");
            return;
        }
        if (currentValue >= 1 && currentValue <= 49) {
            boolean addedNumber = setOfUserNumbers.add(currentValue);
            if (addedNumber) {
                System.out.println("You added number " + currentValue);
            } else {
                System.out.println("Number has been already added");
            }
        } else {
            System.out.println("Number is not in the scope");
        }
    }
}