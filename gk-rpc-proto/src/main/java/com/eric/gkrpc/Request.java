package com.eric.gkrpc;

import lombok.Data;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:33
 * @Description: 表示RPC的一个请求
 * @Modified By:
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
