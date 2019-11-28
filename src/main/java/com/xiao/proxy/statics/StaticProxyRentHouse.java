package com.xiao.proxy.statics;

import com.xiao.proxy.IRentHouse;
import com.xiao.proxy.Person;

/**
 * 静态代理
 * 代理对象
 * 静态代理  再编译时 就已经确定 这个代理对象只能代理IRentHouse接口
 * 缺点  当IRentHouse接口新增方法时  代理类和目标对象 都要重写心增的方法 麻烦
 * 优点  可以灵活的指定不同的方法再调用目标方法前后 做不同的处理
 * 比如 在调用目标对象的租房功能时   可以通过代理对象在租房功能前后加验证身份和交租金 等功能
 * 在调用目标对象的买房功能时  可以通过代理对象在买房功能后加验证征信和交首付等功能
 */
public class StaticProxyRentHouse implements IRentHouse {
    private IRentHouse iRentHouse;
    public StaticProxyRentHouse(IRentHouse iRentHouse) {
        this.iRentHouse = iRentHouse;
    }
    @Override
    public void rentHouse(Person person) {
        System.out.println("静态代理**验证身份.....");
        iRentHouse.rentHouse(person);
        System.out.println("静态代理**交中介费.....");
    }
}
