package com.eric.gkrpc.example;

import com.eric.gkrpc.client.RpcClient;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 12:00
 * @Description:
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);
        int r1 = service.add(1, 2);
        int r2 = service.minus(10, 8);
        System.out.println(r1);
        System.out.println(r2);
    }

}
