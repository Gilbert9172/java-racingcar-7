package racingcar.view.validator.lap;

import static racingcar.util.PreprocessingUtil.replaceAllUnNecessaryChar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import racingcar.view.exception.UnNecessaryCharIncludedException;

public class LapRegexValidator extends LapCountInputValidator {

    private final static Pattern pattern = Pattern.compile("^[0-9]+$");

    private LapRegexValidator() {
    }

    public static LapRegexValidator initiate() {
        return new LapRegexValidator();
    }


    @Override
    public void check(final String source) {
        String cleanSource = replaceAllUnNecessaryChar(source);

        Matcher matcher = pattern.matcher(cleanSource);
        if (!matcher.matches()) {
            throw new UnNecessaryCharIncludedException();
        }

        super.check(source);
    }
}
