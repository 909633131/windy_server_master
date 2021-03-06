package com.windy.game.engine.code;


import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;
/**
 * 消息解析工厂实现
 *
 * @author jiaxiaocheng
 * @create 2018-10-09 16:41
 * QQ:909633131
 **/

public class ProtocolCodecFactoryImpl implements ProtocolCodecFactory {

    protected final ProtocolDecoderImpl decoder;
    protected final ProtocolEncoderImpl encoder;

    public ProtocolCodecFactoryImpl(ProtocolDecoderImpl decoder, ProtocolEncoderImpl encoder) {
        this.decoder = decoder;
        this.encoder = encoder;
    }

    @Override
    public ProtocolEncoder getEncoder(IoSession is) throws Exception {
        return getEncoder();
    }

    @Override
    public ProtocolDecoder getDecoder(IoSession is) throws Exception {
        return getDecoder();
    }

    public ProtocolDecoderImpl getDecoder() {
        return decoder;
    }

    public ProtocolEncoderImpl getEncoder() {
        return encoder;
    }
}