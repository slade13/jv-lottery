package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
