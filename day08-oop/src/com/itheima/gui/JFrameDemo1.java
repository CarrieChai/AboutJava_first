package com.itheima.gui;
import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        // 目标：快速入门GUI Swing编程
        // 1.创建一个窗口，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel jp = new JPanel();   //创建面板
        jf.add(jp);// 添加面板

        jf.setSize(400,200);        // 设置窗口大小
        jf.setLocationRelativeTo(null);         // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 点击关闭按钮，程序退出

        JButton btn = new JButton("登录");    // 创建按钮
        jp.add(btn);    // 添加按钮
        jf.setVisible(true);    // 显示窗口
    }
}
