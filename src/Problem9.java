public class Problem9 {
    public static int findBinCoeff(int a, int n) {
        if (n == 0 || n == a) {// if the n or the a equals to 1, out BinomCoeff equals to 1
            return 1;
        } else {
            int binomial = findBinCoeff(a - 1, n - 1) + findBinCoeff(a - 1, n);
            return binomial;//calls default formula for BinomCoeff
        }
    }
}
