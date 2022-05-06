package gui.panel;

import org.junit.Test;
import util.GUIUtil;

import java.util.TreeMap;

public class PanelTest {
    @Test
    public void mainPanelTest() throws InterruptedException {
        GUIUtil.showPanel(MainPanel.instance, 1);
        Thread.sleep(5000);
    }

    @Test
    public void spendPanelTest() throws InterruptedException {
        GUIUtil.showPanel(SpendPanel.getInstance(), 1);
        Thread.sleep(5000);
    }

    @Test
    public void recordPanelTest() throws InterruptedException {
        GUIUtil.showPanel(RecordPanel.instance);
        Thread.sleep(5000);
    }

    @Test
    public void categoryPanelTest() throws InterruptedException{
        GUIUtil.showPanel(CategoryPanel.instance);
        Thread.sleep(5000);

    }

    @Test
    public void reportPanelTest() throws InterruptedException {
        GUIUtil.showPanel(ReportPanel.instance);
        Thread.sleep(5000);
    }

    @Test
    public void configPanelTest() throws InterruptedException{
        GUIUtil.showPanel(ConfigPanel.instance);
        Thread.sleep(5000);
    }

    @Test
    public void recoverPanelTest() throws InterruptedException {
        GUIUtil.showPanel(RecoverPanel.instance);
        Thread.sleep(5000);
    }

    @Test
    public void backupPanelTest() throws InterruptedException {
        GUIUtil.showPanel(BackupPanel.instance);
        Thread.sleep(5000);
    }

}
