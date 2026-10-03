package io.netty.handler.ssl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.Future;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractSniHandler<T> extends SslClientHelloHandler<T> {
    private String hostname;

    private static String extractSniHostname(ByteBuf byteBuf) {
        int i = byteBuf.readerIndex();
        int iWriterIndex = byteBuf.writerIndex();
        int i2 = i + 34;
        if (iWriterIndex - i2 < 6) {
            return null;
        }
        int unsignedByte = i2 + byteBuf.getUnsignedByte(i2) + 1;
        int unsignedShort = unsignedByte + byteBuf.getUnsignedShort(unsignedByte) + 2;
        int unsignedByte2 = unsignedShort + byteBuf.getUnsignedByte(unsignedShort) + 1;
        int unsignedShort2 = byteBuf.getUnsignedShort(unsignedByte2);
        int i3 = unsignedByte2 + 2;
        int i4 = unsignedShort2 + i3;
        if (i4 > iWriterIndex) {
            return null;
        }
        while (i4 - i3 >= 4) {
            int unsignedShort3 = byteBuf.getUnsignedShort(i3);
            int i5 = i3 + 2;
            int unsignedShort4 = byteBuf.getUnsignedShort(i5);
            int i6 = i5 + 2;
            if (i4 - i6 < unsignedShort4) {
                return null;
            }
            if (unsignedShort3 == 0) {
                int i7 = i6 + 2;
                if (i4 - i7 < 3) {
                    return null;
                }
                short unsignedByte3 = byteBuf.getUnsignedByte(i7);
                int i8 = i7 + 1;
                if (unsignedByte3 != 0) {
                    return null;
                }
                int unsignedShort5 = byteBuf.getUnsignedShort(i8);
                int i9 = i8 + 2;
                if (i4 - i9 < unsignedShort5) {
                    return null;
                }
                return byteBuf.toString(i9, unsignedShort5, CharsetUtil.US_ASCII).toLowerCase(Locale.US);
            }
            i3 = i6 + unsignedShort4;
        }
        return null;
    }

    private static void fireSniCompletionEvent(ChannelHandlerContext channelHandlerContext, String str, Future<?> future) {
        Throwable thCause = future.cause();
        if (thCause == null) {
            channelHandlerContext.fireUserEventTriggered((Object) new SniCompletionEvent(str));
        } else {
            channelHandlerContext.fireUserEventTriggered((Object) new SniCompletionEvent(str, thCause));
        }
    }

    @Override // io.netty.handler.ssl.SslClientHelloHandler
    public Future<T> lookup(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        String strExtractSniHostname = byteBuf == null ? null : extractSniHostname(byteBuf);
        this.hostname = strExtractSniHostname;
        return lookup(channelHandlerContext, strExtractSniHostname);
    }

    public abstract Future<T> lookup(ChannelHandlerContext channelHandlerContext, String str) throws Exception;

    @Override // io.netty.handler.ssl.SslClientHelloHandler
    public void onLookupComplete(ChannelHandlerContext channelHandlerContext, Future<T> future) throws Exception {
        try {
            onLookupComplete(channelHandlerContext, this.hostname, future);
        } finally {
            fireSniCompletionEvent(channelHandlerContext, this.hostname, future);
        }
    }

    public abstract void onLookupComplete(ChannelHandlerContext channelHandlerContext, String str, Future<T> future) throws Exception;
}
