package lottogame

import spock.lang.Specification

class LottoGameTest extends Specification {

    def "should return that six numbers that are aimed"() {
        given:
            def drawnNumbers = Set.of(1, 2, 3, 4, 5, 6)
            def userNumbers = Set.of(1, 2, 3, 4, 5, 6)
            def generator = new GenerableImplTest(drawnNumbers)
            def numberReceiver = new ReceivableImplTest(userNumbers)
            LottoGame lottoGame = new LottoGame(generator, numberReceiver, new ResultChecker(), new ResultAnnouncer())
            Result expectedResult = new Result("User aimed 6 numbers")
        when:
            Result resultOfLottoGame = lottoGame.start()
        then:
            resultOfLottoGame == expectedResult
    }

    def "should return that three numbers that are aimed"() {
        given:
        LottoGame lottoGame = new LottoGame(new GenerableImplTest(Set.of(1, 2, 3, 4, 5, 6), new ReceivableImplTest(Set.of(1, 2, 3, 44, 45, 46)),
                new ResultChecker(), new ResultAnnouncer()))
        Result expectedResult = new Result("User aimed 3 numbers")
        when:
        Result resultOfLottoGame = lottoGame.start()
        then:
        resultOfLottoGame == expectedResult
    }
}
