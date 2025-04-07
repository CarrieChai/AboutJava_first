package com.itheima.ui;

import com.itheima.bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI extends JFrame implements ActionListener {
    private JTextField usernameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JTextField loginNameField; // 登录名输入框
    private JButton registerButton; // 注册按钮
    private JButton cancelButton; // 取消按钮
    private LoginUI loginUI; // 登录界面引用

    public RegisterUI(LoginUI loginUI) {
        super("注册界面");
        this.loginUI = loginUI;
        this.setSize(400, 250); // 调整窗口大小
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 关闭当前窗口
        this.setLayout(new GridBagLayout()); // 使用GridBagLayout布局
        createAndShowGui();
    }
    public void createAndShowGui() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // 设置组件之间的间距

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名:");
        gbc.gridx = 0; // 列索引
        gbc.gridy = 0; // 行索引
        gbc.anchor = GridBagConstraints.EAST; // 对齐方式：右对齐
        this.add(usernameLabel, gbc);

        // 用户名输入框
        usernameField = new JTextField(15); // 设置宽度为15列
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // 对齐方式：左对齐
        this.add(usernameField, gbc);

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

        // 登录名标签
        JLabel loginNameLabel = new JLabel("登录名:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        this.add(loginNameLabel, gbc);

        // 登录名输入框
        loginNameField = new JTextField(15); // 设置宽度为15列
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        this.add(loginNameField, gbc);

        // 注册按钮
        registerButton = new JButton("注册");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // 占据一列
        gbc.anchor = GridBagConstraints.CENTER; // 居中对齐
        this.add(registerButton, gbc);
        registerButton.addActionListener(this);

        // 取消按钮
        cancelButton = new JButton("取消");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // 占据一列
        gbc.anchor = GridBagConstraints.CENTER; // 居中对齐
        this.add(cancelButton, gbc);
        cancelButton.addActionListener(e -> {
            this.dispose(); // 关闭注册界面
        });

        // 显示窗口
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取用户输入的信息
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String loginName = loginNameField.getText().trim();

        // 检查输入是否为空
        if (username.isEmpty() || password.isEmpty() || loginName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "所有字段均为必填项！", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 检查登录名是否已存在
        if (isLoginNameExists(loginName)) {
            JOptionPane.showMessageDialog(this, "登录名已存在，请选择其他登录名！", "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 将用户信息添加到集合中
        LoginUI.allUsers.add(new User(username, password, loginName));

        // 提示注册成功
        JOptionPane.showMessageDialog(this, "注册成功！", "成功", JOptionPane.INFORMATION_MESSAGE);

        // 返回登录界面
        openLoginUI(); // 打开登录界面
        this.dispose(); // 关闭注册界面
    }

    // 检查登录名是否已存在
    private boolean isLoginNameExists(String loginName) {
        for (User user : LoginUI.allUsers) {
            if (user.getLoginName().equals(loginName)) {
                return true;
            }
        }
        return false;
    }
    // 打开登录界面
    private void openLoginUI() {
        SwingUtilities.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
    }
}
