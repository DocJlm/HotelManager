/*
 * Created by JFormDesigner on Fri Nov 29 01:50:42 CST 2024
 */

package com.coder.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author ZQC
 */
public class MainUi extends JFrame {
    public MainUi() {
        initComponents();
    }

    public static void main(String[] args) {
        MainUi mainUi=new MainUi();
        mainUi.setVisible(true);
    }

    private void login(ActionEvent e) {
        System.out.println("hello");
    }

    private void doReset(ActionEvent e) {
        name.setText("");
        pwd.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        title = new JLabel();
        textField1 = new JTextField();
        name = new JTextField();
        pwd = new JPasswordField();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf");
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- title ----
        title.setText("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf");
        title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
        title.setForeground(Color.cyan);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setToolTipText("\u63d0\u793a");
        contentPane.add(title);
        title.setBounds(110, 10, 265, 35);

        //---- textField1 ----
        textField1.setText("\u8d26\u6237");
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(textField1);
        textField1.setBounds(new Rectangle(new Point(80, 80), textField1.getPreferredSize()));
        contentPane.add(name);
        name.setBounds(170, 80, 190, name.getPreferredSize().height);
        contentPane.add(pwd);
        pwd.setBounds(170, 140, 190, pwd.getPreferredSize().height);

        //---- textField3 ----
        textField3.setText("\u5bc6\u7801");
        textField3.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(textField3);
        textField3.setBounds(new Rectangle(new Point(80, 140), textField3.getPreferredSize()));

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addActionListener(e -> login(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(160, 240), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");
        button2.addActionListener(e -> doReset(e));
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(280, 240), button2.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(505, 330));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel title;
    private JTextField textField1;
    private JTextField name;
    private JPasswordField pwd;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
