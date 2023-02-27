package org.learning;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
