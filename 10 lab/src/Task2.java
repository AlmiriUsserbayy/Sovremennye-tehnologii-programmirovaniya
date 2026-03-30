import javax.swing.*;
import java.awt.*;

public class Task2 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 80, 80);

        g.setColor(Color.GREEN);
        g.fillOval(150, 50, 80, 80);

        g.setColor(Color.BLUE);
        g.drawLine(50, 150, 200, 150);

        g.setColor(Color.ORANGE);
        g.drawString("Colors", 50, 200);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task2");
        f.add(new Task2());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}