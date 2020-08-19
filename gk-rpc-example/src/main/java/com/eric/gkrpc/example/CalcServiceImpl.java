package com.eric.gkrpc.example;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 12:01
 * @Description:
 * @Modified By:
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
