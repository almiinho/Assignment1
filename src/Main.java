import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  n: ");// enters number of elements in array
        n = scanner.nextInt();
        System.out.print("Enter the  a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the  b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the  a1: ");
        int a1 = scanner.nextInt();
        System.out.print("Enter the  n1: ");
        int n1 = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = Problem1.findMinFromArr(arr, n);
        System.out.println("minimum in the array: " + min);// finds the minimum value in array
        double findAvg = Problem2.findAvFromArr(arr);
        System.out.println("avg of all elements is: " + findAvg);// finds average value in array
        Problem3 aa = new Problem3(n);
        System.out.println("Number is " + aa.Prime(n));//checks does 'n' is a prime number or no
        Problem4 bb = new Problem4();
        System.out.println("factorial of n: " + bb.FindFact(n));//finds factorial of 'n'
        int findFib = Problem5.fibonacci(n);
        System.out.println(" n-th element in Fibonacci sequence is: " + findFib);//finds 'n'th element in fibonacci sequence
        Problem6 c = new Problem6();
        int findSqrt = Problem6.sqrt(a1, n1);
        System.out.println("a^n: " + findSqrt);
        String g = scanner.nextLine();
        Problem8 d = new Problem8();
        System.out.println("Problem 8: "+d.isAllDigits(g));//checks does all elements in array digits
        int binomial = Problem9.findBinCoeff(a, n);
        System.out.println(binomial);//finds binomial coefficient
        int findGcd = Problem10.gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is " + findGcd);//finds GCD of 'a' and 'b' numbers
    }
    }

