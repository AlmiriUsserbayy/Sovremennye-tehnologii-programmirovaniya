import javax.swing.*;
import java.awt.*;

public class Task5 extends JPanel {
    int count = 0;

    public Task5() {
        JButton btn = new JButton("Click me");
        add(btn);

        btn.addActionListener(e -> {
            count++;
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Clicks: " + count, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task5");
        f.add(new Task5());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}