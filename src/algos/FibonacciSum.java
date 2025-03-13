package algos;

public class FibonacciSum {

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int init(int n) {
        return fibonacci(n  + 2) - 1;
    }
}
