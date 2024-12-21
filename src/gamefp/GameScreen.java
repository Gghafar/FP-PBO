package gamefp;

import javax.swing.JFrame;
import java.awt.Color;

public class GameScreen {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setBounds(10, 10, 1000, 600);
        jframe.setBackground(new Color(0XB2A4FF));
        jframe.setTitle("LUDO");
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GameMoves gm = new GameMoves(); // Pastikan ini tidak ada kesalahan
        gm.setFocusable(true);
        gm.addKeyListener(gm);
        gm.addMouseListener(gm);
        jframe.add(gm);
        jframe.setVisible(true);
    }
}

