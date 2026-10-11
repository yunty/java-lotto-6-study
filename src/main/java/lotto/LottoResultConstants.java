package lotto;

import java.util.Arrays;

public enum LottoResultConstants {
    NONE(0,false),
    FIRST(6,false),
    SECOND(5,true){
        @Override
        public boolean isMatch(int matchCount, boolean isBonusNumberMatch){
            if(this.matchCount == matchCount && this.isBonusNumberMatch==isBonusNumberMatch){
                return true;
            }
            return false;
        }
    },
    THIRD(5,false){
        @Override
        public boolean isMatch(int matchCount, boolean isBonusNumberMatch){
            if(this.matchCount == matchCount && this.isBonusNumberMatch==isBonusNumberMatch){
                return true;
            }
            return false;
        }
    },
    FOURTH(4,false),
    FIFTH(3,false);

    int matchCount;
    boolean isBonusNumberMatch;

    LottoResultConstants(int matchCount, boolean isBonusNumberMatch) {
        this.matchCount = matchCount;
        this.isBonusNumberMatch = isBonusNumberMatch;
    }

    public static LottoResultConstants judgeResult(int matchCount, boolean isBonusNumberMatch){
        return Arrays.stream(values())
                .filter(type -> type.isMatch(matchCount, isBonusNumberMatch))
                .findFirst()
                .orElse(NONE);
    }

    public boolean isMatch(int matchCount, boolean isBonusNumberMatch){
        if(this.matchCount == matchCount){
            return true;
        }
        return false;
    }

}
