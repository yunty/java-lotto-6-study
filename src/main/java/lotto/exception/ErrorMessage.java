package lotto.exception;

public enum ErrorMessage {
    CONTAIN_NULL("입력값에 NULL값이 포함되어있습니다."),
    EMPTY_VALUE("입력값이 빈값입니다."),
    NOT_MATCH_AMOUNT("구입 금액이 1,000원 단위가 아닙니다."),
    LOTTO_NUMBER_NOT_IN_RANGE("로또 번호가 형식에 맞지 않습니다."),
    LOTTO_NUMBER_BONUSNUMBER_DUPLICATE("당첨 번호와 보너스 번호가 중복되었습니다."),
    DUPLICATE_VALUE("입력값에 중복이 존재합니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
