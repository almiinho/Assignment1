import static java.lang.Math.min;
public class Problem2 {
    public static double findAvFromArr(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = 0;
        average = sum / arr.length;
        return average;
    }
}
