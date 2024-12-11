/*
 * Created by JFormDesigner on Tue Dec 03 18:47:03 CST 2024
 */

package com.coder.hotel.ui;

import java.awt.event.*;

import com.coder.hotel.dao.AdminDao;
import com.coder.hotel.dao.impl.AdminDaoImpl;
import com.coder.hotel.entity.Admin;
import com.coder.hotel.util.StringUtil;
import com.coder.hotel.util.UiUtil;
import com.sun.tools.javac.Main;

import java.awt.*;
import javax.swing.*;

/**
 * @author ZQC
 */
public class LoginUi extends JFrame {
    private LoginUi() {
        initComponents();
    }
    private static final LoginUi UI = new LoginUi();
    public static JFrame getFrame() {
        return UI;
    }

    public static void main(String[] args) {
       UiUtil.indent(null,UI);
    }
    //点击刷新验证码
    private void changeCode(MouseEvent e) {
        cv=StringUtil.getCode();
        codeLabel.setText(cv);
    }

    private void login(ActionEvent e) {
        String namevalue = name.getText();
        String pwdvalue = new String(pwd.getPassword());
        String codeValue = code.getText();
        if(cv.equals(codeValue)){
            AdminDao dao = new AdminDaoImpl();
            Admin admin = dao.login(namevalue, pwdvalue);
            if (admin!=null){
                UiUtil.indent(UI,MainUi.getFrame());
//                JOptionPane.showMessageDialog(this,"登录成功","系统提示",
//                        JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"登录失败","用户名或密码错误",
                        JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"验证码错误","系统提示",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void initComponents() {
        cv=StringUtil.getCode();
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        name = new JTextField();
        pwd = new JPasswordField();
        code = new JTextField();
        codeLabel = new JLabel();
        button1 = new JButton();
        label6 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/img/\u9152\u5e97\u4f4f\u5bbf.png")).getImage());
        setTitle("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
        label1.setForeground(new Color(0xff0033));
        contentPane.add(label1);
        label1.setBounds(135, 110, 185, 70);

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setForeground(Color.black);
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u8d26\u6237");
            label2.setForeground(Color.black);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
            panel1.add(label2);
            label2.setBounds(45, 50, 60, 25);

            //---- label3 ----
            label3.setText("\u5bc6\u7801");
            label3.setForeground(Color.black);
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
            panel1.add(label3);
            label3.setBounds(45, 115, 60, 25);

            //---- label4 ----
            label4.setText("\u9a8c\u8bc1\u7801");
            label4.setForeground(Color.black);
            label4.setHorizontalAlignment(SwingConstants.CENTER);
            label4.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
            panel1.add(label4);
            label4.setBounds(45, 190, 60, 25);
            panel1.add(name);
            name.setBounds(140, 47, 185, 30);
            panel1.add(pwd);
            pwd.setBounds(140, 112, 185, 30);
            panel1.add(code);
            code.setBounds(140, 187, 105, 30);

            //---- codeLabel ----
            codeLabel.setForeground(Color.black);
            codeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
            codeLabel.setFont(new Font("Segoe Script", Font.ITALIC, 12));
            codeLabel.setToolTipText("\u70b9\u51fb\u5237\u65b0");
            codeLabel.setText(cv);
            codeLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    changeCode(e);
                }
            });
            panel1.add(codeLabel);
            codeLabel.setBounds(280, 190, 40, 25);

            //---- button1 ----
            button1.setText("\u767b\u5f55");
            button1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 13));
            button1.addActionListener(e -> login(e));
            panel1.add(button1);
            button1.setBounds(60, 240, 290, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(400, 85, 410, 295);

        //---- label6 ----
        label6.setIcon(new ImageIcon(getClass().getResource("/img/akn.png")));
        label6.setForeground(Color.white);
        contentPane.add(label6);
        label6.setBounds(5, 15, 925, 635);

        contentPane.setPreferredSize(new Dimension(935, 685));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField name;
    private JPasswordField pwd;
    private JTextField code;
    private JLabel codeLabel;
    private JButton button1;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    private String cv;
}
