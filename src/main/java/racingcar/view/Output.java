package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class Output {
    private static final String EXPRESS = "-";

    public void carNameRequest() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void gameAttemptRequest() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void roundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + printPosition(car.getPosition()));
        }
        System.out.println();
    }

    private String printPosition(int position) {
        return EXPRESS.repeat(position);
    }

    public void printWinner(List<String> winner) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", winner));
    }
}
