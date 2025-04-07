package com.itheima.brach;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 目标 了解Switch表达式类型只能是byte、short、int、char、JDK5开始支持枚举、JDK7开始支持String，不支持double、float、long
        //test();
        test2();
    }

//    public static void test(){
//        double n = 2.0;
////        System.out.println(0.2 + 0.3); // 输出的就是0.5
//        switch (n){  //报错信息  不兼容的类型。实际为 double'，需要 'char、byte、short、int、Character、Byte、Short、Integer、String 或枚举
//            case 1.0:
//                System.out.println("success 1.0");
//            case 2.0:
//                System.out.println("success 2.0");
//        }
        //了解switch的穿透性
        public static void test2(){
            String day = "tuesday";
            switch(day){
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                    System.out.println("go to school");
                    break;
                case "saturday":
                case "sunday":
                    System.out.println("go home");
                    break;
                default:
                    System.out.println("error");
            }
        }
}
