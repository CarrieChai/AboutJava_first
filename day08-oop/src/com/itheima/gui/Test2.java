package com.itheima.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握事件的几种常见写法
        JFrame jf = new JFrame("登录窗口");

        JPanel jp = new JPanel();   //创建面板
        jf.add(jp);// 添加面板

        jf.setSize(400,200);        // 设置窗口大小
        jf.setLocationRelativeTo(null);         // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 点击关闭按钮，程序退出

        JButton btn = new JButton("登录");    // 创建按钮
        jp.add(btn);    // 添加按钮

        // 1 直接提供实现类，用于创建事件监听对象
        btn.addActionListener(new MyActionListener(jf));

/*        // 2 直接使用匿名内部类对象
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 一旦点击该按钮，则触发这个方法执行
                // e 是 事件对象，封装了事件相关信息
                JOptionPane.showMessageDialog(jf,"登录成功！");
            }

        });*/

        jf.setVisible(true);    // 显示窗口
    }
}
// 1 直接提供实现类，用于创建事件监听对象
class MyActionListener implements ActionListener{
    private JFrame jf;
    public MyActionListener(JFrame jf){
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"登录成功！");
    }
}