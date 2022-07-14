package lottogame;

import java.util.Set;

class ResultChecker {
    long countAimedNumbers(Set<Integer> userNumbers, Set<Integer> generatedNumbers) {
        return userNumbers.stream()
                .filter(generatedNumbers::contains)
                .count();
    }
}
