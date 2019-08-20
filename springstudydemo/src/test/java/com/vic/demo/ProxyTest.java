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
        MathInvocationHandler mathInvocationHandler = new MathInvocationHandler(mathCalculatorService);
        MathCalculatorService proxy = (MathCalculatorService) mathInvocationHandler.getProxy();
        proxy.add(1, 1);
    }
}
