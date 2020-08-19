package com.eric.gkrpc.client;

import com.eric.gkrpc.codec.Decoder;
import com.eric.gkrpc.codec.Encoder;
import com.eric.gkrpc.common.util.ReflectionUtil;
import com.eric.gkrpc.transport.TransportClient;

import java.lang.reflect.Proxy;

/**
 * @Author: shanbb
 * @Date: 2020/8/19 11:38
 * @Description:
 * @Modified By:
 */
public class RpcClient {
    private RpcClientConfig config;
    private Encoder encoder;
    private Decoder decoder;
    private TransportSelector selector;

    public RpcClient(){
        this(new RpcClientConfig());
    }

    public RpcClient(RpcClientConfig config){
        this.config = config;
        this.encoder = ReflectionUtil.newInstance(config.getEncoderClass());
        this.decoder = ReflectionUtil.newInstance(config.getDecoderClass());
        this.selector = ReflectionUtil.newInstance(config.getSelectorClass());
        this.selector.init(
                this.config.getServers(),
                this.config.getConnectCount(),
                this.config.getTransportClass()
        );
    }

    public <T> T getProxy(Class<T> clazz){
        return (T) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[]{clazz},
                new RemoteInvoker(clazz, encoder, decoder, selector)
        );
    }

}
