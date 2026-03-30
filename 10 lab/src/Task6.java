import javax.swing.*;
import java.awt.*;

public class Task6 extends JPanel {
    String name = "";

    public Task6() {
        JTextField tf = new JTextField(15);
        JButton btn = new JButton("OK");

        add(tf);
        add(btn);

        btn.addActionListener(e -> {
            name = tf.getText();
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Привет, " + name, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task6");
        f.add(new Task6());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}