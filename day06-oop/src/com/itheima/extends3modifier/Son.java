package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Father;

public class Son extends Father {
    void testModifier(){
        System.out.println("子类");
//        privateMethod(); // 访问不了
//        defaultMethod1(); // 访问不了
        protectedMethod2();// 可以访问
        publicMethod3(); // 可以访问

    }

}
