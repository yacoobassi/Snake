package snake;

import javax.swing.JFrame;

public class SnakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        SnakePanel panel = new SnakePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
