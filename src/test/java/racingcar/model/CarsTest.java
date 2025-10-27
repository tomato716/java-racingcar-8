package racingcar.model;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
    Cars cars = new Cars();

    @DisplayName("자동차 리스트가 올바르게 생성되는지 테스트")
    @Test
    void correctCreateCars() {
        List<String> carNames = List.of("pobi", "jun");

        cars.createCar(carNames);

        assertThat(cars.getCars().size()).isEqualTo(2);
    }
}
