package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String input) {
        name = new Name(input);
        position = new Position();
    }

    public void play() {
        position.move();
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

}
