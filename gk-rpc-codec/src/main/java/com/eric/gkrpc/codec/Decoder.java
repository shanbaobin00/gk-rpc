package com.eric.gkrpc.codec;
/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:56
 * @Description: 反序列化
 * @Modified By:
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
