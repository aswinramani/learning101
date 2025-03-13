package algos;

public class ReverseNumber {
    public static int init(int n) {
        String ns = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = ns.length()-1; i > -1; i--) {
            sb.append(ns.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }
}
