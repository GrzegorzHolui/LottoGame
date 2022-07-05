package lottoGame;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class LottoGame implements Game {

    private final Generable numbersGenerator;
    private final Receivable numbersReceiver;
    private final ResultChecker resultChecker;
    private final ResultAnnouncer resultAnnouncer;

    public LottoGame() {
        this.numbersGenerator = new NumbersGenerator(new Random());
        this.numbersReceiver = new NumbersReceiver(new Scanner(System.in));
        this.resultChecker = new ResultChecker();
        this.resultAnnouncer = new ResultAnnouncer();
    }

    public LottoGame(Generable numbersGenerator, Receivable numbersReceiver) {
        this.numbersGenerator = numbersGenerator;
        this.numbersReceiver = numbersReceiver;
        this.resultChecker = new ResultChecker();
        this.resultAnnouncer = new ResultAnnouncer();
    }


    @Override
    public Result start() {
        Set<Integer> generatedNumbers = numbersGenerator.receiveSixNumbers();
        Set<Integer> userNumbers = numbersReceiver.receiveNumbers();
        long aimedNumbers = resultChecker.howManyNumbersAreAimedByUser(userNumbers, generatedNumbers);
        String messageOfAimedNumbers = "User aimed " + aimedNumbers + " numbers";
        resultAnnouncer.showTheResults(messageOfAimedNumbers, generatedNumbers, userNumbers);
        return new Result(messageOfAimedNumbers);
    }
}
