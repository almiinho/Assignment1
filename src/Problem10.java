public class Problem10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;        } else {
            return gcd(b, a % b);
        }
    }
}
