package racingcar.view.io;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static String readInput() {
        return Console.readLine();
    }

    public static void close() {
        Console.close();
    }
}
