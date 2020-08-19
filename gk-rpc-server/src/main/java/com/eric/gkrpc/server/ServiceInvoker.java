package com.eric.gkrpc.server;

import com.eric.gkrpc.Request;
import com.eric.gkrpc.common.util.ReflectionUtil;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 11:02
 * @Description: 调用具体服务
 * @Modified By:
 */
public class ServiceInvoker {

    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtil.invoke(service.getTarget(), service.getMethod(), request.getParameters());
    }
}
