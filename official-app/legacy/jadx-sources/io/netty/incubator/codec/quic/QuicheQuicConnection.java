package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheQuicConnection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int TOTAL_RECV_INFO_SIZE;
    private long connection;
    private final ByteBuf recvInfoBuffer;
    private final ByteBuffer recvInfoBuffer1;
    private final ByteBuffer recvInfoBuffer2;
    private final ByteBuf sendInfoBuffer;
    private final ByteBuffer sendInfoBuffer1;
    private final ByteBuffer sendInfoBuffer2;
    private boolean recvInfoFirst = true;
    private boolean sendInfoFirst = true;

    static {
        int i = Quiche.SIZEOF_QUICHE_RECV_INFO;
        int i2 = Quiche.SIZEOF_SOCKADDR_STORAGE;
        TOTAL_RECV_INFO_SIZE = i + i2 + i2;
    }

    public QuicheQuicConnection(long j2) {
        this.connection = j2;
        int i = TOTAL_RECV_INFO_SIZE;
        ByteBuf byteBufAllocateNativeOrder = Quiche.allocateNativeOrder(i * 2);
        this.recvInfoBuffer = byteBufAllocateNativeOrder;
        int i2 = Quiche.SIZEOF_QUICHE_SEND_INFO;
        ByteBuf byteBufAllocateNativeOrder2 = Quiche.allocateNativeOrder(i2 * 2);
        this.sendInfoBuffer = byteBufAllocateNativeOrder2;
        byteBufAllocateNativeOrder.setZero(0, byteBufAllocateNativeOrder.capacity());
        byteBufAllocateNativeOrder2.setZero(0, byteBufAllocateNativeOrder2.capacity());
        this.recvInfoBuffer1 = byteBufAllocateNativeOrder.nioBuffer(0, i);
        this.recvInfoBuffer2 = byteBufAllocateNativeOrder.nioBuffer(i, i);
        this.sendInfoBuffer1 = byteBufAllocateNativeOrder2.nioBuffer(0, i2);
        this.sendInfoBuffer2 = byteBufAllocateNativeOrder2.nioBuffer(i2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] lambda$destinationId$1() {
        return Quiche.quiche_conn_destination_id(this.connection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] lambda$sourceId$0() {
        return Quiche.quiche_conn_source_id(this.connection);
    }

    public long address() {
        return this.connection;
    }

    public QuicConnectionAddress connectionId(Supplier<byte[]> supplier) {
        synchronized (this) {
            if (this.connection == -1) {
                return null;
            }
            byte[] bArr = supplier.get();
            if (bArr == null) {
                return null;
            }
            return new QuicConnectionAddress(bArr);
        }
    }

    public QuicConnectionAddress destinationId() {
        return connectionId(new Supplier() { // from class: io.netty.incubator.codec.quic.i
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.lambda$destinationId$1();
            }
        });
    }

    public void finalize() throws Throwable {
        try {
            free();
        } finally {
            super.finalize();
        }
    }

    public void free() {
        boolean z;
        synchronized (this) {
            long j2 = this.connection;
            if (j2 != -1) {
                try {
                    Quiche.quiche_conn_free(j2);
                    this.connection = -1L;
                    z = true;
                } catch (Throwable th) {
                    this.connection = -1L;
                    throw th;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            this.recvInfoBuffer.release();
            this.sendInfoBuffer.release();
        }
    }

    public void initInfo(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        QuicheRecvInfo.setRecvInfo(this.recvInfoBuffer1, inetSocketAddress2, inetSocketAddress);
        QuicheRecvInfo.setRecvInfo(this.recvInfoBuffer2, inetSocketAddress2, inetSocketAddress);
        QuicheSendInfo.setSendInfo(this.sendInfoBuffer1, inetSocketAddress, inetSocketAddress2);
        QuicheSendInfo.setSendInfo(this.sendInfoBuffer2, inetSocketAddress, inetSocketAddress2);
    }

    public boolean isClosed() {
        return Quiche.quiche_conn_is_closed(this.connection);
    }

    public boolean isRecvInfoChanged() {
        return !QuicheRecvInfo.isSameAddress(this.recvInfoBuffer1, this.recvInfoBuffer2);
    }

    public boolean isSendInfoChanged() {
        return !QuicheSendInfo.isSameAddress(this.sendInfoBuffer1, this.sendInfoBuffer2);
    }

    public ByteBuffer nextRecvInfo() {
        boolean z = !this.recvInfoFirst;
        this.recvInfoFirst = z;
        return z ? this.recvInfoBuffer1 : this.recvInfoBuffer2;
    }

    public ByteBuffer nextSendInfo() {
        boolean z = !this.sendInfoFirst;
        this.sendInfoFirst = z;
        return z ? this.sendInfoBuffer1 : this.sendInfoBuffer2;
    }

    public QuicConnectionAddress sourceId() {
        return connectionId(new Supplier() { // from class: io.netty.incubator.codec.quic.h
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.lambda$sourceId$0();
            }
        });
    }
}
