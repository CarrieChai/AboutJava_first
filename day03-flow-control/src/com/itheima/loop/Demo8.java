package com.itheima.loop;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        //一些案例练习
//        calc();
//        guessNumber();
//        VerificationCode(4);
//        VerificationCode(6);
        PrimeNumber(101,200);
    }

    // 练习：实现一个简单的计算器
    public static void calc(){
        while(true){
            Double n1,n2 = 0.0;
            String op = " ";
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数字：");
            n1 = sc.nextDouble();
            System.out.println("请输入运算符，（仅支持+、-、 *、/四则运算）：");
            op = sc.next();
            System.out.println("请输入第二个数字：");
            n2 = sc.nextDouble();
            // 这里使用switch是因为我们的需求是单值匹配 用switch比较合适
            switch(op){
                case "+":
                    System.out.println(n1+"+"+n2+"="+(n1+n2));
                    break;
                case "-":
                    System.out.println(n1+"-"+n2+"="+(n1-n2));
                    break;
                case "*":
                    System.out.println(n1+"*"+n2+"="+(n1*n2));
                    break;
                case "/":
                    if (n2==0){
                        System.out.println("除数不为0，输入有误");
                        break;
                    }else {
                        System.out.println(n1+"/"+n2+"="+(n1/n2));
                        break;
                    }
                default:
                    System.out.println("运算符输入有误");
            }
            System.out.println("--------------");
            System.out.println("是否退出？y/n");
            String flag = sc.next();
            if (flag.equals("y")){
                break;
            }else if(!(flag.equals("n"))){
                System.out.println("输入有误，默认继续使用");
            }
        }
    }

    // 练习：猜数字游戏
    public static void guessNumber(){
        Random random = new Random();
        int luckyNumber = random.nextInt(100)+1;// 生成[1,100]的随机数
        while (true){
            int n = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜测的数字：");
            n = sc.nextInt();
            if (n==luckyNumber){
                System.out.println("恭喜你，猜对了");
                break;
            }else if (n>luckyNumber){
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
        }
    }

    // 练习：验证码生成器
    public static void VerificationCode(int size){ //输入n确定验证码的位数
        String code = "";
        for (int i = 0; i < size; i++) {
            // 每一位都有可能是数字0 、大写字母1、小写字母2之中的一个，
            // 所以生成一个随机数来确定类型
            int type = (int)(Math.random()*3);
            switch(type){
                case 0: // 数字
                    code = code+(int)(Math.random()*10);
                    break;
                case 1: // 大写
                    code = code + (char) ('A' + Math.random() * 26); // A-Z 65-90 A的ASCII码值是65 也可以写成 (char)(65+Math.random()*26)
                    break;
                case 2: // 小写
                    code = code + (char) ('a' + Math.random() * 26); // a-z 97-122 a的ASCII码值是97 也可以写成 (char)(97+Math.random()*26)
                    break;
            }

        }
        System.out.println("生成的验证码是："+code);

    }


    // 练习：素数个数统计
    // 1 判断一个数是否是素数
    public static boolean IsPrime(int n){
        boolean flag = true;
        int i = 2;
        while (i<=Math.sqrt(n)){
            if (n%i==0){
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
    // 2 统计素数个数
    public static void PrimeNumber(int i1,int i2){
        int n = 0;
        for (int j = i1; j <= i2; j++) {
            if (IsPrime(j)){
                n++;
                System.out.println(j);
            }
        }
        System.out.println("在["+i1+","+i2+"]之间，素数的个数为："+n);
    }


}
