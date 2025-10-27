package racingcar.model;

class Position {
    private final RandomNumber randomNumber = new RandomNumber();

    private int position;

    public int getPosition() {
        return position;
    }

    public void tryMove() {
        if (randomNumber.pickRandomNumber()) {
            position++;
        }
    }
}
