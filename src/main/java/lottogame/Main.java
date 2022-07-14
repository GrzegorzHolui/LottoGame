package lottogame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator(new Random());
        NumberValidator numberValidator = new NumberValidator();
        NumbersReceiver numbersReceiver = new NumbersReceiver(new Scanner(System.in), numberValidator);
        ResultChecker resultChecker = new ResultChecker();
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
        Game lotto = new LottoGame(numbersGenerator, numbersReceiver, resultChecker, resultAnnouncer);
        lotto.start();
    }
}
