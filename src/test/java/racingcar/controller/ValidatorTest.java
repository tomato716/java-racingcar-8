package racingcar.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    private final Validator validator = new Validator();


    @DisplayName("쉼표(,)를 기준으로 입력받은 문자열을 분리하여 리스트로 반환 테스트")
    @Test
    void splitCarName() {
        String input = "ab,cd,ef";

        List<String> carNames = validator.splitCarName(input);

        assertEquals(List.of("ab", "cd", "ef"), carNames);
    }

    @DisplayName("경주 자동차 이름이 5를 초과하면 예외 발생 테스트")
    @Test
    void carNameOverLimit() {
        String carNames = "pobi,popopo";

        assertThrows(IllegalArgumentException.class, () -> validator.splitCarName(carNames));
    }

    @DisplayName("경주 자동차 이름이 1 미만이면 예외 발생 테스트")
    @Test
    void carNameNull() {
        String carNames = ",a,,";

        assertThrows(IllegalArgumentException.class, () -> validator.splitCarName(carNames));
    }

    @DisplayName("시도 횟수가 숫자가 아니라면 예외 발생 테스트")
    @Test
    void gameAttemptIsNotInteger() {
        String gameAttempt = "three";

        assertThrows(IllegalArgumentException.class, () -> validator.validateGameAttempt(gameAttempt));
    }


}
