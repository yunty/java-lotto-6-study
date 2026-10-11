package exception;

public class LottoError extends IllegalArgumentException {
    public LottoError(ErrorMessage error) {
        super(error.getMessage());
    }
}
