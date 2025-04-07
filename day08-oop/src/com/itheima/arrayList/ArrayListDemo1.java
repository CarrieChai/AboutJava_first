package com.itheima.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 目标：认识ArrayList集合的基本使用。
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖蓝");
        list.add("柳岩");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        // 删除数据
        System.out.println(list.remove("柳岩"));      // 根据元素删除 返回true
        System.out.println(list);                       //[林青霞, 张曼玉, 王祖蓝]
        System.out.println(list.remove(1));     //根据索引删除，返回被删除的元素  也就是 张曼玉
        System.out.println(list);                    //[林青霞, 王祖蓝]

        // 修改数据
        list.set(0,"范冰冰");
        System.out.println(list);       // [范冰冰, 王祖蓝]


    }
}
