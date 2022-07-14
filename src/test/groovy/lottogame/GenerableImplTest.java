package lottogame;

import java.util.Set;

public class GenerableImplTest implements Generable {
    private final Set<Integer> generatedNumbers;

    public GenerableImplTest(Set<Integer> generatedNumbers) {
        this.generatedNumbers = generatedNumbers;
    }

    @Override
    public Set<Integer> generate() {
        return generatedNumbers;
    }
}
