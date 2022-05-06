package util;

import org.junit.Test;

import javax.swing.*;

public class CenterPanelTest {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        CenterPanel panel = new CenterPanel(0.85,true);
        f.setContentPane(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JButton b  =new JButton("test");
        panel.show(b);

    }
}
