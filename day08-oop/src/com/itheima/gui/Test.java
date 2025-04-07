package com.itheima.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        // 目标：认识GUI的事件处理机制
        JFrame jf = new JFrame("登录窗口");

        JPanel jp = new JPanel();   //创建面板
        jf.add(jp);// 添加面板

        jf.setSize(400,200);        // 设置窗口大小
        jf.setLocationRelativeTo(null);         // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 点击关闭按钮，程序退出

        JButton btn = new JButton("登录");    // 创建按钮
        jp.add(btn);    // 添加按钮

        // 给按钮绑定点击事件监听器对象
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 一旦点击该按钮，则触发这个方法执行
                // e 是 事件对象，封装了事件相关信息
                JOptionPane.showMessageDialog(jf,"登录成功！");
            }

        });

        // 需求：监听用户键盘上下左右四个按键的时间
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取键盘按下的键值
                int keyCode = e.getKeyCode();   // 事件源头的键编号
                // 判断键值
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        System.out.println("向上");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("向下");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("向左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("向右");
                        break;
                }
            }
        });

        jf.setVisible(true);    // 显示窗口
        // 让窗口成为焦点
        jf.requestFocus();
    }
}
