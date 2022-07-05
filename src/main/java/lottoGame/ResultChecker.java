package lottoGame;

import java.util.Set;

class ResultChecker {
    long howManyNumbersAreAimedByUser(Set<Integer> setOfUserNumbers, Set<Integer> setOfGeneratedNumbers) {
        return setOfUserNumbers.stream().filter(setOfGeneratedNumbers::contains).count();
    }
}