import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator {
    /*
    This function has a:
    Time complexity of O(n)
    Memory comlexity of O(1)
     */
    public int generateIteratively(int n) {
        if (n <= 0) return 0; // please?
        if (n <= 2) return 1;

        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /*
    This function has a:
    Time complexity of O(n^2)
    Memory comlexity of O(n)
     */
    public int generateRecursively(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        return generateRecursively(n - 1) + generateRecursively(n - 2);
    }

    /*
    This function has a:
    Time complexity of O(n)
    Memory comlexity of O(n)
     */
    private final Map<Integer, Integer> memo = new HashMap<>();
    public int generateDP(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;

        if (memo.containsKey(n)) return memo.get(n);

        int result = generateDP(n - 1) + generateDP(n - 2);
        memo.put(n, result);
        return result;
    }

}
