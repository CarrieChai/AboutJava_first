package com.itheima.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        // 目标：特定类型的方法引用
        // 需求：有一个字符串数组，里面有一些人的名字（基本都是英文），请按照首字母升序排序。
        String[] names = {"Tom","Andy", "Jerry", "Mike", "Jack", "Lucy", "Lily","angela","caocao"};
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 想要忽略大小写
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        Arrays.sort(names, (o1,o2)-> o1.compareToIgnoreCase(o2));

        // 特定类的方法引用  类型名称::方法名
        Arrays.sort(names, String::compareToIgnoreCase);


        System.out.println(Arrays.toString(names));

    }
}
