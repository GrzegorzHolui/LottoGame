package lottogame;

import java.util.Set;

class ResultAnnouncer {
    public void showTheResults(String messageOfAimedNumbers,
                               Set<Integer> generatedNumbers,
                               Set<Integer> userNumbers) {
        System.out.println(messageOfAimedNumbers);
        System.out.println("numbersGenerated " + generatedNumbers);
        System.out.println("UserNumbers " + userNumbers);
    }
}
