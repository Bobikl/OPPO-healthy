package io.netty.handler.codec.protobuf;

import com.google.protobuf.nano.MessageNano;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.internal.ObjectUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@ChannelHandler.Sharable
public class ProtobufDecoderNano extends MessageToMessageDecoder<ByteBuf> {
    private final Class<? extends MessageNano> clazz;

    public ProtobufDecoderNano(Class<? extends MessageNano> cls) {
        this.clazz = (Class) ObjectUtil.checkNotNull(cls, "You must provide a Class");
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public /* bridge */ /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
        decode2(channelHandlerContext, byteBuf, (List<Object>) list);
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public void decode2(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byte[] bytes;
        int iArrayOffset;
        int i = byteBuf.readableBytes();
        if (byteBuf.hasArray()) {
            bytes = byteBuf.array();
            iArrayOffset = byteBuf.arrayOffset() + byteBuf.readerIndex();
        } else {
            bytes = ByteBufUtil.getBytes(byteBuf, byteBuf.readerIndex(), i, false);
            iArrayOffset = 0;
        }
        list.add(MessageNano.mergeFrom(this.clazz.getConstructor(new Class[0]).newInstance(new Object[0]), bytes, iArrayOffset, i));
    }
}
