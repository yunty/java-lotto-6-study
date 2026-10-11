package lotto.domain;

public class WinningMatchResult {
    int countMatch;
    boolean isBonusNumberMatch;

    public WinningMatchResult(int countMatch, boolean isBonusNumberMatch) {
        this.countMatch = countMatch;
        this.isBonusNumberMatch = isBonusNumberMatch;
    }
}
