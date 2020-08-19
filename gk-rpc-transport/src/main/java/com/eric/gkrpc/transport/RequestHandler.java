package com.eric.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 10:12
 * @Description: 处理网络请求的handler
 * @Modified By:
 */
public interface RequestHandler {
    void onRequest(InputStream recive, OutputStream toResp);
}
