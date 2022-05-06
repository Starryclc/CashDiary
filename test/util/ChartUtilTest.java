package util;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class ChartUtilTest {
    public static void main(String[] args) {
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        Image img = ChartUtil.getImage(400, 300);
        Icon icon = new ImageIcon(img);
        l.setIcon(icon);
        p.add(l);
        GUIUtil.showPanel(p);
    }
}
