package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final Winner winner = new Winner();

    private final List<Car> cars = new ArrayList<>();

    public void createCar(List<String> carName) {
        for (String name : carName) {
            Car car = new Car(name);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return List.copyOf(cars);
    }

    public void gameStart() {
        for (Car car : cars) {
            car.play();
        }
    }

    public List<String> findWinner() {
        eachCompareToMaxScore();
        return List.copyOf(winner.getWinner());
    }

    private void eachCompareToMaxScore() {
        int max = findMaxScore();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                winner.saveWinner(car.getName());
            }
        }
    }

    private int findMaxScore() {
        int max = 0;
        for (Car car : cars) {
            if (max < car.getPosition()) {
                max = car.getPosition();
            }
        }

        return max;
    }

}
