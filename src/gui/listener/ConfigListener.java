package gui.listener;

import gui.panel.ConfigPanel;
import util.GUIUtil;
import service.ConfigService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class ConfigListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ConfigPanel p = ConfigPanel.instance;
        if (!GUIUtil.checkNumber(p.tfBudget, "本月预算"))
            return;

        String dbpath =p.tfMysqlPath.getText();
        ConfigService service = new ConfigService();
        if (dbpath.length() != 0) {
            File commandFile = new File(dbpath, "bin/mysql.exe");
            if (!commandFile.exists()) {
                JOptionPane.showMessageDialog(p, "Mysql数据库路径不正确");
                p.tfMysqlPath.grabFocus();
                return;
            }
            service.update("dbpath", p.tfMysqlPath.getText());
        }
        if(p.tfBudget.getText().length() != 0){
            service.update("budget", p.tfBudget.getText());
        }

        JOptionPane.showMessageDialog(p, "设置成功");

    }
}
