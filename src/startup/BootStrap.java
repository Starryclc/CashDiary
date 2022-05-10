package startup;

import gui.frame.Frame;
import gui.panel.MainPanel;
import gui.panel.SpendPanel;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                Frame.instance.setVisible(true);
                MainPanel.instance.workingPanel.show(SpendPanel.getInstance());
            }
        });
    }
}
