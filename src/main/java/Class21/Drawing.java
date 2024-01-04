package Class21;

import javax.swing.*;
import java.awt.*;

public class Drawing {
    public static void main(String[] args) {
        JFrame jframe=new JFrame();
        jframe.setSize(2000,2000);
        MyDrawing m=new MyDrawing();
        jframe.add(m);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
class MyDrawing extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        for (int i = 100; i <=600;i = i + 50){
            g.fillOval(i, 200, 500, 500);
        }
    }
}
