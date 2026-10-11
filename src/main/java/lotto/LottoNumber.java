package lotto;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class LottoNumberGenerator {
    private static final int NUMBER_START = 1;
    private static final int NUMBER_END = 45;
    private static final int LIST_SIZE = 6;

    public static List<Integer> generate() {
        return Randoms.pickUniqueNumbersInRange(NUMBER_START, NUMBER_END, LIST_SIZE);
    }
}
