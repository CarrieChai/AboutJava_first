package com.itheima.type;

public class TypeDemo02 {
    public static void main(String[] args) {
        // 目标 掌握表达式中的类型转换
        System.out.println(calc(10, 20, 30.5, 'A'));
        byte a = 10;
        byte b = 20;
        System.out.println(calc2_1(a, b));
        System.out.println(calc2_2(a, b));

        byte i1 = 110;
        byte i2 = 120;
        System.out.println(calc2_1(i1, i2)); // -26 这里本来英应该是230，但是calc2_1的返回值是byte，byte的范围是-128~127，溢出了
        System.out.println(calc2_2(i1, i2));// 230 运算结果是int类型，所以不会发生数据溢出
    }
    //需求：接受各种类型的数据运算
    public static double calc(int a,int b,double c,char r){
        return a+b+c+r;// 表达式中范围小的会转换成范围大的  即double类型
    }

    public static byte calc2_1(byte a,byte b){
        //return a+b; // 报错，因为byte在表达式中直接转换成int参与运算
        return (byte)(a+b);
    }
    // 既然byte在表达式中会转换成int，那么可以直接把返回值设置成int （更推荐这样做）
    public static int calc2_2(byte a,byte b){
        return a+b;
    }

}
