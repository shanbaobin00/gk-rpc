package com.eric.gkrpc.server;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 10:35
 * @Description: 表示一个具体服务
 * @Modified By:
 */
@Data
@AllArgsConstructor
public class ServiceInstance {
    private Object target;
    private Method method;
}
