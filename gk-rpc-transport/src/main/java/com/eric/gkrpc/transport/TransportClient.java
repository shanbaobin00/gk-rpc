package com.eric.gkrpc.transport;

import com.eric.gkrpc.Peer;

import java.io.InputStream;

/**
 * 1、创建连接
 * 2、发送数据，并且等待响应
 * 3、关闭连接
 *
 * @Author: shanbb
 * @Date: 2020/8/19 10:09
 * @Description:
 * @Modified By:
 */
public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
