import javax.swing.*;
import java.awt.*;

public class Task7 extends JPanel {
    Color color = Color.BLACK;

    public Task7() {
        JButton r = new JButton("Red");
        JButton g = new JButton("Green");
        JButton b = new JButton("Blue");

        add(r); add(g); add(b);

        r.addActionListener(e -> { color = Color.RED; repaint(); });
        g.addActionListener(e -> { color = Color.GREEN; repaint(); });
        b.addActionListener(e -> { color = Color.BLUE; repaint(); });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(120, 100, 80, 80);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task7");
        f.add(new Task7());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}