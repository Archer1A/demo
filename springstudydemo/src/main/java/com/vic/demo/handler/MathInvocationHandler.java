package com.vic.demo.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * MathInvocattionHandler
 *
 * @author Vic
 * @date 2019/8/20
 */
public class MathInvocationHandler implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object target;

    public MathInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     *  执行目标方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------------before---------------");
        Object result = method.invoke(target, args);
        System.out.println("------------after----------------");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
