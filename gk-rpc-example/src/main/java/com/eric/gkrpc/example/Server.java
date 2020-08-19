package com.eric.gkrpc.example;

import com.eric.gkrpc.server.RpcServer;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 12:00
 * @Description:
 * @Modified By:
 */
public class Server {

    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
