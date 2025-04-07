package com.itheima.interfacedemo5;

public class Test {
    public static void main(String[] args) {
        // 目标：理解接口的几点注意事项

        // 1. 接口和接口可以多继承：一个接口可以同时继承多个接口（重点）
        // 2. 一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承也不支持多实现
        // 3. 一个类继承了父类，同时实现了接口，如果父类中和接口中有同名的默认方法，实现类会优先使用父类的方法
        D3 d = new D3();
        d.show(); // 父类 B3 show...
        d.go();
        System.out.println("--------------------------");
        // 4. 一个类实习了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
        D4 d4 = new D4();
        d4.show();
    }
}

// 4. 一个类实习了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface A4{
    default void show(){
        System.out.println("接口 A4 show...");
    }
}
interface B4{
    default void show(){
        System.out.println("接口 B4 show...");
    }
}
class D4 implements A4, B4{
    @Override
    public void show(){
        System.out.println("重写 show...");
        A4.super.show();
        B4.super.show();
    }
}


// 3. 一个类继承了父类，同时实现了接口，如果父类中和接口中有同名的默认方法，实现类会优先使用父类的方法
interface A3{
    default void show(){
        System.out.println("接口 A3 show...");
    }
}
class B3{
    public void show(){
        System.out.println("父类 B3 show...");
    }
}
class D3 extends B3 implements A3{  // 这里写的时候必须先写继承再写实现
                                    // 调用show()方法的时候优先走父类
    public void go(){
        show(); // 父类 B3 show...
        super.show();  // 父类 B3 show...
        A3.super.show();  // 接口 A3 show...
    }
}

// 2. 一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承也不支持多实现
interface A1{
    void show();
}
interface B1{
    String show();
}
//interface C1 extends A1, B1{  } // 报错  多个接口中存在方法签名冲突,不能多继承
//class D1 implements A1, B1{ }  // 报错  多个接口中存在方法签名冲突,不能多实现

// 1. 接口和接口可以多继承：一个接口可以同时继承多个接口（重点）
interface A{}
interface B{}
interface C extends A, B{}  // 接口可以多继承
//class D implements A, B, C { }// 类可以实现多个接口（重点）
// 上面的代码还可以写成下面这样，因为一个接口可以同时继承多个接口
class D implements  C { }//

