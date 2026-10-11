package lotto.exception;

public enum ErrorMessage {
    CONTAIN_NULL("입력값에 NULL값이 포함되어있습니다."),
    EMPTY_VALUE("입력값이 빈값입니다."),
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
