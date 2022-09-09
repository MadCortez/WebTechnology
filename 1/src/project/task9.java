package project;

import java.util.ArrayList;
import java.util.Arrays;

class Basket {
    public ArrayList<Ball> balls;
    public double weight;

    public Basket()
    {
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls)
    {
        if (balls == null)
            throw new NullPointerException();

        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            add(ball);
    }

    public void add(Ball newBall)
    {
        if (newBall == null)
            throw new NullPointerException();

        this.balls.add(newBall);
        this.weight += newBall.weight;
    }

    public void remove(Ball ball){
        balls.remove(ball);
        this.weight -= ball.weight;
    }

    public int getColorCount(Color color)
    {
        int numOfBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.color == color)
                numOfBalls++;
        }

        return numOfBalls;
    }
}

class Ball {
    public Color color;
    public double weight;

    public Ball(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }
}

enum Color {
    BLACK,
    BLUE,
    GREEN,
    RED,
    WHITE,
    YELLOW
}

public class task9 {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.GREEN, 0.1),
                new Ball(Color.WHITE, 0.2),
                new Ball(Color.BLUE, 0.4),
                new Ball(Color.YELLOW, 0.3)
        ));

        Basket basket = new Basket(balls);
        System.out.print("Wight of balls in basket: ");
        double we = 0;
        int res = 0;
        for (Ball ball: basket.balls)
            we += ball.weight;
        System.out.println(we);
        System.out.print("Count of blue balls in basket: ");
        for (Ball ball: basket.balls)
            if (ball.color == Color.BLUE)
                res++;
        System.out.println(res);
    }
}
