package project;

import java.util.Scanner;

public class task7 {

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

    public static int[] sortArr(int[] a) {
        int i = 0;
        while (i < a.length - 1){
            if (a[i] > a[i + 1]){
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                if (i > 0)
                    i--;
            }
            else
                i++;
        }
        return a;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int n = input();
        int a[] = inputArr(n);
        a = sortArr(a);
        printArr(a);
    }
}
