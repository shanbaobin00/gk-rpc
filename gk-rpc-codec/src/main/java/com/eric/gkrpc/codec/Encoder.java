package com.eric.gkrpc.codec;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:56
 * @Description: 序列化
 * @Modified By:
 */
public interface Encoder {
    byte[] encode(Object obj);
}
