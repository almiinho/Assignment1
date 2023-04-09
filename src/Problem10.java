public class Problem10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;//if a equals to 0 we just return 0
        } else
        {
            return gcd(b, a % b);
        }
    }
}
