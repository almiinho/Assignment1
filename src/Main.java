import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  n: ");// enters number of elements in array
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = Problem1.findMinFromArr(arr, n);
        System.out.println("minimum in the array: " + min);// finds the minimum value in array
        double findAvg = Problem2.findAvFromArr(arr);
        System.out.println("avg of all elements is: " + findAvg);// finds average value in array
        Problem3 a = new Problem3(n);
        System.out.println("Problem 3: "+a.Prime(n));//checks does n is a prime number or no
        }
    }

