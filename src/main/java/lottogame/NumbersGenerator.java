package lottogame;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

class NumbersGenerator implements Generable {

    public static final int MAXIMAL_NUMBERS_FROM_USER = 6;
    public static final int MINIMAL_GENERATED_NUMBER = 1;
    public static final int MAXIMAL_GENERATED_NUMBER = 50;

    private final Random random;

    NumbersGenerator(Random random) {
        this.random = random;
    }

    @Override
    public Set<Integer> generate() {
        Set<Integer> setOfSixGeneratedNumbers = new LinkedHashSet<>();
        while (setOfSixGeneratedNumbers.size() < MAXIMAL_NUMBERS_FROM_USER) {
            int currentIntegerValue = random.nextInt(MINIMAL_GENERATED_NUMBER, MAXIMAL_GENERATED_NUMBER);
            setOfSixGeneratedNumbers.add(currentIntegerValue);
        }
        return setOfSixGeneratedNumbers;
    }
}
