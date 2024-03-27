package lab_01;

import lab_01.ex01.AbstractBase;
import lab_01.ex01.AbstractBaseAdapter;
import lab_01.model.Circle;
import lab_01.model.Figure;
import lab_01.model.Rect;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

    public static void main(String[] args) {
        new Main();
    }

    private Figure[] figures;
    private int countFigures;
    public Main(){
        this.figures = new Figure[1000];
        this.countFigures = 0;

        for(int i=0; i<10; i++)
            this.figures[countFigures++] = getFigure();

        this.setSize( 640, 480);
        this.setVisible(true);

        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        this.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        figures[countFigures++] = getFigure();
                        repaint();
                    }
                }
        );

        AbstractBase ab = new AbstractBaseAdapter() {
            @Override
            public void method1() {
                super.method1();
            }
        };
        ab.method1();
    }

    protected Figure getFigure(){
        return switch ((int)(Math.random()*2)){
            case 0 -> new Rect(
                    (int)(Math.random()*640),
                    (int)(Math.random()*480),
                    50, 150
            );
            default -> new Circle(
                    (int)(Math.random()*640),
                    (int)(Math.random()*480),
                    35
            );
        };
    }

    @Override
    public void paint(Graphics g) {
        for(int i=0; i<countFigure; i++)
            figures[i].draw(g);
    }
}
