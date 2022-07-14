package lottogame;

import java.util.Set;

class LottoGame implements Game {

    private final Generable numbersGenerator;
    private final ResultChecker resultChecker;
    private final ResultAnnouncer resultAnnouncer;

    LottoGame(Generable numbersGenerator, Receivable numbersReceiver, ResultChecker resultChecker, ResultAnnouncer resultAnnouncer) {
        this.numbersGenerator = numbersGenerator;
        this.numbersReceiver = numbersReceiver;
        this.resultChecker = resultChecker;
        this.resultAnnouncer = resultAnnouncer;
    }

    @Override
    public Result start() {
        Set<Integer> userNumbers = numbersReceiver.receiveNumbers();
        Set<Integer> generatedNumbers = numbersGenerator.generate();
        long aimedNumbers = resultChecker.countAimedNumbers(userNumbers, generatedNumbers);
        String messageOfAimedNumbers = "User aimed " + aimedNumbers + " numbers";
        resultAnnouncer.showTheResults(messageOfAimedNumbers, generatedNumbers, userNumbers);
        return new Result(messageOfAimedNumbers);
    }
}
