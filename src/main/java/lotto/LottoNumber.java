package lotto;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.exception.ErrorMessage;
import lotto.exception.LottoError;

public class LottoNumber {
    private static final int NUMBER_START = 1;
    private static final int NUMBER_END = 45;
    private static final int LOTTO_SIZE = 6;

    public static List<Integer> generate() {
        return Randoms.pickUniqueNumbersInRange(NUMBER_START, NUMBER_END, LOTTO_SIZE);
    }

    public static void lottoNumberListValidate(List<Integer> lottoNumbers) {
        validateLottoSize(lottoNumbers);
        lottoNumbers.forEach(LottoNumber::validateNumberRange);
    }

    public static void lottoNumberValidate(int number){
        validateNumberRange(number);
    }

    private static void validateLottoSize(List<Integer> lottoNumbers) {
        if (lottoNumbers.size() == LOTTO_SIZE) {
            return;
        }
        throw new LottoError(ErrorMessage.LOTTO_NUMBER_NOT_IN_RANGE);
    }

    private static void validateNumberRange(int number) {
        if (number >= NUMBER_START && number <= NUMBER_END) {
            return;
        }
        throw new LottoError(ErrorMessage.LOTTO_NUMBER_NOT_IN_RANGE);
    }
}
