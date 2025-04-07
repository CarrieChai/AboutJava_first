package com.itheima.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 自定义的登录界面，继承JFrame类
public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {
        // 设置窗口标题
        this.setTitle("登录界面");
        // 设置窗口大小
        this.setSize(400, 200);
        // 设置窗口居中
        this.setLocationRelativeTo(null);
        // 设置窗口关闭按钮的默认操作（点击关闭时退出程序）
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 初始化窗口的组件
        init();
    }

    private void init() {
        // 添加一个登录按钮
        JButton btn = new JButton("登录");
        btn.addActionListener(this);
        JPanel jp = new JPanel();
        this.add(jp);
        jp.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "登录成功！");
    }
}
