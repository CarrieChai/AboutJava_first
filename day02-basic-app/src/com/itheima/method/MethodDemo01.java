package com.itheima.method;

public class MethodDemo01 {
    public static void main(String[] args) {
        // 目标：掌握方法的基本写法和调用方式
        System.out.println(getSum(10,20));
        System.out.println("=========================");
        printHelloWorld();
        System.out.println("=========================");
        System.out.println(getVerifyCode(4));
        System.out.println(getVerifyCode(6));
    }
    //定义一个方法，计算两个整数的和并返回
    //修饰符 public static
    //有返回值，返回值类型是int
    //需要接收数据 int a,int b
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    //定义一个方法，要求打印三行HelloWorld，无返回值，不接收参数
    //修饰符 public static
    //无返回值必须声明成void
    //无参数

    public static void printHelloWorld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //定义一个方法，获取一个指定位数的验证码并返回
    //需要接收位数，表示验证码的长度 int len
    //len是几，就代表验证码有几个数字
    //需要返回验证码  String
    public static String getVerifyCode(int len){
        String code = "";
        for (int i = 0; i < len; i++){
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }




}
