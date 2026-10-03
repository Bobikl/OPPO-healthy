package io.netty.handler.codec.protobuf;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public class ProtobufVarint32FrameDecoder extends ByteToMessageDecoder {
    private static int readRawVarint32(ByteBuf byteBuf) {
        int i;
        if (!byteBuf.isReadable()) {
            return 0;
        }
        byteBuf.markReaderIndex();
        byte b = byteBuf.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & ByteCompanionObject.MAX_VALUE;
        if (!byteBuf.isReadable()) {
            byteBuf.resetReaderIndex();
            return 0;
        }
        byte b2 = byteBuf.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return 0;
            }
            byte b3 = byteBuf.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                if (!byteBuf.isReadable()) {
                    byteBuf.resetReaderIndex();
                    return 0;
                }
                byte b4 = byteBuf.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    if (!byteBuf.isReadable()) {
                        byteBuf.resetReaderIndex();
                        return 0;
                    }
                    byte b5 = byteBuf.readByte();
                    int i4 = i3 | (b5 << 28);
                    if (b5 >= 0) {
                        return i4;
                    }
                    throw new CorruptedFrameException("malformed varint.");
                }
                i = b4 << 21;
            }
        }
        return i | i2;
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        int i = byteBuf.readerIndex();
        int rawVarint32 = readRawVarint32(byteBuf);
        if (i == byteBuf.readerIndex()) {
            return;
        }
        if (rawVarint32 < 0) {
            throw new CorruptedFrameException("negative length: " + rawVarint32);
        }
        if (byteBuf.readableBytes() < rawVarint32) {
            byteBuf.resetReaderIndex();
        } else {
            list.add(byteBuf.readRetainedSlice(rawVarint32));
        }
    }
}
