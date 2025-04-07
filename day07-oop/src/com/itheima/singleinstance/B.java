package com.itheima.singleinstance;
//懒汉式单例类
public class B {
    // 1.私有化构造方法
    private B(){}
    // 2.私有化静态变量
    private static B b = null;
    // 3.提供公共的静态方法，返回实例对象
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
