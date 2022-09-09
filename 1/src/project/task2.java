package project;
import javafx.util.Pair;

import java.util.Scanner;

public class task2 {

    public static Pair<Integer, Integer> input() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        return new Pair(x, y);
    }

    public static boolean checkEntry(int x, int y) {
        if (x <= 6 && x >= -6 && y <=0 && y >= -3)
            return true;
        else
        if (x <= 4 && x >= -4 && y >= 0 && y <= 5)
            return true;
        else
            return false;
    }

    public static void main (String[] args) {
        Pair<Integer, Integer> inpt = input();
        int x = inpt.getKey();
        int y = inpt.getValue();
        if (checkEntry(x, y))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
