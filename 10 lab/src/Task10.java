import javax.swing.*;
import java.awt.*;

public class Task10 extends JPanel {
    String text = "";
    Color color = Color.RED;

    public Task10() {
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("Show");

        add(tf);
        add(btn);

        btn.addActionListener(e -> {
            text = tf.getText();

            color = new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
            );

            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 200);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.add(new Task10());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}