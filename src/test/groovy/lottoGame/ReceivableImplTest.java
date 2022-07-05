package lottoGame;

import java.util.Set;

public class ReceivableImplTest implements Receivable {
    private final Set<Integer> setOfReceivedNumbers;

    public ReceivableImplTest(Set<Integer> setOfReceivedNumbers) {
        this.setOfReceivedNumbers = setOfReceivedNumbers;
    }

    @Override
    public Set<Integer> receiveNumbers() {
        return setOfReceivedNumbers;
    }
}
