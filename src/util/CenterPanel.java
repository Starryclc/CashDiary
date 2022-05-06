package util;

import javax.swing.*;
import java.awt.*;

/**
 * 居中显示组件
 */
public class CenterPanel extends JPanel {
    private double rate;//拉伸比例
    private JComponent c; //显示的组件
    private boolean stretch; //是否拉伸

    public CenterPanel(double rate,boolean strech) {
        this.setLayout(null);
        this.rate = rate;
        this.stretch = strech;
    }


    public void repaint() {
        if (null != c) {
            Dimension containerSize = this.getSize();
            Dimension componentSize= c.getPreferredSize();

            if(stretch)
                c.setSize((int) (containerSize.width * rate), (int) (containerSize.height * rate));
            else
                c.setSize(componentSize);

            c.setLocation(containerSize.width / 2 - c.getSize().width / 2, containerSize.height / 2 - c.getSize().height / 2);
        }
        super.repaint();
    }

    public void show(JComponent p) {
        this.c = p;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }
        add(p);
        this.updateUI();
    }


}
