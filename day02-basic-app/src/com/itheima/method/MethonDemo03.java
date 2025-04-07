package com.itheima.method;

public class MethonDemo03 {
    public static void main(String[] args) {
        //目标：掌握在无返回值的方法中单独使用return，提前结束方法
        getDiv(10,0);
    }
    //设计一个除法的方法，接收两个整数，返回商
    public static int getDiv(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return 0;  //提前结束方法 卫语言风格
            //这里提前返回就是为了防止除数为0的情况，提前结束方法
        }
        return a/b;
    }
}
