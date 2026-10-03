package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Marshaller;

/* JADX INFO: loaded from: classes10.dex */
public interface MarshallerProvider {
    Marshaller getMarshaller(ChannelHandlerContext channelHandlerContext) throws Exception;
}
