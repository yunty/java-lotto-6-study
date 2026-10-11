package lotto;

import exception.ErrorMessage;
import exception.LottoError;
import java.util.Comparator;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateSize(numbers);
        validateDuplicate(numbers);
        sort(numbers);
    }

    private static void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplicate(List<Integer> numbers) {
        long distinctCount = numbers.stream()
                .distinct()
                .count();
        if (numbers.size() == distinctCount) {
            return;
        }
        throw new LottoError(ErrorMessage.DUPLICATE_VALUE);
    }

    private void sort(List<Integer> numbers){
        numbers.sort(Comparator.naturalOrder());
    }
}
