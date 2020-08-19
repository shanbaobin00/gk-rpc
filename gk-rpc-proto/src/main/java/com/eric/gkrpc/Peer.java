package com.eric.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 9:27
 * @Description: 表示网络传输的一个端点
 * @Modified By:
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
