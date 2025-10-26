package racingcar;

import racingcar.controller.Game;
import racingcar.controller.Validator;
import racingcar.model.Cars;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input = new Input();
        Output output = new Output();
        Validator validator = new Validator();
        Cars cars = new Cars();
        Game game = new Game(input, output, validator, cars);

        game.playGame();
    }
}
