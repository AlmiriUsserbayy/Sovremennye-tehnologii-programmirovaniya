import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JPanel {
    String msg = "";

    public Task4() {
        JButton btn = new JButton("Click");
        add(btn);

        btn.addActionListener(e -> {
            msg = "Button pressed!";
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(msg, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task4");
        f.add(new Task4());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}s