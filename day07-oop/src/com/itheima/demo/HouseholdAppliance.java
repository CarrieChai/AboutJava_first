package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 家电抽象类  所有家电的共有属性是：名字和开关状态
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class HouseholdAppliance implements Switch {
    private String name;
    private boolean state;

    @Override
    public void switchState() {
        state = !state;
    }




}
