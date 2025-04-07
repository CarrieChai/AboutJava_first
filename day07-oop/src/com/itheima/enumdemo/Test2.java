package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        // 目标 掌握枚举类的应用场景 做信息的分类和标志
        // 需求：模拟上下左右移动图片
        // 第一种是常量做信息标志和分类；但参数值不受约束
        move(Constant.UP);  // 参数值不受约束  但是除了1234之外其他的值都没有意义

        // 第二种是枚举做信息标志和分类；参数值受枚举类的约束
        move2(Direction.UP);

    }

    public static void move2 (Direction direction){
        switch (direction){
            case Direction.UP:
                System.out.println("向上移动");
                break;

            case Direction.DOWN:
                System.out.println("向下移动");
                break;

            case Direction.LEFT:
                System.out.println("向左移动");
                break;

            case Direction.RIGHT:
                System.out.println("向右移动");
                break;

            default:
                System.out.println("error");

        }
    }

    public static void move(int direction){
        switch (direction){
            case Constant.UP:
                System.out.println("向上移动");
                break;

            case Constant.DOWN:
                System.out.println("向下移动");
                break;

            case Constant.LEFT:
                System.out.println("向左移动");
                break;

            case Constant.RIGHT:
                System.out.println("向右移动");
                break;

            default:
                System.out.println("error");

        }
    }
}
