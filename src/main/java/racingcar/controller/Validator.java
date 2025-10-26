package racingcar.controller;

public class Validator {
    private static final String DELIMITER = ",";

    private List<String> split(String carName) {

        return List.of(carName.split(DELIMITER));
    }
}
