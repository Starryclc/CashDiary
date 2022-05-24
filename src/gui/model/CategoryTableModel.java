package gui.model;

import entity.Category;
import gui.panel.CategoryPanel;
import service.CategoryService;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CategoryTableModel extends AbstractTableModel {
    public String[] columnNames = new String[]{"分类名称","消费次数"};
    public List<Category> cs = new CategoryService().list();


    @Override
    public int getRowCount() {
        return cs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category c = cs.get(rowIndex);
        if(columnIndex == 0)
            return c.getName();
        if(columnIndex == 1)
            return c.getRecordNumber();
        return null;
    }

}
