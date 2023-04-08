import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinFromArr(arr, n);
        System.out.println("Problem 1. Min from arr is: " + min);
    }
/*
@findMinFromArr- finds minimum value from the array
@n- length of array
@return Math.min-returning minimum of function
 */
    public static int findMinFromArr(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1); //move with n-1 length
            return Math.min(min, arr[n-1]);//return lower number
        }
    }
}