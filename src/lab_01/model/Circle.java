package lab_01.model;

import java.awt.*;

public class Circle extends Figure {
    protected int radius;

    public Circle(int x, int y, int radius) {
        super( x, y);
        this.radius = radius;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval( x, y, 2*radius, 2*radius);
    }
}
