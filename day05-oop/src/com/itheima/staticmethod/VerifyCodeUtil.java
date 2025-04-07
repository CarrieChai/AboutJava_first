package com.itheima.staticmethod;

public class VerifyCodeUtil {
    // 工具类  验证码生成器
    // 工具类不需要创建工具类对象  所以私有化构造方法
    private VerifyCodeUtil() {}

    public static String getVerificationCode(int size) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.random() * str.length());
            char c = str.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }

}
