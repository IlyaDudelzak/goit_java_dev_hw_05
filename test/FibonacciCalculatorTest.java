import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciCalculatorTest {
    private FibonacciCalculator calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc = new FibonacciCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "8, 21"
    })
    void testFibonacci(int input, int expected) {
        assertEquals(expected, calc.generateIteratively(input));
        assertEquals(expected, calc.generateRecursively(input));
        assertEquals(expected, calc.generateDP(input));
    }
}