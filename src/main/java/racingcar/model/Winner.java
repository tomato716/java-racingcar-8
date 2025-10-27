package racingcar.model;

import java.util.ArrayList;
import java.util.List;

class Winner {
    List<String> winner = new ArrayList<>();

    public void saveWinner(String name) {
        winner.add(name);
    }

    public List<String> getWinner() {
        return List.copyOf(winner);
    }
}
