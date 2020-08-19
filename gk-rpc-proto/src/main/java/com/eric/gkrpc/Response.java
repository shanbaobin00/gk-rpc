package com.eric.gkrpc;

import lombok.Data;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:34
 * @Description: 表示RPC的返回
 * @Modified By:
 */
@Data
public class Response {
    /**
     * 服务返回编码，0-成功，非0失败
     */
    private int code = 0;
    /**
     * 具体的错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
