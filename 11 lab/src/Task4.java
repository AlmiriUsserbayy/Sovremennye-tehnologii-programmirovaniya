import javax.swing.*;
import java.awt.*;

public class Task4 extends JFrame {
    JTextField tf = new JTextField();

    public Task4() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new GridLayout(5, 4));

        add(tf);

        String[] btns = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        for (String s : btns) {
            JButton b = new JButton(s);
            add(b);

            b.addActionListener(e -> {
                if (s.equals("=")) {
                    try {
                        String exp = tf.getText();
                        String[] parts = exp.split(" ");
                        double a = Double.parseDouble(parts[0]);
                        double b1 = Double.parseDouble(parts[2]);

                        switch (parts[1]) {
                            case "+": tf.setText("" + (a + b1)); break;
                            case "-": tf.setText("" + (a - b1)); break;
                            case "*": tf.setText("" + (a * b1)); break;
                            case "/": tf.setText("" + (a / b1)); break;
                        }
                    } catch (Exception ex) {
                        tf.setText("Error");
                    }
                } else if (s.equals("C")) {
                    tf.setText("");
                } else {
                    tf.setText(tf.getText() + s + " ");
                }
            });
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task4();
    }
}