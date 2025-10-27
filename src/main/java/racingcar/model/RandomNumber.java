package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

class RandomNumber {
    private static final int MAXIMUM = 9;
    private static final int MINIMUM = 0;
    private static final int LIMIT = 4;

    public boolean pickRandomNumber() {
        return Randoms.pickNumberInRange(MINIMUM, MAXIMUM) >= LIMIT;
    }
}
