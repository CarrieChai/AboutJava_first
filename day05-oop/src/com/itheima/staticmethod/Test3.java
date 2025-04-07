package com.itheima.staticmethod;

public class Test3 {
    public static void main(String[] args) {
        //注册界面也需要生成验证码
        //生成验证码的方法就必须重复写

//        String code = getVerificationCode(6);
        String code = VerifyCodeUtil.getVerificationCode(6);
        System.out.println(code);


    }
//    public static String getVerificationCode(int size){
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