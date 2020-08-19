package com.eric.gkrpc.transport;

/**
 * 1、启动、监听
 * 2、接收请求
 * 3、关闭监听
 *
 * @Author: shanbb
 * @Date: 2020/8/19 10:11
 * @Description:
 * @Modified By:
 */
public interface TransportServer {

    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
