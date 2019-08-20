package com.vic.demo.service.impl;

import com.vic.demo.service.MathCalculatorService;

/**
 * MathCalculatorServiceImpl
 * 创建业务接口实现类
 * @author Vic
 * @date 2019/8/20
 */
public class MathCalculatorServiceImpl implements MathCalculatorService {

    /**
     * {@link com.vic.demo.service.MathCalculatorService#add(int, int)}
     *
     * @param val1
     * @param val2
     * @return
     */
    @Override
    public int add(int val1, int val2) {
        System.out.println("---------------add-----------------");
        return val1 + val2;
    }
}
