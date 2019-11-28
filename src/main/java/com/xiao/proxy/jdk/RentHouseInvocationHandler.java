package com.xiao.proxy.jdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 重写InvocationHandler 里的invoke方法  调用目标方法时做一些业务逻辑
 */
public class RentHouseInvocationHandler implements InvocationHandler {
    //被代理的目标对象
    private Object target;
    public RentHouseInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy  代理对象
     * @param method 代理执行哪个方法
     * @param args   方法需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理**验证身份.....");
        Object invoke = method.invoke(target,args);
        System.out.println("jdk动态代理**交中介费.....");
        return invoke;
    }
}
