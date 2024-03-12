package gui_01;

import com.sun.tools.javac.Main;

import java.awt.*;

public class zad_1 extends Frame {
    public static void main(String[] args) {
        new zad_1();
    }

    public zad_1(){
        this.setSize(640, 480);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.fillOval(
                100 , 100 , 200, 150
        );
    }
}
