package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ResultTest {

    @Test
    void 결과의_길이_공백_테스트() {
        assertThrows(IllegalArgumentException.class, () -> new DrawResult(""));
    }
}
