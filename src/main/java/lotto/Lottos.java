package lotto;

import java.util.ArrayList;
import java.util.List;
import lotto.exception.ErrorMessage;
import lotto.exception.LottoError;

public class Lottos {
    List<Lotto> purchasedLotto;

    private Lottos(int amount) {
        validate(amount);
        purchaseLotto(amount);
    }

    public static Lottos of(int amount) {
        return new Lottos(amount);
    }

    private void purchaseLotto(int amount) {
        this.purchasedLotto = new ArrayList<>();
        int tryCount = amount / 10;

        for (int i = 0; i < tryCount; i++) {
            purchasedLotto.add(Lotto.of(LottoNumber.generate()));
        }
    }

    public void validate(int amount) {
        validateAmount(amount);
    }

    private static void validateAmount(int amount) {
        if (amount / 1000 >= 1 && amount % 10 == 0) {
            return;
        }
        throw new LottoError(ErrorMessage.NOT_MATCH_AMOUNT);
    }
}