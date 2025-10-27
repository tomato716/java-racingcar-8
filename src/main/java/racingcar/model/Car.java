package racingcar.model;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String input) {
        name = new Name(input);
        position = new Position();
    }

    public void play() {
        position.tryMove();
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

}
