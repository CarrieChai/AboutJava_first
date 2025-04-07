package com.itheima.staticmethod;

public class Test2 {
    public static void main(String[] args) {
        //在登录界面需要生成一个验证码

//        String code = getVerificationCode(4);
        String code = VerifyCodeUtil.getVerificationCode(4);
        System.out.println(code);
    }

//    public static String getVerificationCode(int size) {
//        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < size; i++) {
//            int index = (int) (Math.random() * str.length());
//            char c = str.charAt(index);
//            sb.append(c);
//        }
//        return sb.toString();
//    }
}
