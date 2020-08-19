package com.eric.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 10:00
 * @Description:
 * @Modified By:
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
