package racingcar.controller;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.Input;
import racingcar.view.Output;

public class Game {
    private final Input input;
    private final Output output;
    private final Validator validator;
    private final Cars cars;

    public Game(Input input, Output output, Validator validator, Cars cars) {
        this.input = input;
        this.output = output;
        this.validator = validator;
        this.cars = cars;
    }


    private void createCars() {
        output.carNameRequest();
        String carName = input.carName();
        List<String> carNames = validator.splitCarName(carName);

        cars.createCar(carNames);
    }

    private int createGameRound() {
        output.gameAttemptRequest();
        String gameRound = input.gameAttempt();
        validator.validateGameAttempt(gameRound);

        return Integer.parseInt(gameRound);
    }

    public void playGame() {
        createCars();
        int gameRound = createGameRound();

        output.executionStatement();
        playRound(gameRound);

        output.printWinner(cars.findWinner());

        input.finish();
    }

    private void playRound(int gameRound) {
        for (int i = 0; i < gameRound; i++) {
            cars.gameStart();
            printResult(cars.getCars());
        }
    }

    private void printResult(List<Car> cars) {
        for (Car car : cars) {
            output.printEachResult(car.getName(), car.getPosition());
        }
        System.out.println();
    }


}
