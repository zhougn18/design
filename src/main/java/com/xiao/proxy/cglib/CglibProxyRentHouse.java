package com.xiao.proxy.cglib;

import com.xiao.proxy.IRentHouse;
import com.xiao.proxy.RentHouse;
import net.sf.cglib.proxy.Enhancer;

/**
 * cglib 动态代理
 * cglib 动态代理 代理的是类
 */
public class CglibProxyRentHouse {
    public static IRentHouse getInstance(){
        Enhancer enhancer = new Enhancer();
        //指定代理的目标类   目标类可以不实现任何接口    生成的代理类是这个RentHouse类的子类
        enhancer.setSuperclass(RentHouse.class);
        //设置回调方法  当执行动态生成的代理类的rentHouse方法时 会执行RentHouseMethodInterceptor类中的intercept方法
        enhancer.setCallback(new RentHouseMethodInterceptor());
        //生成代理类
        return (IRentHouse) enhancer.create();
    }
}
