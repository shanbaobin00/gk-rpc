package com.eric.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:59
 * @Description: 基于json的序列化实现
 * @Modified By:
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
