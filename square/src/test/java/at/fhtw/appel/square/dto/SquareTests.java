package at.fhtw.appel.square.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SquareTests {

    private final Square square = new Square();

    @Test
    void contextLoads() {
    }

    @Test
    void testGetSquare() {
        assertEquals(0, square.getSquare());
    }

    @Test
    void testSettingMessage() {
        square.setSquare(5);
        assertEquals(25, square.getSquare());
    }

}
