import static org.junit.jupiter.api.Assertions.*;

class FibonacciCalculatorTest {
    private FibonacciCalculator calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc = new FibonacciCalculator();
    }

    @org.junit.jupiter.api.Test
    void generateIteratively() {
        assertEquals(1, calc.generateIteratively(1));
        assertEquals(1, calc.generateIteratively(2));
        assertEquals(2, calc.generateIteratively(3));
        assertEquals(3, calc.generateIteratively(4));
        assertEquals(5, calc.generateIteratively(5));
        assertEquals(8, calc.generateIteratively(6));
        assertEquals(13, calc.generateIteratively(7));
        assertEquals(21, calc.generateIteratively(8));
    }

    @org.junit.jupiter.api.Test
    void generateRecursively() {
        assertEquals(1, calc.generateRecursively(1));
        assertEquals(1, calc.generateRecursively(2));
        assertEquals(2, calc.generateRecursively(3));
        assertEquals(3, calc.generateRecursively(4));
        assertEquals(5, calc.generateRecursively(5));
        assertEquals(8, calc.generateRecursively(6));
        assertEquals(13, calc.generateRecursively(7));
        assertEquals(21, calc.generateRecursively(8));
    }

    @org.junit.jupiter.api.Test
    void generateDP() {
        assertEquals(1, calc.generateDP(1));
        assertEquals(1, calc.generateDP(2));
        assertEquals(2, calc.generateDP(3));
        assertEquals(3, calc.generateDP(4));
        assertEquals(5, calc.generateDP(5));
        assertEquals(8, calc.generateDP(6));
        assertEquals(13, calc.generateDP(7));
        assertEquals(21, calc.generateDP(8));
    }
}