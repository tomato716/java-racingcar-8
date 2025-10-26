package racingcar.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    private final Validator validator = new Validator();


    @DisplayName("쉼표(,)를 기준으로 입력받은 문자열을 분리하여 리스트로 반환")
    @Test
    void splitCarName() {
        String input = "ab,cd,ef";

        List<String> carNames = validator.splitCarName(input);

        assertEquals(List.of("ab", "cd", "ef"), carNames);
    }
}
