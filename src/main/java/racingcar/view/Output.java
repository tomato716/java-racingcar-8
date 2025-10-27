package racingcar.view;

import java.util.List;

public class Output {
    private static final String EXPRESS = "-";

    public void carNameRequest() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void gameAttemptRequest() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public void executionStatement() {
        System.out.println("\n실행 결과");
    }

    public void printEachResult(String name, int position) {
        System.out.println(name + " : " + formatPosition(position));
    }

    private String formatPosition(int position) {
        return EXPRESS.repeat(position);
    }

    public void printWinner(List<String> winner) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", winner));
    }

    public void printNewLine() {
        System.out.println();
    }
}
