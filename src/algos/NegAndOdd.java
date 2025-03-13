package algos;

public class NegAndOdd {
    public static int init(int[] n) {
        int sum = 0;
        for (int i : n) {
            if (i < 0 && (i & 1) == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
