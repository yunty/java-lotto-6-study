package lotto.domain;

import java.util.EnumMap;
import java.util.Map;
import lotto.domain.constant.LottoResultConstants;

public class LottoResult {
    Map<LottoResultConstants, Integer> result = new EnumMap<>(LottoResultConstants.class);

    public LottoResult(Lottos userLotto, WinningLotto winningLotto) {
        userLotto.getPurchasedLotto().stream()
                .map(winningLotto::matchWithWinningLotto)
                .forEach(this::add);
    }
    private void add(LottoResultConstants type){
        this.result.put(type, result.getOrDefault(type, 0)+1);
    }
}
