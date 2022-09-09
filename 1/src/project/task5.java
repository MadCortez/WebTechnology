package project;

import java.util.Scanner;

public class task5 {

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

    public static void main(String[] args) {
        int n = input();
        int a[] = inputArr(n);

    }
}
