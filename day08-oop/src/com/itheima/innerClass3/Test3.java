package com.itheima.innerClass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        // 目标：搞清楚几个匿名内部类的使用场景
        // 需求：闯将一个登录窗口，窗口上只有一个登录按钮
        JFrame jf = new JFrame("登录窗口"); // 窗口
        jf.setSize(300,200); // 宽高
        jf.setLocationRelativeTo(null); // 居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点击关闭按钮，程序退出

        JPanel jp = new JPanel();
        jf.add(jp); // 添加面板

        JButton btn = new JButton("登录");
        jp.add(btn);

        // java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，从而做出反应
//        btn.addActionListener(new ClickListener());
        // 开发中不是我们要主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才会写
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击了登录按钮");
//            }
//        });
        // 简化代码可以写成下面这样
        btn.addActionListener(e -> {
            System.out.println("点击了登录按钮");
        });

        jf.setVisible(true); // 显示窗口

    }

}
class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了登录按钮");
    }
}
