package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;
import io.netty.util.NetUtil;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public final class InsecureQuicTokenHandler implements QuicTokenHandler {
    public static final InsecureQuicTokenHandler INSTANCE;
    static final int MAX_TOKEN_LEN;
    private static final String SERVER_NAME = "netty";
    private static final ByteBuf SERVER_NAME_BUFFER;
    private static final byte[] SERVER_NAME_BYTES;

    static {
        byte[] bytes = SERVER_NAME.getBytes(CharsetUtil.US_ASCII);
        SERVER_NAME_BYTES = bytes;
        SERVER_NAME_BUFFER = Unpooled.unreleasableBuffer(Unpooled.wrappedBuffer(bytes)).asReadOnly();
        MAX_TOKEN_LEN = Quiche.QUICHE_MAX_CONN_ID_LEN + NetUtil.LOCALHOST6.getAddress().length + bytes.length;
        INSTANCE = new InsecureQuicTokenHandler();
    }

    private InsecureQuicTokenHandler() {
        Quic.ensureAvailability();
    }

    @Override // io.netty.incubator.codec.quic.QuicTokenHandler
    public int maxTokenLength() {
        return MAX_TOKEN_LEN;
    }

    @Override // io.netty.incubator.codec.quic.QuicTokenHandler
    public int validateToken(ByteBuf byteBuf, InetSocketAddress inetSocketAddress) {
        byte[] address = inetSocketAddress.getAddress().getAddress();
        byte[] bArr = SERVER_NAME_BYTES;
        int length = bArr.length + inetSocketAddress.getAddress().getAddress().length;
        if (byteBuf.readableBytes() <= bArr.length + address.length || !SERVER_NAME_BUFFER.equals(byteBuf.slice(0, bArr.length))) {
            return -1;
        }
        ByteBuf byteBufWrappedBuffer = Unpooled.wrappedBuffer(address);
        try {
            if (byteBufWrappedBuffer.equals(byteBuf.slice(bArr.length, address.length))) {
                byteBufWrappedBuffer.release();
                return length;
            }
            byteBufWrappedBuffer.release();
            return -1;
        } catch (Throwable th) {
            byteBufWrappedBuffer.release();
            throw th;
        }
    }

    @Override // io.netty.incubator.codec.quic.QuicTokenHandler
    public boolean writeToken(ByteBuf byteBuf, ByteBuf byteBuf2, InetSocketAddress inetSocketAddress) {
        byteBuf.writeBytes(SERVER_NAME_BYTES).writeBytes(inetSocketAddress.getAddress().getAddress()).writeBytes(byteBuf2, byteBuf2.readerIndex(), byteBuf2.readableBytes());
        return true;
    }
}
