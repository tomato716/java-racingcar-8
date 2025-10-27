package racingcar.controller;

import java.util.List;

public class Validator {
    private static final String DELIMITER = ",";
    private static final int NAME_LENGTH_LIMIT = 5;
    private static final int ZERO = 0;

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

    public void validateGameAttempt(String input) {
        try {
            int gameRound = Integer.parseInt(input);
            gameAttemptBiggerThanZero(gameRound);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 입력할 수 있습니다.");
        }
    }

    private void gameAttemptBiggerThanZero(int gameRound) {
        if (gameRound <= ZERO) {
            throw new IllegalArgumentException("시도 횟수는 0보다 커야합니다.");
        }
    }
}
