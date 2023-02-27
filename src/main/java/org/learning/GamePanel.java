package org.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int screen_width = 600;
    static final int screen_height = 600;
    static final int unit_size = 25;
    static final int game_units = (screen_width * screen_height) / unit_size;
    static final int delay = 75;
    final int x[] = new int[game_units];
    final int y[] = new int[game_units];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    GamePanel() {

    }

    public void startGame() {

    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {

        public void KeyPressed(KeyEvent e) {

        }
    }

}
