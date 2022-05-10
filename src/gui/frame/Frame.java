package gui.frame;

import gui.panel.MainPanel;
import gui.panel.SpendPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    public static Frame instance = new Frame();

    private Frame(){
        this.setSize(500,450);
        this.setTitle("Cash Diary");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    public static void main(String[] args) {
//        instance.setVisible(true);
//    }

}
