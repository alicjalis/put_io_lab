package put.io.testing.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FailureOrErrorTest {

    @Test
    public void test1() {
        assertFalse(true, "This assertion will always fail");
    }

    @Test
    public void test2() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
        });
    }
    @Test
    public void test3() {
        try {
            assertFalse(true, "This assertion will always fail");
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }
}
