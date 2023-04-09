public class Problem4 {
    public int FindFact(int n)
    {
        int res;
        if(n==1){
            return 1;
        }
        res = FindFact(n-1)* n; //finds factorial of a number with recursion
        return res;
    }
}
