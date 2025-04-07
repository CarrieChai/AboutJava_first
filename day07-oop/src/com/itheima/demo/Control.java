package com.itheima.demo;
// 创建一个单例类，用于控制系统
public class Control {
    private Control(){}
    private static Control control = new Control();
    public static Control getInstance(){
        return control;
    }

    // 循环遍历每个设备
    public void printAll(HouseholdAppliance[] has){
        for (int i = 0; i < has.length; i++) {
            HouseholdAppliance ha = has[i];
            System.out.println((i+1)+"  "+ha.getName()+"  目前状态："+(ha.isState()?"开":"关"));
        }
    }

    public void control(HouseholdAppliance ha){
        System.out.println("您选择了："+ha.getName());
        System.out.println("目前的状态是："+(ha.isState()?"开":"关"));
        System.out.println("开始操作...");
        ha.switchState();
        System.out.println("操作结束...");
        System.out.println(ha.getName()+"目前的状态是："+(ha.isState()?"开":"关"));

    }

}
