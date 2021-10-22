package com.example.challenge;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int C_DIAMETER = 10;
    int position = 0;

    Circle newCircle1 = new Circle(1, HEIGHT / 5, C_DIAMETER);
    Circle newCircle2 = new Circle(2, 2 * HEIGHT / 5, C_DIAMETER);
    Circle newCircle3 = new Circle(3, 3 * HEIGHT / 5, C_DIAMETER);
    Circle newCircle4 = new Circle(4, 4 * HEIGHT / 5, C_DIAMETER);

    public static void main(String[] args) {
        PApplet.main("com.example.challenge.FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        newCircle1.drawCircle(position, HEIGHT / 5, C_DIAMETER);
        newCircle2.drawCircle(position, 2 * HEIGHT / 5, C_DIAMETER);
        newCircle3.drawCircle(position, 3 * HEIGHT / 5, C_DIAMETER);
        newCircle4.drawCircle(position, 4 * HEIGHT / 5, C_DIAMETER);
    }

}
