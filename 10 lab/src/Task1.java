import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 80);
        g.drawString("Rectangle", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 200, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 50, 195);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.add(new Task1());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}