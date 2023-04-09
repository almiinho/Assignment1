public class Problem6 {
    public static int sqrt(int a1, int n1) {
        int res = 1;
        for (int i = 0; i < n1; i++) {
            res *= a1;
        }
        return res;
    }
}
