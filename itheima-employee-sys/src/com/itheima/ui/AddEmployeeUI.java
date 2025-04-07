package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 添加员工信息界面
public class AddEmployeeUI extends JFrame {
    private EmployeeManagementUI employeeManagementUI;
    // 初始化这个界面：提供所有输入框信息
    // 员工信息包括"ID", "姓名","性别","年龄","电话", "职位","入职日期","薪水", "部门"
    // 提供一个添加按钮，点击添加按钮，将输入框中的信息添加到数据库中
    // 提供一个取消按钮，点击取消按钮，关闭当前界面
    public AddEmployeeUI(EmployeeManagementUI employeeManagementUI) {
        this.employeeManagementUI = employeeManagementUI;
        // 设置窗口标题和大小
        setTitle("添加员工信息");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 关闭当前窗口而不退出程序
        setLocationRelativeTo(null); // 居中显示窗口
        setLayout(new GridBagLayout()); // 使用GridBagLayout布局

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // 设置组件间距

        // 标签和输入框
        String[] labels = {"ID:", "姓名:", "性别:", "年龄:", "电话:", "职位:", "入职日期:", "薪水:", "部门:"};
        JTextField[] fields = new JTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.EAST; // 右对齐
            add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;
            gbc.anchor = GridBagConstraints.WEST; // 左对齐

            if (i == 2) {
                // 性别字段：使用下拉框
                String[] genders = {"男", "女"};
                JComboBox<String> genderComboBox = new JComboBox<>(genders);
                // 设置下拉框宽度与输入框一致
//                genderComboBox.setPreferredSize(new Dimension(150, 25)); // 设置下拉框宽度与输入框一致
                add(genderComboBox, gbc);
            } else {
                // 其他字段：使用输入框
                fields[i] = new JTextField(20);
                add(fields[i], gbc);
            }
        }

        // 性别下拉框替换输入框
        String[] genders = {"男", "女"};
        JComboBox<String> genderComboBox = new JComboBox<>(genders);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(genderComboBox, gbc);

        // 添加按钮
        JButton addButton = new JButton("添加");
        gbc.gridx = 0;
        gbc.gridy = labels.length;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(addButton, gbc);

        // 取消按钮
        JButton cancelButton = new JButton("取消");
        gbc.gridx = 1;
        gbc.gridy = labels.length;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(cancelButton, gbc);

        // 添加按钮事件处理
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取输入框的数据，封装成员工对象，添加到信息界面的集合并在表格中展示
                Employee employee = new Employee(
                        Integer.parseInt(fields[0].getText()),
                        fields[1].getText(),
                        (String) genderComboBox.getSelectedItem(),
                        Integer.parseInt(fields[3].getText()),
                        fields[4].getText(),
                        fields[5].getText(),
                        fields[6].getText(),
                        Double.parseDouble(fields[7].getText()),
                        fields[8].getText()
                );
                // 把该员工添加到信息界面的集合中
                employeeManagementUI.addEmployee(employee);
                // 弹出一个提示框
                JOptionPane.showMessageDialog(AddEmployeeUI.this, "员工信息添加成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                // 关闭当前窗口
                dispose();
            }
        });

        // 取消按钮事件处理
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 关闭当前窗口
            }
        });

        setVisible(true);
    }

//    public static void main(String[] args) {
//        new AddEmployeeUI();
//    }
}
