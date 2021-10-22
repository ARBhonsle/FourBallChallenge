package com.example.challenge;

import processing.core.PApplet;

public class Circle extends PApplet {
    private final int rate;
    private final int height;
    private final int diameter;

    public Circle(int rate, int height, int diameter) {
       this.rate=rate;
       this.height=height;
       this.diameter=diameter;
    }

    public void drawCircle(int position, int height, int diameter) {
        while(true) {
            ellipse(position, height, diameter, diameter);
            position=incrementPosition(position);
        }

    }

    public int incrementPosition(int position){
        return position+this.rate;
    }
}
