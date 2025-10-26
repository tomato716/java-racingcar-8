package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
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
        List<String> winner = new ArrayList<>();
        int max = findMaxScore();

        for (Car car : cars) {
            if (max == car.getPosition()) {
                winner.add(car.getName());
            }
        }

        return winner;
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
