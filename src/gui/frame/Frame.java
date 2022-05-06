package gui.frame;

import gui.panel.SpendPanel;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 450);
        f.setTitle("Cash Diary");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar tb = new JToolBar();
        JButton bSpend = new JButton("消费一览");
        JButton bRecord = new JButton("记一笔");
        JButton bCategory = new JButton("消费分类");
        JButton bReport = new JButton("月消费报表");
        JButton bConfig = new JButton("设置");
        JButton bBackup = new JButton("备份");
        JButton bRecover = new JButton("恢复");

        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);

        f.setLayout(new BorderLayout());
        f.add(tb, BorderLayout.NORTH);
        f.add(new JPanel(), BorderLayout.CENTER);

        //SpendPanel spendPanel = new SpendPanel();
        //f.add(spendPanel, BorderLayout.CENTER);
        //bSpend.addActionListener();

        f.setVisible(true);



    }
}
