package project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.*;

public class task4 {

    public static int input() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public static int[] inputArr(int n) {
        int arr[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        scanner.close();
        return arr;
    }

    public static boolean checkPrime(int x) {
        BigInteger bigInteger = BigInteger.valueOf(x);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(x));
        if (probablePrime)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = input();
        int a[] = inputArr(n);
        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i]))
                System.out.print((i + 1) + " ");
        }
    }
}
