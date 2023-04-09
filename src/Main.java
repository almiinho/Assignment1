import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = Problem1.findMinFromArr(arr, n);
        System.out.println("minimum in the array: " + min);
        double findAvg = Problem2.findAvFromArr(arr);
        System.out.println("avg of all elements is: " + findAvg);
    }
    }

