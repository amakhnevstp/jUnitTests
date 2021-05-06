import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void DevisionNotZero() {
        int expected = 2;
        int actual = Main.devision(6,3);
        assertEquals(expected,actual);
    }

    @Test
    void DevisionZero() {
        assertThrows(ArithmeticException.class,
                () -> {
                    Main.devision(6, 0);
                });
    }

    @Test
    void DevisionMany() {
        int expected = 2;
        int notExpected = 1;
        int actual = Main.devision(6,3);

        assertAll("DevisionMany",
                () -> Assertions.assertEquals(expected,actual),
                () -> Assertions.assertNotEquals(notExpected,actual)
                );
    }


}