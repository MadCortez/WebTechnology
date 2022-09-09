package project;
import javafx.util.Pair;
import java.util.Scanner;

public class task1 {

    public static Pair<Integer, Integer> input() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        return new Pair(x, y);
    }

    public static double calc(double x, double y) {
        double z = Math.abs(x - ((2 * x) / (1 + x * x * y * y)));
        double c = Math.sin(x + y);
        double ans = (1 + Math.pow(Math.sin(x + y), 2) / (2 + z)) + x;
        return ans;
    }

    public static void main (String[] args) {
        Pair<Integer, Integer> inpt = input();
        int x = inpt.getKey();
        int y = inpt.getValue();
        double ans = calc(x, y);
        System.out.println(ans);
    }
}
