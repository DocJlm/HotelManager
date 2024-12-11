/*
 * Created by JFormDesigner on Tue Dec 10 17:45:25 CST 2024
 */

package com.coder.hotel.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.coder.hotel.service.RoomTypeService;
import com.coder.hotel.entity.RoomType;

import com.coder.hotel.util.UiUtil;

/**
 * @author ZQC
 */
public class RoomTypeUpdateUi extends JFrame {
    public RoomTypeUpdateUi() {
        initComponents();
    }
    private static final RoomTypeUpdateUi UI = new RoomTypeUpdateUi();
    public static RoomTypeUpdateUi getInstance() {
        return UI;
    }
    /*public void update(ActionEvent e) {
        UiUtil.indent(UI,RoomTypeUpdateUi.getInstance());
    }*/

    private void update(ActionEvent e) {
        // TODO add your code here
        String typeValue = type.getText();
        String priceValue = price.getText();
        String depositValue = deposit.getText();
        String bednumValue = bednum.getText();
        String remarkValue = remark.getText();

        roomType.setType(typeValue);
        roomType.setPrice(Integer.parseInt(priceValue));
        roomType.setDeposit(Integer.parseInt(depositValue));
        roomType.setBednum(Integer.parseInt(bednumValue));
        roomType.setRemark(remarkValue);
        RoomTypeService service = new RoomTypeService();

        int i = service.update(roomType);
        if(i>0){
            DefaultTableModel model =  (DefaultTableModel) table.getModel();
            Object[][] objects=service.selectList();
            model.setDataVector(objects,new String[]{"id","房型","单价","押金","床位数","备注"});
            table.updateUI();
            JOptionPane.showMessageDialog(this, "更新成功","提示消息",JOptionPane.INFORMATION_MESSAGE);
            goBack(e);
        }


    }

    private void reset(ActionEvent e) {
        // TODO add your code here
        init();
    }
    private void init(){
        type.setText(roomType.getType());
        price.setText(roomType.getPrice().toString());
        deposit.setText(roomType.getDeposit().toString());
        bednum.setText(roomType.getBednum().toString());
        remark.setText(roomType.getRemark());
    }

    private void goBack(ActionEvent e) {
        // TODO add your code here
        reset(e);
        UiUtil.indent(UI,RoomTypeUi.getInstance());
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        type = new JTextField();
        bednum = new JFormattedTextField();
        deposit = new JFormattedTextField();
        price = new JFormattedTextField();
        scrollPane1 = new JScrollPane();
        remark = new JTextArea();
        okBtn = new JButton();
        resetBtn = new JButton();
        backBtn = new JButton();
        label7 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setTitle("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf_\u623f\u578b\u7ba1\u7406_\u4fee\u6539");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf_\u623f\u578b\u7ba1\u7406");
        label1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 28));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setForeground(Color.cyan);
        contentPane.add(label1);
        label1.setBounds(60, 30, 680, 35);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u623f\u578b");
            label2.setHorizontalAlignment(SwingConstants.RIGHT);
            panel1.add(label2);
            label2.setBounds(30, 25, 70, 45);

            //---- label3 ----
            label3.setText("\u5355\u4ef7");
            label3.setHorizontalAlignment(SwingConstants.RIGHT);
            panel1.add(label3);
            label3.setBounds(30, 85, 70, 45);

            //---- label4 ----
            label4.setText("\u62bc\u91d1");
            label4.setHorizontalAlignment(SwingConstants.RIGHT);
            panel1.add(label4);
            label4.setBounds(30, 160, 70, 45);

            //---- label5 ----
            label5.setText("\u5e8a\u4f4d\u6570");
            label5.setHorizontalAlignment(SwingConstants.RIGHT);
            panel1.add(label5);
            label5.setBounds(30, 235, 70, 45);

            //---- label6 ----
            label6.setText("\u5907\u6ce8");
            label6.setHorizontalAlignment(SwingConstants.RIGHT);
            panel1.add(label6);
            label6.setBounds(30, 305, 70, 45);
            panel1.add(type);
            type.setBounds(140, 32, 330, type.getPreferredSize().height);
            panel1.add(bednum);
            bednum.setBounds(140, 242, 330, 30);
            panel1.add(deposit);
            deposit.setBounds(140, 167, 330, 30);
            panel1.add(price);
            price.setBounds(140, 92, 330, 30);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(remark);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(145, 310, 330, 40);

            //---- okBtn ----
            okBtn.setText("\u786e\u5b9a");
            okBtn.addActionListener(e -> update(e));
            panel1.add(okBtn);
            okBtn.setBounds(new Rectangle(new Point(125, 380), okBtn.getPreferredSize()));

            //---- resetBtn ----
            resetBtn.setText("\u91cd\u7f6e");
            resetBtn.addActionListener(e -> reset(e));
            panel1.add(resetBtn);
            resetBtn.setBounds(new Rectangle(new Point(240, 380), resetBtn.getPreferredSize()));

            //---- backBtn ----
            backBtn.setText("\u8fd4\u56de");
            backBtn.addActionListener(e -> goBack(e));
            panel1.add(backBtn);
            backBtn.setBounds(new Rectangle(new Point(360, 380), backBtn.getPreferredSize()));
        }
        contentPane.add(panel1);
        panel1.setBounds(155, 95, 535, 425);

        //---- label7 ----
        label7.setIcon(new ImageIcon(getClass().getResource("/img/\u623f\u95f4\u7c7b\u578b\u7ba1\u7406.png")));
        contentPane.add(label7);
        label7.setBounds(5, 5, 820, 595);

        contentPane.setPreferredSize(new Dimension(835, 625));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void save(ActionEvent e) {
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField type;
    private JFormattedTextField bednum;
    private JFormattedTextField deposit;
    private JFormattedTextField price;
    private JScrollPane scrollPane1;
    private JTextArea remark;
    private JButton okBtn;
    private JButton resetBtn;
    private JButton backBtn;
    private JLabel label7;
    public JTable getTable() {
    return table;
}public void setTable(JTable table) {
    this.table = table;
}private JTable table;


    public RoomType getRoomType() {
    return roomType;
}public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
        init();
}

    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private RoomType roomType;
}
