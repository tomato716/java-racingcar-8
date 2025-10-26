package racingcar.controller;

import java.util.List;

public class Validator {
    private static final String DELIMITER = ",";
    private static final int NAME_LENGTH_LIMIT = 5;

    public List<String> splitCarName(String carName) {
        List<String> carNames = split(carName);
        validateName(carNames);

        return carNames;
    }

    private void validateName(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > NAME_LENGTH_LIMIT || carName.isBlank()) {
                throw new IllegalArgumentException("자동차 이름은 1자 이상 5자 이하만 입력 가능합니다.");
            }
        }
    }

    private List<String> split(String carName) {

        return List.of(carName.split(DELIMITER));
    }
}
