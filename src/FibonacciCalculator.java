import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {
    public int generateIteratively(int n) {
        if(n < 3) { return 1; } // I HATE {} here
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    public int generateRecursively(int n) {
        if(n < 3) { return 1; } // Also here
        return generateIteratively(n - 2) + generateRecursively(n - 1);
    }
    private static List<Integer> fibonacci = new ArrayList<>();
    static {
        fibonacci.add(1);
        fibonacci.add(1);
    }
    public int generateDP(int n) {
        if(n <= fibonacci.size()) { return fibonacci.get(n - 1).intValue(); } // And HERE
        int fib = generateDP(n - 2) + generateDP(n - 1);
        fibonacci.add(fib);
        return fib;
    }

}
