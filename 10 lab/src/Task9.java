import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task9 extends JPanel {
    int x = -1, y = -1;

    public Task9() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x != -1) {
            g.fillOval(x, y, 10, 10);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task9");
        f.add(new Task9());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}