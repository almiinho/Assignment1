public class Problem6 {
    public int FindPowerOf(int a, int b){
        if (b == 1){
            return a;
        }
        else{
            return a*FindPowerOf(a, b-1);// multiplying a to n times
        }
    }
}
