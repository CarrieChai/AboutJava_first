package com.itheima.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        // 目标：理解构造器引用
        // 创建了接口的匿名内部类
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car gatCar(String name) {
//                return new Car(name);
//            }
//        };
        // 匿名内部类转化成Lambda表达式
//        CarFactory cf = name -> new Car(name);
        // 构造器引用  Lambda表达式里只是在创建对象，并且“->”前后参数情况一致
        // 类名::new
        CarFactory cf = Car::new;


        Car c1 = cf.gatCar("奔驰");
        System.out.println(c1);

    }
}
@FunctionalInterface
interface CarFactory {
    Car gatCar(String name);
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private String name;
}