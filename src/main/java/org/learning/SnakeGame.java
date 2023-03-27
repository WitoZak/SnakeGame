package org.learning;

import java.awt.*;

public class SnakeGame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GamePanel gamePanel = new GamePanel();
            gamePanel.createGUI();
        });
    }
}