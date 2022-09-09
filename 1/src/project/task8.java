package project;

import java.util.Arrays;
import java.util.Scanner;

public class task8 {

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
        return arr;
    }

    public static int[] createArr(int[] a, int[] b) {
        int i = 0, j = 0;
        int res[] = new int[a.length + b.length];
        if (a[0] > b[0]) {
            res[0] = b[0];
            j++;
        }
        else {
            res[0] = a[0];
            i++;
        }
        int count = 1;
        boolean flagA = false, flagB = false;
        while (count != res.length) {
            if (flagA) {
                while (j < b.length) {
                    res[count] = b[j];
                    count++;
                    j++;
                }
            }
            else
                while (b[j] <= a[i] && !flagB) {
                    res[count] = b[j];
                    j++;
                    count++;
                    if (j == b.length) {
                        j--;
                        flagB = true;
                        break;
                    }
                }
            if (flagB) {
                while (i < a.length) {
                    res[count] = a[i];
                    count++;
                    i++;
                }
            }
            else
                while (b[j] >= a[i] && !flagA) {
                    res[count] = a[i];
                    i++;
                    count++;
                    if (i == a.length) {
                        i--;
                        flagA = true;
                        break;
                    }
                }
        }
        return res;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int n = input();
        int m = input();
        int a[] = inputArr(n);
        int b[] = inputArr(m);
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        int res[] = createArr(a, b);
        printArr(res);
    }
}
