package gui.model;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class CategoryComboBoxModel implements ComboBoxModel {
    public List<String> cs = new ArrayList<>();
    String selected;

    public CategoryComboBoxModel(){
        cs.add("1");
        cs.add("2");
        cs.add("3");
        cs.get(0);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selected = (String) anItem;

    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return cs.size();
    }

    @Override
    public Object getElementAt(int index) {
        return cs.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }


}
