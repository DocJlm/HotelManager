/*
 * Created by JFormDesigner on Wed Dec 04 14:57:56 CST 2024
 */

package com.coder.hotel.ui;

import java.awt.event.*;
import com.coder.hotel.dao.RoomTypeDao;
import com.coder.hotel.dao.impl.RoomTypeDaoImpl;
import com.coder.hotel.entity.RoomType;
import com.coder.hotel.service.RoomTypeService;
import com.coder.hotel.util.UiUtil;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author ZQC
 */
public class RoomTypeUi extends JFrame {
    private RoomTypeUi() {
        initComponents();
    }

    private static final RoomTypeUi UI = new RoomTypeUi();
    public static RoomTypeUi getInstance() {
        return UI;
    }

    private void goBack(ActionEvent e) {
        UiUtil.indent(UI,MainUi.getFrame());
    }
    class CustomModel extends DefaultTableModel{
        public CustomModel(Object[][] data,Object[] column){
            super(data, column);
        }
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    public void update(ActionEvent e){

        int rowCount = table1.getSelectedRowCount();
        if(rowCount==0){
            JOptionPane.showMessageDialog(this,"请至少选中一行","提示信息",JOptionPane.WARNING_MESSAGE);
            return;
        }else if(rowCount>1){
            JOptionPane.showMessageDialog(this,"请只选中一行","提示信息",JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            int row = table1.getSelectedRow();
            Object id = model.getValueAt(row, 0);
            RoomTypeService service = new RoomTypeService();
            RoomType roomType = service.selectId(id);
            RoomTypeUpdateUi typeUpdateUi = RoomTypeUpdateUi.getInstance();
            typeUpdateUi.setRoomType(roomType);
            typeUpdateUi.setTable(table1);
            UiUtil.indent(UI,typeUpdateUi);}
    }
    private void goAdd(ActionEvent e) {
        RoomTypeAddUi ui = RoomTypeAddUi.getInstance();
        ui.setTable(table1);
        UiUtil.indent(RoomTypeUi.getInstance(),ui);
    }
    private void query(ActionEvent e) {
        String text = textField1.getText();
        if(text.equals("")){
            objects = service.selectList();


        }else{
            objects = service.selectByType(text);
        }
        model.setDataVector(objects,column);
//        table1.setModel(model);
        table1.updateUI();
        textField1.setText("");
    }
    private void delete(ActionEvent e) {
        int rowCount = table1.getSelectedRowCount();
        if(rowCount==0){
            JOptionPane.showMessageDialog(this,"请至少选中一行","提示信息",JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            int y=JOptionPane.showConfirmDialog(table1,"确定删除吗","提示信息",JOptionPane.WARNING_MESSAGE);
            if(y==0) {
                int[] selectedRows = table1.getSelectedRows();
                for (int selectedRow : selectedRows) {
                    Object id = model.getValueAt(selectedRow, 0);
                    service.deleteId(id);
                }


                for (int i = selectedRows.length; i > 0; i--) {
                    int x = table1.getSelectedRow();
                    model.removeRow(x);
                }
            }


        }
        table1.updateUI();//更新
    }

    private void initComponents() {
        setResizable(false);
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button4 = new JButton();
        scrollPane1 = new JScrollPane();


        service = new RoomTypeService();
         objects = service.selectList();
        column = new String[]{"id","房型","单价","押金","床位数","备注"};
        model=new CustomModel(objects,column);
        table1 = new JTable(model);
        //设计样式
//设置表头背景色
        table1.getTableHeader().setBackground(Color.ORANGE);
        //设置表头前景色
        table1.getTableHeader().setForeground(Color.RED);
        //设置表头高度
        table1.getTableHeader().setPreferredSize(new Dimension(1,30));
        //设置行高
        table1.setRowHeight(25);
        button5 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/img/\u9152\u5e97\u4f4f\u5bbf.png")).getImage());
        setTitle("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf_\u623f\u578b\u7ba1\u7406");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf_\u623f\u578b\u7ba1\u7406");
        label1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 28));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setForeground(Color.cyan);
        contentPane.add(label1);
        label1.setBounds(65, 20, 680, 35);

        //---- button1 ----
        button1.setText("\u65b0\u589e");
        button1.setIcon(new ImageIcon(getClass().getResource("/img/\u589e\u52a0.png")));
        button1.setBackground(new Color(0xcccccc));
        contentPane.add(button1);
        button1.setBounds(220, 165, 105, button1.getPreferredSize().height);
        button1.addActionListener(this::goAdd);

        //---- button2 ----
        button2.setText("\u5220\u9664");
        button2.setIcon(new ImageIcon(getClass().getResource("/img/\u5220\u9664.png")));
        button2.setBackground(new Color(0xcccccc));
        contentPane.add(button2);
        button2.setBounds(330, 165, 105, 30);
        button2.addActionListener(this::delete);

        //---- button3 ----
        button3.setText("\u4fee\u6539");
        button3.setIcon(new ImageIcon(getClass().getResource("/img/\u4fee\u6539.png")));
        button3.setBackground(new Color(0xcccccc));
        contentPane.add(button3);
        button3.setBounds(440, 165, 105, 30);
        button3.addActionListener(this::update);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0xccccff));
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u623f\u95f4\u7c7b\u578b");
            label2.setForeground(Color.black);
            label2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
            panel1.add(label2);
            label2.setBounds(40, 25, label2.getPreferredSize().width, 25);

            //---- textField1 ----
            textField1.setBackground(Color.white);
            panel1.add(textField1);
            textField1.setBounds(125, 20, 115, 35);

            //---- button4 ----
            button4.setText("\u67e5\u8be2");
            button4.setIcon(new ImageIcon(getClass().getResource("/img/\u67e5\u8be2.png")));
            button4.setBackground(new Color(0xcccccc));
            panel1.add(button4);
            button4.setBounds(265, 20, 90, button4.getPreferredSize().height);
            button4.addActionListener(this::query);
        }
        contentPane.add(panel1);
        panel1.setBounds(205, 85, 430, 65);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(190, 220, 460, 297);

        //---- button5 ----
        button5.setText("\u8fd4\u56de");
        button5.addActionListener(e -> goBack(e));
        contentPane.add(button5);
        button5.setBounds(new Rectangle(new Point(730, 555), button5.getPreferredSize()));

        //---- label3 ----
        label3.setIcon(new ImageIcon(getClass().getResource("/img/\u623f\u95f4\u7c7b\u578b\u7ba1\u7406.png")));
        contentPane.add(label3);
        label3.setBounds(5, 0, 845, 605);

        contentPane.setPreferredSize(new Dimension(855, 640));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button4;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button5;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private CustomModel model;
    private Object[][] objects;
    private RoomTypeService service;
    private String[] column;
}
