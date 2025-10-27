package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinnerTest {
    Winner winner = new Winner();

    @DisplayName("최종 우승자가 잘 저장돼서 부를 수 있는지 테스트")
    @Test
    void printWinner() {
        String input = "pobi";
        List<String> newInput = List.of(input);

        winner.saveWinner(input);
        List<String> winnerResult = winner.getWinner();

        assertThat(winnerResult).isEqualTo(newInput);
    }
}
