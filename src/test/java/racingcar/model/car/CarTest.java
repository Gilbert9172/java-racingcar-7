package racingcar.model.car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.helper.ReflectionUtil;
import racingcar.model.race.Lap;
import racingcar.model.race.MyProgress;
import racingcar.model.race.Position;

public class CarTest {

    @Test
    @DisplayName("중간 진행 사항 확인")
    void checkLapChart() {
        // given
        Lap remainLap = Lap.initiate("6");
        Position position = Position.initiate();
        ReflectionUtil.forceSetField(position, "value", "---");
        MyProgress myProgress = MyProgress.initiate(remainLap, position);
        Car sut = Car.of("user1", myProgress);

        // when
        String actual = sut.myProgress();

        // then
        assertThat(actual).isEqualTo("user1 : ---");
    }

}