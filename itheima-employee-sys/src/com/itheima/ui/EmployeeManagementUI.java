package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeManagementUI extends JFrame{
    private JFrame frame;
    private DefaultTableModel tableModel;  // 表格模型 封装表格数据
    private JTable employeeTable;  // 表格
    // 准备一个静态集合对象，用于存储系统中的全部员工对象信息
    public static ArrayList<Employee> allEmployees = new ArrayList<>();

    // 编两条假数据放在集合中
    static {
        allEmployees.add(new Employee(1, "Bob", "男", 20, "13939875483", "Java工程师", "2023-05-01", 50000, "技术部"));
        allEmployees.add(new Employee(2, "Mary", "女", 20, "13939875483", "Java工程师", "2023-05-01", 50000, "技术部"));
    }


    public EmployeeManagementUI() {

    }
    public EmployeeManagementUI(String username) {
        super("欢迎"+ username+ "，欢迎使用员工信息管理系统");
        frame = this;
        initialize();
    }


    public void initialize() {
        // 创建主窗口
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // 初始化表格模型和表格
        String[] columnNames = {"ID", "姓名","性别","年龄","电话", "职位","入职日期","薪水", "部门"};
        // 把集合中的数据放入表格模型中
        Object[][] data = new Object[allEmployees.size()][9];
        for (int i = 0; i < allEmployees.size(); i++) {
            Employee employee = allEmployees.get(i);
            data[i][0] = employee.getId();
            data[i][1] = employee.getName();
            data[i][2] = employee.getSex();
            data[i][3] = employee.getAge();
            data[i][4] = employee.getPhone();
            data[i][5] = employee.getPosition();
            data[i][6] = employee.getEntryDate();
            data[i][7] = employee.getSalary();
            data[i][8] = employee.getDepartment();
        }

        tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 禁用编辑
            }
        };
        employeeTable = new JTable(tableModel);

        // 设置表格列宽
        employeeTable.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID 列
        employeeTable.getColumnModel().getColumn(1).setPreferredWidth(150); // 姓名 列
        employeeTable.getColumnModel().getColumn(2).setPreferredWidth(50); // 性别
        employeeTable.getColumnModel().getColumn(3).setPreferredWidth(50); // 年龄
        employeeTable.getColumnModel().getColumn(4).setPreferredWidth(200); // 电话
        employeeTable.getColumnModel().getColumn(5).setPreferredWidth(200); // 职位
        employeeTable.getColumnModel().getColumn(6).setPreferredWidth(250); // 入职日期
        employeeTable.getColumnModel().getColumn(7).setPreferredWidth(200); // 薪水
        employeeTable.getColumnModel().getColumn(8).setPreferredWidth(200); // 部门

        // 设置表格行高为当前的两倍
        employeeTable.setRowHeight(30);

        // 添加滚动面板包裹表格
        JScrollPane scrollPane = new JScrollPane(employeeTable);
        this.add(scrollPane, BorderLayout.CENTER);

        // 第一行：输入框、搜索按钮、添加按钮
        JPanel topPanel = new JPanel();
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("搜索");
        JButton addButton = new JButton("添加");

        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(addButton);
        this.add(topPanel, BorderLayout.NORTH);

        // 右键菜单（修改和删除）
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editMenuItem = new JMenuItem("修改");
        JMenuItem deleteMenuItem = new JMenuItem("删除");
        popupMenu.add(editMenuItem);
        popupMenu.add(deleteMenuItem);

        // 绑定右键菜单到表格
        employeeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = employeeTable.rowAtPoint(e.getPoint());
                    if (row >= 0 && row < employeeTable.getRowCount()) {
                        employeeTable.setRowSelectionInterval(row, row);
                        popupMenu.show(employeeTable, e.getX(), e.getY());
                    }
                }
            }
        });

        // 修改菜单项事件处理
        editMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = employeeTable.getSelectedRow();
                if (selectedRow >= 0) {
                    String id = tableModel.getValueAt(selectedRow, 0).toString(); // 获取当前行的 ID
                    // 员工信息包括 "姓名","性别","年龄","电话", "职位","入职日期","薪水", "部门"
                    String name = JOptionPane.showInputDialog(frame, "修改员工姓名:", tableModel.getValueAt(selectedRow, 1));
                    String sex = JOptionPane.showInputDialog(frame, "修改员工性别:", tableModel.getValueAt(selectedRow, 2));
                    String age = JOptionPane.showInputDialog(frame, "修改员工年龄:", tableModel.getValueAt(selectedRow, 3));
                    String phone = JOptionPane.showInputDialog(frame, "修改员工电话:", tableModel.getValueAt(selectedRow, 4));

                    String position = JOptionPane.showInputDialog(frame, "修改员工职位:", tableModel.getValueAt(selectedRow, 5));
                    String entryDate = JOptionPane.showInputDialog(frame, "修改员工入职日期:", tableModel.getValueAt(selectedRow, 6));
                    String salary = JOptionPane.showInputDialog(frame, "修改员工薪水:", tableModel.getValueAt(selectedRow, 7));

                    String department = JOptionPane.showInputDialog(frame, "修改员工部门:", tableModel.getValueAt(selectedRow, 8));

                    if (name != null && sex != null &&age != null &&phone != null &&entryDate != null &&salary != null &&position != null && department != null) {
                        // 创建 Employee 对象
                        Employee employee = new Employee(Integer.parseInt(id), name, sex, Integer.parseInt(age), phone, position, entryDate, Double.parseDouble(salary), department);
                        // 修改集合中的数据
                        editEmployee(employee);
                        // 此时allEmployees中的数据已经是最新数据，重新将allEmployees集合中的数据放入tableModel中展示
                        for (int i = 0; i < allEmployees.size(); i++) {
                            Employee employee1 = allEmployees.get(i);
                            if (employee1.getId() == employee.getId()) {
                                tableModel.setValueAt(employee.getName(), i, 1);
                                tableModel.setValueAt(employee.getSex(), i, 2);
                                tableModel.setValueAt(employee.getAge(), i, 3);
                                tableModel.setValueAt(employee.getPhone(), i, 4);
                                tableModel.setValueAt(employee.getPosition(), i, 5);
                                tableModel.setValueAt(employee.getEntryDate(), i, 6);
                                tableModel.setValueAt(employee.getSalary(), i, 7);
                                tableModel.setValueAt(employee.getDepartment(), i, 8);
                            }
                        }
                        tableModel.fireTableDataChanged();

                        JOptionPane.showMessageDialog(frame, "修改成功！ID: " + id, "提示", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        // 删除菜单项事件处理
        deleteMenuItem.addActionListener(e-> {
                int selectedRow = employeeTable.getSelectedRow(); // 获取选中的行索引
                if (selectedRow >= 0) {
                    int id = (Integer)tableModel.getValueAt(selectedRow, 0);
                    // 删除数据
                    deleteEmployee(id);
                    tableModel.removeRow(selectedRow);// 从表格模型中删除该行
                    // 弹出一个提示框
                    JOptionPane.showMessageDialog(frame, "删除成功！ID: " + id, "提示", JOptionPane.INFORMATION_MESSAGE);
                }

        });

        // 搜索按钮事件处理
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = searchField.getText().trim();
                if (!keyword.isEmpty()) {
                    boolean found = false;
                    for (int i = 0; i < tableModel.getRowCount(); i++) {
                        String name = (String) tableModel.getValueAt(i, 1);
                        if (name.contains(keyword)) {
                            employeeTable.setRowSelectionInterval(i, i);
                            employeeTable.scrollRectToVisible(employeeTable.getCellRect(i, 0, true));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(frame, "未找到匹配的员工！", "提示", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        // 添加按钮事件处理
        addButton.addActionListener(e -> {
            // 弹出一个添加员工信息的界面出来
            new AddEmployeeUI(this);
//            System.out.println("添加按钮被点击了");
            });

        // 显示窗口
        frame.setVisible(true);
    }

    private void editEmployee(Employee employee) {
        for (int i = 0; i < allEmployees.size(); i++) {
            Employee emp = allEmployees.get(i);
            if (emp.getId() == employee.getId()) {
                allEmployees.set(i, employee);
                break;
            }
        }
    }

    private void deleteEmployee(int id) {
        // 先从集合中删除
        for (int i = 0; i < allEmployees.size(); i++) {
            Employee emp = allEmployees.get(i);
            if (emp.getId() == id) {
                allEmployees.remove(i);
                break;
            }
        }
    }

    public void addEmployee(Employee employee) {
        // 添加到集合，展示到表格
        allEmployees.add(employee);
        // 添加一行数据
        tableModel.addRow(new Object[]{
                employee.getId(),
                employee.getName(),
                employee.getSex(),
                employee.getAge(),
                employee.getPhone(),
                employee.getPosition(),
                employee.getEntryDate(),
                employee.getSalary(),
                employee.getDepartment()
        });
    }
}