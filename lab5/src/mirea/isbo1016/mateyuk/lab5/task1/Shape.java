package mirea.isbo1016.mateyuk.lab5.task1;

import java.awt.*;
import java.util.Random;

public abstract class Shape {

    protected int positionX;
    protected int positionY;

    public Color getColor()
    {
        Random rand = new Random();
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);

        java.awt.Color randomColor = new Color(R,G,B);
        return randomColor;
    }

    public Shape()
    {
        this.positionX = 5 + (int) (Math.random() * 445);
        this.positionY = 5 + (int) (Math.random() * 300);
    }


    protected abstract int FirstParameters();
    protected abstract int SecondParameters();
    protected abstract Color setColor();

}
