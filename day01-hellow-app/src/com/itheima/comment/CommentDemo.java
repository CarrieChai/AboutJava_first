package com.itheima.comment;

public class CommentDemo {
    /**
     * 3 这是一个文档注释
     * 一般写在方法上方或者是代码最上面
     * crtl+shift+/  再多写一个*
     * */
    public static void main(String[] args) {
        // 目标：掌握注释的使用方式
        //打印输出
        //1 这是一个单行注释

        System.out.println("Hello,World");
        System.out.println("--------------------");
        /*
        * 2 这是一个多行注释
        * 一般用于文档内部
        * 快捷键ctrl+shift+/
        * */
        System.out.println(sum(10, 20));

    }


//    写一个两数求和的方法
    public static int sum(int a,int b) {
        int result = a + b;
        return result;
    }

}
