package com.itheima.ui;

import com.itheima.bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class LoginUI extends JFrame implements ActionListener{
    private JTextField loginNameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JButton loginButton; // 登录按钮
    private JButton registerButton; // 注册按钮
    //定义一个静态的集合，存储系统中全部的用户对象信息
    public static ArrayList<User> allUsers = new ArrayList<>();

    // 初始化几个测试的用户对象信息用于登录
    static {
        allUsers.add(new User("超级管理员", "123456", "admin"));
        allUsers.add(new User("张三", "123456", "sansan"));
        allUsers.add(new User("李四", "123456", "lisi"));
    }


    public LoginUI() {
        super("登录界面");
        this.setSize(400, 250); // 调整窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout()); // 使用GridBagLayout布局
        createAndShowGui();

    }
    public void createAndShowGui() {
        // 创建主窗口

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // 设置组件之间的间距

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名:");
        gbc.gridx = 0; // 列索引
        gbc.gridy = 0; // 行索引
        gbc.anchor = GridBagConstraints.EAST; // 对齐方式：右对齐
        this.add(usernameLabel, gbc);

        // 用户名输入框
        loginNameField = new JTextField(15); // 设置宽度为15列
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // 对齐方式：左对齐
        this.add(loginNameField, gbc);

        // 密码标签
        JLabel passwordLabel = new JLabel("密码:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        this.add(passwordLabel, gbc);

        // 密码输入框
        passwordField = new JPasswordField(15); // 设置宽度为15列
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        this.add(passwordField, gbc);

        // 登录按钮
        loginButton = new JButton("登录");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // 占据一列
        gbc.anchor = GridBagConstraints.CENTER; // 居中对齐
        this.add(loginButton, gbc);
        loginButton.addActionListener(this);

        // 注册按钮
        registerButton = new JButton("注册");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // 占据一列
        gbc.anchor = GridBagConstraints.CENTER; // 居中对齐
        this.add(registerButton, gbc);
        registerButton.addActionListener(e -> {
            this.dispose(); // 关闭登录界面
            new RegisterUI(this);
        });

        // 显示窗口
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // 既可能是登陆按钮点击过来的，也可能是注册按钮点击过来的
        // 判断到底是登录还是注册按钮点击的
        JButton btn = (JButton)e.getSource();
        if (btn == loginButton) {
            // 独立功能，独立成方法
            login();

        }
    }

    private void login() {
        // 1 获取用户输入的用户名和密码
        String loginName = loginNameField.getText();
        String password = new String(passwordField.getPassword());
        // 2 遍历全部的用户对象信息，判断用户输入的用户名和密码是否匹配，匹配成功则登录成果
        // 3 根据登录名称去查询用户对象返回，查询到用户对象，说明登录名正确
        User user = getUserByLoginName(loginName);
        if (user != null) {
            // 4 判断用户输入的密码是否正确
            if (user.getPassword().equals(password)) {
                // 登录成功
                System.out.println("登录成功");
                // 登录成功后，跳转到员工管理界面
                new EmployeeManagementUI(user.getUsername());
                this.dispose(); // 关闭当前登录窗口
            }else {
                // 密码错误
                JOptionPane.showMessageDialog(this,"密码错误");
            }
        }else {
            // 登录名不存在
            JOptionPane.showMessageDialog(this,"登录名不存在");
        }
    }

    // 根据登录名称去查询用户对象返回，查询到用户对象，说明登录名正确，使用for循环根据索引遍历
    private User getUserByLoginName(String loginName) {
        for (int i = 0; i < allUsers.size(); i++) {
            User user = allUsers.get(i);
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null; // 未查询到用户对象，说明登录名错误
    }

}