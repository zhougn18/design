package com.xiao.factory.factorymethod;

import com.xiao.factory.entity.Broom;
import com.xiao.factory.entity.Moveable;
/**
 * 工厂方法 不同的工厂类创建不同对象
 * 如果要有新的类  只需要 新建新的工厂
 */
public class BroomFactory {
    public static Moveable getBroom(){
        return new Broom();
    }
}
