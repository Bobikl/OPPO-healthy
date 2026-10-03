package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Unmarshaller;

/* JADX INFO: loaded from: classes10.dex */
public interface UnmarshallerProvider {
    Unmarshaller getUnmarshaller(ChannelHandlerContext channelHandlerContext) throws Exception;
}
