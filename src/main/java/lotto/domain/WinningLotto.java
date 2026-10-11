package lotto.domain;

import java.util.List;
import lotto.domain.constant.LottoResultConstants;
import lotto.exception.ErrorMessage;
import lotto.exception.LottoError;

public class WinningLotto {
    Lotto winningLotto;
    int bonusNumber;



    public WinningLotto(List<Integer> winningLotto, int bonusNumber) {
        LottoNumber.lottoNumberListValidate(winningLotto);
        this.winningLotto = Lotto.of(winningLotto);
        this.bonusNumber = bonusNumber;
    }

    public LottoResultConstants matchWithWinningLotto(Lotto lotto){
        return LottoResultConstants.judgeResult(countNumberMatch(lotto), countBonusNumberMatch(lotto));
    }
    public int countNumberMatch(Lotto lotto) {
        return winningLotto.match(lotto);
    }

    public boolean countBonusNumberMatch(Lotto lotto) {
        return lotto.contains(bonusNumber);
    }

    public void validate(List<Integer> winningLotto, int bonusNumber) {
        validateBonusNumber(winningLotto, bonusNumber);
    }

    private void validateBonusNumber(List<Integer> winningLotto, int bonusNumber) {
        LottoNumber.lottoNumberValidate(bonusNumber);

        if (winningLotto.contains(bonusNumber)) {
            throw new LottoError(ErrorMessage.LOTTO_NUMBER_BONUSNUMBER_DUPLICATE);
        }
    }


}
