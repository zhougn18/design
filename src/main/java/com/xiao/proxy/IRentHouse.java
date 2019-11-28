package com.xiao.proxy;

import com.xiao.proxy.Person;

/**
 * 代理模式
 * 代理模式 指 客户端不直接访问目标对象  而是通过访问代理对象间接访问目标对象
 * 好处是  不需要修改目标对象 就能扩展目标对象的功能
 * 如 再访问目标对象前后加日志，事务，权限等
 * 如租房案例  正常租房 是租客直接找房主租房子 但是租客不太好找房主  这时租客可以找中介 中介房源多  中介帮租客去找房主租房
 * 这里面租客 就是客户端角色
 * 中介  就是代理对象角色
 * 房主 就是目标对象角色
 */
public interface IRentHouse {
    //提供个人信息租房
    void rentHouse(Person person);
}
