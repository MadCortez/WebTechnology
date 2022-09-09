package project;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {

    public static Map<Integer, Integer> input() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, x);
        map.put(2, y);
        map.put(3, z);
        return map;
    }

    public static void main (String[] args) {
        Map<Integer, Integer> map = input();
        int a = map.get(1);
        int b = map.get(2);
        int h = map.get(3);
        while (a <= b) {
            System.out.print(a + "    ");
            System.out.println(Math.tan(a));
            a += h;
        }
    }
}
