/*
 * Created by JFormDesigner on Wed Dec 04 13:37:20 CST 2024
 */

package com.coder.test;

import com.coder.hotel.util.UiUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author ZQC
 */
public class TableUi extends JFrame {
    public TableUi() {
        initComponents();
    }

    public static void main(String[] args) {
        UiUtil.indent(null,new TableUi());
    }
    class CustomModel extends DefaultTableModel {
        //一维数组是表头，二维数组是下面表格
        public CustomModel(Object[][] data,Object[] columnNames){
            super(data,columnNames);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(175, 95, 385, 315);

        contentPane.setPreferredSize(new Dimension(775, 620));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private CustomModel model;
}
