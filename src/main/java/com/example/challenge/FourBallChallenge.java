package com.example.challenge;

import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int C_DIAMETER = 10;

    private Ball ball1 = new Ball(0, HEIGHT / 5, 1, C_DIAMETER);
    private Ball ball2 = new Ball(0, 2 * HEIGHT / 5, 2, C_DIAMETER);
    private Ball ball3 = new Ball(0, 3 * HEIGHT / 5, 3, C_DIAMETER);
    private Ball ball4 = new Ball(0, 4 * HEIGHT / 5, 4, C_DIAMETER);

    private List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("com.example.challenge.FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){
        balls = Arrays.asList(ball1,ball2,ball3,ball4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.draw(this));
        balls.forEach(Ball::move);
    }

}

class Ball {

    private final int y;
    private final int speed;
    private final int diameter;
    private int x;

    public Ball(int x, int y, int speed, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void move() {
        x = x + speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(x, y, diameter, diameter);
    }
}