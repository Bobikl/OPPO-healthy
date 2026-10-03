package io.netty.handler.codec.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.util.internal.ObjectUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@ChannelHandler.Sharable
public class ProtobufDecoder extends MessageToMessageDecoder<ByteBuf> {
    private static final boolean HAS_PARSER;
    private final ExtensionRegistryLite extensionRegistry;
    private final MessageLite prototype;

    static {
        boolean z = false;
        try {
            MessageLite.class.getDeclaredMethod("getParserForType", new Class[0]);
            z = true;
        } catch (Throwable unused) {
        }
        HAS_PARSER = z;
    }

    public ProtobufDecoder(MessageLite messageLite) {
        this(messageLite, (ExtensionRegistry) null);
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    public /* bridge */ /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
        decode2(channelHandlerContext, byteBuf, (List<Object>) list);
    }

    public ProtobufDecoder(MessageLite messageLite, ExtensionRegistry extensionRegistry) {
        this(messageLite, (ExtensionRegistryLite) extensionRegistry);
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public void decode2(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int iArrayOffset;
        byte[] bytes;
        int i = byteBuf.readableBytes();
        if (byteBuf.hasArray()) {
            bytes = byteBuf.array();
            iArrayOffset = byteBuf.arrayOffset() + byteBuf.readerIndex();
        } else {
            iArrayOffset = 0;
            bytes = ByteBufUtil.getBytes(byteBuf, byteBuf.readerIndex(), i, false);
        }
        if (this.extensionRegistry == null) {
            if (HAS_PARSER) {
                list.add(this.prototype.getParserForType().parseFrom(bytes, iArrayOffset, i));
                return;
            } else {
                list.add(this.prototype.newBuilderForType().mergeFrom(bytes, iArrayOffset, i).build());
                return;
            }
        }
        if (HAS_PARSER) {
            list.add(this.prototype.getParserForType().parseFrom(bytes, iArrayOffset, i, this.extensionRegistry));
        } else {
            list.add(this.prototype.newBuilderForType().mergeFrom(bytes, iArrayOffset, i, this.extensionRegistry).build());
        }
    }

    public ProtobufDecoder(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        this.prototype = ((MessageLite) ObjectUtil.checkNotNull(messageLite, "prototype")).getDefaultInstanceForType();
        this.extensionRegistry = extensionRegistryLite;
    }
}
