package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleBarTest {
    public static void main( String[] args){
        GUIUtil.useLNF();
        JPanel panel = new JPanel();
        CircleBar cbar = new CircleBar();
        cbar.setBackgroundColor(ColorUtil.blueColor);
        cbar.setProgress(0);

        JButton button = new JButton("test");

        panel.setLayout(new BorderLayout());
        panel.add(cbar,BorderLayout.CENTER);
        panel.add(button,BorderLayout.SOUTH);
        GUIUtil.showPanel(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker() {
                    protected Object doInBackground() throws Exception {
                        for (int i = 0; i < 100; i++) {
                            cbar.setProgress(i + 1);
                            cbar.setForegroundColor(ColorUtil.getByPercentage(i + 1));
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        }
                        return null;
                    }

                }.execute();

            }
        });

    }
}
