package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        // 目标：生成验证码
        System.out.println(getCode(4));
        System.out.println(getCode(6));

    }
    // 生成指定位数的随机验证码并返回，每一位都可能是大小写字母或数字
    public static String getCode(int n) {
        // 1、使用String变量记住所有要用到的字符
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++) {
            // 2、使用随机数获取一个索引
            int index = (int)(Math.random() * str.length());    // [0,1)*str.length()=[0,str.length())=[0,str.length()-1]
            // 3、根据索引获取字符
            char ch = str.charAt(index);
            // 4、把字符拼接起来
            code += ch;
        }
        // 5、返回拼接好的验证码
        return code;
    }
}
