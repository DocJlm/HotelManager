/*
 * Created by JFormDesigner on Fri Nov 29 03:04:05 CST 2024
 */

package com.coder.hotel.ui;

import com.coder.hotel.util.UiUtil;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author ZQC
 */
public class MainUi extends JFrame {
    private MainUi() {
        initComponents();
    }
    private static final MainUi UI = new MainUi();
    public static JFrame getFrame() {
        return UI;
    }
//执行返回操作
    private void back(ActionEvent e) {
        UiUtil.indent(UI,LoginUi.getFrame());
    }

    private void linkRoomTypeUi(ActionEvent e) {
        UiUtil.indent(UI,RoomTypeUi.getInstance());
    }

    private void initComponents() {
        setResizable(false);
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/img/\u9152\u5e97\u4f4f\u5bbf.png")).getImage());
        setTitle("\u9152\u5e97\u7ba1\u7406\u7cfb\u7edf");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button1.setIcon(new ImageIcon(getClass().getResource("/img/\u8ba2\u623f.png")));
        button1.setText("\u8ba2\u623f\u7ba1\u7406");
        contentPane.add(button1);
        button1.setBounds(90, 150, 120, 115);

        //---- button2 ----
        button2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button2.setSelectedIcon(null);
        button2.setIcon(new ImageIcon(getClass().getResource("/img/\u9000\u623f.png")));
        button2.setText("\u9000\u623f\u7ba1\u7406");
        contentPane.add(button2);
        button2.setBounds(210, 150, 120, 115);

        //---- button3 ----
        button3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button3.setText("\u5546\u54c1\u8ba2\u5355");
        button3.setIcon(new ImageIcon(getClass().getResource("/img/\u5546\u54c1\u8ba2\u5355.png")));
        contentPane.add(button3);
        button3.setBounds(330, 150, 120, 115);

        //---- button4 ----
        button4.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button4.setText("\u623f\u95f4\u6253\u626b");
        button4.setIcon(new ImageIcon(getClass().getResource("/img/\u6253\u626b.png")));
        contentPane.add(button4);
        button4.setBounds(450, 150, 120, 115);

        //---- button5 ----
        button5.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button5.setText("\u623f\u578b\u7ba1\u7406");
        button5.setIcon(new ImageIcon(getClass().getResource("/img/\u623f\u578b.png")));
        button5.addActionListener(e -> linkRoomTypeUi(e));
        contentPane.add(button5);
        button5.setBounds(85, 435, 120, 115);

        //---- button6 ----
        button6.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button6.setText("\u623f\u95f4\u7ba1\u7406");
        button6.setIcon(new ImageIcon(getClass().getResource("/img/\u623f\u95f4\u7ba1\u7406.png")));
        contentPane.add(button6);
        button6.setBounds(205, 435, 120, 115);

        //---- button7 ----
        button7.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button7.setText("\u4f1a\u5458\u7b49\u7ea7");
        button7.setIcon(new ImageIcon(getClass().getResource("/img/\u4f1a\u5458\u7b49\u7ea7.png")));
        contentPane.add(button7);
        button7.setBounds(325, 435, 120, 115);

        //---- button8 ----
        button8.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button8.setText("\u8d22\u52a1\u7ba1\u7406");
        button8.setIcon(new ImageIcon(getClass().getResource("/img/43\u8d22\u52a1-\u7ebf\u6027.png")));
        contentPane.add(button8);
        button8.setBounds(570, 150, 120, 115);

        //---- button9 ----
        button9.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button9.setText("\u4f1a\u5458\u4fe1\u606f");
        button9.setIcon(new ImageIcon(getClass().getResource("/img/\u4f1a\u5458 (1).png")));
        contentPane.add(button9);
        button9.setBounds(445, 435, 120, 115);

        //---- button10 ----
        button10.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button10.setText("\u4f4f\u5bbf\u7c7b\u578b");
        button10.setIcon(new ImageIcon(getClass().getResource("/img/\u4f4f\u5bbf.png")));
        contentPane.add(button10);
        button10.setBounds(565, 435, 120, 115);

        //---- button11 ----
        button11.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button11.setText("\u5546\u54c1\u7ba1\u7406");
        button11.setIcon(new ImageIcon(getClass().getResource("/img/\u5546\u54c1.png")));
        contentPane.add(button11);
        button11.setBounds(685, 435, 120, 115);

        //---- button12 ----
        button12.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 12));
        button12.setText("\u7528\u6237\u7ba1\u7406");
        button12.setIcon(new ImageIcon(getClass().getResource("/img/\u7528\u6237.png")));
        contentPane.add(button12);
        button12.setBounds(690, 150, 120, 115);

        //---- label1 ----
        label1.setText("\u8bf7\u9009\u62e9\u83dc\u5355");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 28));
        label1.setForeground(Color.white);
        contentPane.add(label1);
        label1.setBounds(385, 50, 155, 42);

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/img/main.png")));
        contentPane.add(label2);
        label2.setBounds(-5, -20, 910, 645);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
