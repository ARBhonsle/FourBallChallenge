package com.example.challenge;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int C_DIAMETER = 10;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;

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
        drawCircle();

    }

    private void drawCircle() {
        ellipse(x1, HEIGHT/5, C_DIAMETER, C_DIAMETER);
        x1++;
        ellipse(x2, 2*HEIGHT/5, C_DIAMETER, C_DIAMETER);
        x2+=2;
        ellipse(x3, 3*HEIGHT/5, C_DIAMETER, C_DIAMETER);
        x3+=3;
        ellipse(x4, 4*HEIGHT/5, C_DIAMETER, C_DIAMETER);
        x4+=4;
    }

}
