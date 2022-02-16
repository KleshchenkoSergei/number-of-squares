package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Expected 0', 0, 99, 0",
            "'Expected 1', 9801, 9801, 1",
            "'Expected 89', 0, 9800, 89",
            "'Expected 90', 0, 9801, 90",
            "'Over maximum', 0, 10001, 90",
            "'minSquareSide > maxSquareSide', 10000, 0, 0"})
    void shouldCalculate(String testName, int minSquareSide, int maxSquareSide, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(minSquareSide, maxSquareSide);
        assertEquals(expected, actual);
    }

}