package racingcar.model.race;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.common.constant.RaceConstant.DEFAULT_LAP_COUNTING_POLICY;

import java.math.BigInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LapTest {

    @Test
    @DisplayName("남은 Lap 수 : 3 → 2")
    void test() {
        // given
        Lap remainingLap = Lap.of(BigInteger.valueOf(3));
        // when
        remainingLap.minus(DEFAULT_LAP_COUNTING_POLICY);
        // then
        Lap expected = Lap.of(BigInteger.valueOf(2));
        assertThat(remainingLap.equals(expected)).isTrue();
    }
}