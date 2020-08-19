package com.eric.gkrpc.server;

import com.eric.gkrpc.codec.Decoder;
import com.eric.gkrpc.codec.Encoder;
import com.eric.gkrpc.codec.JSONDecoder;
import com.eric.gkrpc.codec.JSONEncoder;
import com.eric.gkrpc.transport.HTTPTransportServer;
import com.eric.gkrpc.transport.TransportServer;
import lombok.Data;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 10:30
 * @Description: server配置
 * @Modified By:
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encodeClass = JSONEncoder.class;
    private Class<? extends Decoder> decodeClass = JSONDecoder.class;
    private int port = 3000;
}
