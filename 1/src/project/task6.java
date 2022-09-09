package project;

import java.util.Scanner;

public class task6 {

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

    public static int[][] getMatrix(int[] a) {
        int n = a.length;
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[n];
            int temp = 0;
            for (int j = 0; j < n - i; j++)
                arr[i][j] = a[j + i];
            for (int j = n - i; j < n; j++) {
                arr[i][j] = a[temp];
                temp++;
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = input();
        int a[] = inputArr(n);
        int arr[][] = getMatrix(a);
        printMatrix(arr);
    }
}
