package main;

import javax.swing.*;

public class GameWindow {

    // normally we would extend it but for now we are trying something new
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel){
        jFrame = new JFrame();

        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);

    }
}
