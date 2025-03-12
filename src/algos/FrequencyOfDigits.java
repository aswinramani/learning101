package algos;

public class FrequencyOfDigits {
    public int init(int n, int d) {
     int c = 0;
     while (n > 0) {
         if (n % 10 == d) {
             c++;
         }
         n /= 10;
     }
     return c;
    }
}
