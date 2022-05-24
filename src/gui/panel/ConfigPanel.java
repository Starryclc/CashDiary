package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entity.Config;
import gui.listener.ConfigListener;
import service.ConfigService;
import util.ColorUtil;
import util.GUIUtil;

public class ConfigPanel extends WorkingPanel {
    static{
        GUIUtil.useLNF();
    }
    public static ConfigPanel instance = new ConfigPanel();

    JLabel lBudget = new JLabel("本月预算(￥)");
    public JTextField tfBudget = new JTextField("0");

    JLabel lMysql = new JLabel("Mysql安装目录");
    public JTextField tfMysqlPath = new JTextField("");

    JButton bSubmit = new JButton("更新");

    public ConfigPanel() {
        GUIUtil.setColor(ColorUtil.grayColor, lBudget,lMysql);
        GUIUtil.setColor(ColorUtil.blueColor, bSubmit);

        JPanel pInput =new JPanel();
        JPanel pSubmit = new JPanel();
        int gap =40;
        pInput.setLayout(new GridLayout(4,1,gap,gap));

        pInput.add(lBudget);
        pInput.add(tfBudget);
        pInput.add(lMysql);
        pInput.add(tfMysqlPath);
        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);

        pSubmit.add(bSubmit);
        this.add(pSubmit,BorderLayout.CENTER);



        this.setText();
    }

    private void setText() {
        ConfigService service = new ConfigService();
        String budget = service.get("budget");
        String dbpath = service.get("dbpath");
        tfMysqlPath.setText(dbpath);
        tfBudget.setText(budget);
    }

    @Override
    public void addListener() {
        ConfigListener listener = new ConfigListener();
        bSubmit.addActionListener(listener);

    }

    @Override
    public void updateData() {
        String budget =  new ConfigService().get("budget");
        String mysqlPath = new ConfigService().get("dbpath");
        tfBudget.setText(budget);
        tfMysqlPath.setText(mysqlPath);
        tfBudget.grabFocus();
    }
}
