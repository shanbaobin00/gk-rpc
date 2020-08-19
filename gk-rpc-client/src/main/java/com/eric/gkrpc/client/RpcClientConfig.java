package com.eric.gkrpc.client;

import com.eric.gkrpc.Peer;
import com.eric.gkrpc.codec.Decoder;
import com.eric.gkrpc.codec.Encoder;
import com.eric.gkrpc.codec.JSONDecoder;
import com.eric.gkrpc.codec.JSONEncoder;
import com.eric.gkrpc.transport.HTTPTransportClient;
import com.eric.gkrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 11:34
 * @Description:
 * @Modified By:
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
