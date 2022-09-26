
package com.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class LineTableModel extends AbstractTableModel {

    private String[] columns = {"Item", "Unit Price", "Count", "Total"};
    private ArrayList<InvoiceLine> lines;

    public LineTableModel() {
        this(new ArrayList<InvoiceLine>());
    }

    
    public LineTableModel(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line = lines.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return line.getName();
            case 1:
                return line.getPrice();
            case 2:
                return line.getCount();
            case 3:
                return line.getTotal();
            default:
                return "";
        }
    }
}
