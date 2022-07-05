package lottoGame;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

class NumbersGenerator implements Generable {
    private final Random random;

    NumbersGenerator(Random random) {
        this.random = random;
    }

    @Override
    public Set<Integer> receiveSixNumbers() {
        Set<Integer> setOfSixGeneratedNumbers = new LinkedHashSet<>();
        while (setOfSixGeneratedNumbers.size() < 6) {
            int currentIntegerValue = random.nextInt(1, 50);
            setOfSixGeneratedNumbers.add(currentIntegerValue);
        }
        return setOfSixGeneratedNumbers;
    }
}
