package lab_01.model;

import java.awt.*;

public class Rect extends Figure{
    protected int sideA, sideB;

    public Rect(int x, int y, int sideA, int sideB) {
        super( x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect( x, y, sideA, sideB);
    }
}

