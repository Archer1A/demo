package com.vic.demo;

import com.vic.demo.handler.MathInvocationHandler;
import com.vic.demo.service.MathCalculatorService;
import com.vic.demo.service.impl.MathCalculatorServiceImpl;
import org.junit.Test;

/**
 * ProxyTest
 *
 * @author Vic
 * @date 2019/8/20
 */

public class ProxyTest {

    @Test
    public void testProxy() {
        // 实例化目标
        MathCalculatorService mathCalculatorService = new MathCalculatorServiceImpl();
        // 设置代理
        MathInvocationHandler mathInvocationHandler = new MathInvocationHandler(mathCalculatorService);
        // 获取被代理的对象
        MathCalculatorService proxy = (MathCalculatorService) mathInvocationHandler.getProxy();
        // 调用增强后的方法
        proxy.add(1, 1);
    }
}
