package com.itheima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// 自定义窗口类，创建对象，展示一个主窗口
public class MainFrame extends JFrame {
    // 设置图片位置
    private static final String imagePath = "stone-maze/src/image/";
    // 准备一个数组用于存储数字色块的行列位置：0-3行，0-3列
    private int[][] imagePos = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    // 定义一个胜利数组
    private int[][] winPos = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    // 定义两个整数变量记录空白色块的行列位置
    private int row = 0; // 0-3行
    private int col = 0; // 0-3列
    private int count; // 统计移动步数

    public MainFrame(){
        // 1、调用一个初始化方法初始化窗口大小等信息
        initFrame();
        // 4、打乱数字色块的顺序，然后再展示图片
        initRandomArray();
        // 2、初始化界面：展示数字色块
        initImage();
        // 3、初始化系统菜单：点击弹出菜单信息是系统退出、重启游戏
        initMenu();
        // 5、给当前窗口绑定上校左右按键事件
        initKeyPressEvent();

        // 最后设置窗口可见
        this.setVisible(true);
    }

    private void initKeyPressEvent() {
        // 给当前窗口绑定上校左右按键事件
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 判断按键是上下左右哪个
                switch (e.getKeyCode()){
                    case KeyEvent.VK_LEFT:
                        // 用户按了左键，那么就让图片向左移动
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_UP:
                        // 用户按了上键，那么就让图片向上移动
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 用户按了右键，那么就让图片向右移动
                        switchAndMove(Direction.RIGHT);
                        break;
                    case KeyEvent.VK_DOWN:
                        // 用户按了下键，那么就让图片向下移动
                        switchAndMove(Direction.DOWN);
                        break;

                }
            }
        });
    }
    // 控制数据交换和图片移动
    private void switchAndMove(Direction direction) {
        // 判断图片的方向，然后控制图片移动
        switch (direction){
            case LEFT:
                if (col > 0){
                    // 交换数据
                    int temp = imagePos[row][col];
                    imagePos[row][col] = imagePos[row][col-1];
                    imagePos[row][col-1] = temp;
                    // 跟新空白块的行列位置
                    col--;
                    count++;
                }
                break;
            case RIGHT:
                if (col < 3){
                    // 交换数据
                    int temp = imagePos[row][col];
                    imagePos[row][col] = imagePos[row][col+1];
                    imagePos[row][col+1] = temp;
                    // 跟新空白块的行列位置
                    col++;
                    count++;

                }
                break;
            case UP:
                // 上交换的条件是空白块的行数大于0，然后将与空白块同列的数据和空白块交换
                if (row > 0){
                    // 交换数据
                    int temp = imagePos[row][col];
                    imagePos[row][col] = imagePos[row-1][col];
                    imagePos[row-1][col] = temp;
                    // 跟新空白块的行列位置
                    row--;
                    count++;

                }
                break;
            case DOWN:
                if (row < 3){
                    // 交换数据
                    int temp = imagePos[row][col];
                    imagePos[row][col] = imagePos[row+1][col];
                    imagePos[row+1][col] = temp;
                    // 跟新空白块的行列位置
                    row++;
                    count++;

                }
                break;
        }
        // 刷新界面
        initImage();
    }

    private void initRandomArray() {
        // 需要判断生成的状态可解决
        while (true){
            // 打乱二维数组中的元素顺序
            for (int i = 0; i < imagePos.length; i++) {
                for (int j = 0; j < imagePos[i].length; j++) {
                    // 随机一个行列位置，让这个位置和当前位置交换
                    int row_index = (int)(Math.random()*4);
                    int col_index = (int)(Math.random()*4);
                    if (i != row_index || j != col_index){
                        int temp = imagePos[i][j];
                        imagePos[i][j] = imagePos[row_index][col_index];
                        imagePos[row_index][col_index] = temp;
                    }

                }
            }

            // 定位空白色块的位置，即定位数据为0的数组的行列位置
            OUT:
            for (int i = 0; i < imagePos.length; i++) {
                for (int j = 0; j < imagePos[i].length; j++) {
                    if (imagePos[i][j] == 0){
                        row = i;
                        col = j;
                        break OUT;
                    }
                }
            }

            // 检查是否可解
            if(isSolvable()){
                break;
            }
        }
    }

    private boolean isSolvable() {
        int inversions = 0; // 统计逆序数
        int blankRow = 0;   // 空白块所在的行号（从下往上数）

        // 将二维数组转换为一维数组
        int[] flatArray = new int[16];
        int index = 0;
        for (int i = 0; i < imagePos.length; i++) {
            for (int j = 0; j < imagePos[i].length; j++) {
                flatArray[index++] = imagePos[i][j];
                if (imagePos[i][j] == 0) {
                    blankRow = 4 - i; // 计算空白块所在的行号（从下往上数）
                }
            }
        }

        // 计算逆序数
        for (int i = 0; i < flatArray.length; i++) {
            for (int j = i + 1; j < flatArray.length; j++) {
                if (flatArray[i] > flatArray[j] && flatArray[j] != 0) {
                    inversions++;
                }
            }
        }

        // 检查可解性
        if (imagePos[0].length % 2 == 0) { // 偶数列
            return (inversions + blankRow) % 2 == 0;
        } else { // 奇数列
            return inversions % 2 == 0;
        }
    }

    private void initMenu() {
        // 1、创建一个菜单条
        JMenuBar menuBar = new JMenuBar();
        // 2、创建一个菜单
        JMenu menu = new JMenu("系统");
        // 3、创建一个菜单项
        JMenuItem exitJi = new JMenuItem("退出");

        // 为退出添加事件监听
        exitJi.addActionListener(e -> {
            // 关闭当前窗口
            dispose();
        });
        // 4、添加到菜单中
        menu.add(exitJi);

        // 添加一个菜单 重启
        JMenuItem restartJi = new JMenuItem("重启");
        restartJi.addActionListener(e -> {
            // 重启游戏
            count = 0;
            initRandomArray();
            initImage();

        });
        menu.add(restartJi);

        // 提示菜单项
        JMenuItem hintJi = new JMenuItem("提示");
        hintJi.addActionListener(e -> {
            Direction hint = getNextHint();
            String hintMessage = "下一步建议：";
            switch (hint) {
                case LEFT:
                    hintMessage += "向左移动";
                    break;
                case RIGHT:
                    hintMessage += "向右移动";
                    break;
                case UP:
                    hintMessage += "向上移动";
                    break;
                case DOWN:
                    hintMessage += "向下移动";
                    break;
                default:
                    hintMessage += "无建议";
                    break;
            }
            JOptionPane.showMessageDialog(this, hintMessage);
        });
        menu.add(hintJi);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private Direction getNextHint() {
        int[][] current = imagePos;
        int[][] target = winPos;

        // 找到空白块的位置
        int emptyRow = row;
        int emptyCol = col;

        // 遍历所有数字，找到与目标状态最接近的数字
        for (int i = 0; i < current.length; i++) {
            for (int j = 0; j < current[i].length; j++) {
                if (current[i][j] != 0 && current[i][j] != target[i][j]) {
                    // 如果当前数字不在正确的位置，尝试将其移动到空白块的位置
                    if (i == emptyRow && Math.abs(j - emptyCol) == 1) {
                        return (j < emptyCol) ? Direction.LEFT : Direction.RIGHT;
                    }
                    if (j == emptyCol && Math.abs(i - emptyRow) == 1) {
                        return (i < emptyRow) ? Direction.UP : Direction.DOWN;
                    }
                }
            }
        }

        // 如果没有明确的移动方向，返回任意方向
        return Direction.NONE;
    }

    private void initImage() {
        // 先清空窗口上的全部图层
        this.getContentPane().removeAll();
        // 刷新界面时显示步数
        // 给窗口添加一个展示文字的组件
        JLabel counttext = new JLabel("当前步数："+count);
        counttext.setBounds(10, 16, 100, 20);
        // 文字设置成红色
        counttext.setForeground(Color.RED);
        // 加粗
        counttext.setFont(new Font("微软雅黑",Font.BOLD,14));

        this.add(counttext);

        // 判断是否赢了
        if(isWin()){
            // 展示胜利的图片
            JLabel winLabel = new JLabel(new ImageIcon(imagePath + "win.png"));
            winLabel.setBounds(124,250,266,88);
            this.add(winLabel);
        }

        // 1 展示一个行列矩阵的图片色块，一次铺满窗口（4*4）
        for (int i = 0; i < imagePos.length; i++) {
            for (int j = 0; j < imagePos[i].length; j++) {
                // 拿到图片名称
                String imageName = imagePos[i][j] + ".png";
                // 2、创建一个JLabel对象，用于展示图片
                JLabel label = new JLabel();
                // 3、设置图片
                label.setIcon(new ImageIcon(imagePath+ imageName));
                // 4、设置图片位置并展示
                label.setBounds(20+j*100,60+i*100,100,100);
                // 5、添加到窗口中
                this.add(label);

            }
        }

        // 添加背景图片（避免重复添加）
        JLabel background = new JLabel(new ImageIcon(imagePath + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);
        // 刷新窗口，重新绘制
        this.repaint();

    }

    private boolean isWin() {
        // 判断imagePos和winPos是否相等，完全一致代表赢了
        for (int i = 0; i < imagePos.length; i++) {
            for (int j = 0; j < imagePos[i].length; j++) {
                if (imagePos[i][j] != winPos[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    private void initFrame() {
        // 设置窗口标题
        this.setTitle("石头迷宫");
        // 设置窗口大小
        this.setSize(465, 575);
        // 设置窗口居中
        this.setLocationRelativeTo(null);
        // 设置窗口关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 一开始移动空白块背景图就跟着移动就是因为没有设置布局方式为绝对位置定位
        // 设置布局方式为绝对位置定位
        this.setLayout(null);



    }

}
