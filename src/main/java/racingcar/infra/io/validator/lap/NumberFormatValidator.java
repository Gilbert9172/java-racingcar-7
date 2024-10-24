package racingcar.infra.io.validator.lap;

import static java.math.BigInteger.ZERO;

import java.math.BigInteger;
import racingcar.infra.io.exception.ShouldNotLowerThanOneException;
import racingcar.util.PreprocessingUtil;

public class NumberFormatValidator extends LapCountInputValidator {

    private NumberFormatValidator() {
    }

    public static NumberFormatValidator initiate() {
        return new NumberFormatValidator();
    }

    @Override
    public void check(final String source) {
        String cleanSource = PreprocessingUtil.replaceAllUnNecessaryChar(source);
        BigInteger count = new BigInteger(cleanSource);

        if (isLoeZero(count)) {
            throw new ShouldNotLowerThanOneException();
        }

        super.check(source);
    }

    private boolean isLoeZero(BigInteger count) {
        return count.compareTo(ZERO) <= 0;
    }
}