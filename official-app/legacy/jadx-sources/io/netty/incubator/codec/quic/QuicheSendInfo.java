package io.netty.incubator.codec.quic;

import io.netty.util.concurrent.FastThreadLocal;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheSendInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final FastThreadLocal<byte[]> IPV4_ARRAYS = new FastThreadLocal<byte[]>() { // from class: io.netty.incubator.codec.quic.QuicheSendInfo.1
        @Override // io.netty.util.concurrent.FastThreadLocal
        public byte[] initialValue() {
            return new byte[4];
        }
    };
    private static final FastThreadLocal<byte[]> IPV6_ARRAYS = new FastThreadLocal<byte[]>() { // from class: io.netty.incubator.codec.quic.QuicheSendInfo.2
        @Override // io.netty.util.concurrent.FastThreadLocal
        public byte[] initialValue() {
            return new byte[16];
        }
    };

    private QuicheSendInfo() {
    }

    public static InetSocketAddress getAddress(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        try {
            long len = getLen(byteBuffer, Quiche.QUICHE_SEND_INFO_OFFSETOF_TO_LEN + iPosition);
            byteBuffer.position(Quiche.QUICHE_SEND_INFO_OFFSETOF_TO + iPosition);
            return len == ((long) Quiche.SIZEOF_SOCKADDR_IN) ? SockaddrIn.getIPv4(byteBuffer, IPV4_ARRAYS.get()) : SockaddrIn.getIPv6(byteBuffer, IPV6_ARRAYS.get(), IPV4_ARRAYS.get());
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    private static long getLen(ByteBuffer byteBuffer, int i) {
        int i2;
        int i3 = Quiche.SIZEOF_SOCKLEN_T;
        if (i3 == 1) {
            i2 = byteBuffer.get(i);
        } else if (i3 == 2) {
            i2 = byteBuffer.getShort(i);
        } else {
            if (i3 != 4) {
                if (i3 == 8) {
                    return byteBuffer.getLong(i);
                }
                throw new IllegalStateException();
            }
            i2 = byteBuffer.getInt(i);
        }
        return i2;
    }

    public static boolean isSameAddress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        long jMemoryAddressWithPosition = Quiche.memoryAddressWithPosition(byteBuffer);
        int i = Quiche.QUICHE_SEND_INFO_OFFSETOF_TO;
        return SockaddrIn.cmp(jMemoryAddressWithPosition + ((long) i), Quiche.memoryAddressWithPosition(byteBuffer2) + ((long) i)) == 0;
    }

    public static void setSendInfo(ByteBuffer byteBuffer, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        int iPosition = byteBuffer.position();
        int i = Quiche.QUICHE_SEND_INFO_OFFSETOF_TO + iPosition;
        try {
            byteBuffer.position(i);
            int address = SockaddrIn.setAddress(byteBuffer, inetSocketAddress);
            byteBuffer.position(i + address);
            int address2 = SockaddrIn.setAddress(byteBuffer, inetSocketAddress2);
            int i2 = Quiche.SIZEOF_SOCKLEN_T;
            if (i2 == 1) {
                byteBuffer.put(Quiche.QUICHE_SEND_INFO_OFFSETOF_FROM_LEN + iPosition, (byte) address);
                byteBuffer.put(Quiche.QUICHE_SEND_INFO_OFFSETOF_TO_LEN + iPosition, (byte) address2);
            } else if (i2 == 2) {
                byteBuffer.putShort(Quiche.QUICHE_SEND_INFO_OFFSETOF_FROM_LEN + iPosition, (short) address);
                byteBuffer.putShort(Quiche.QUICHE_SEND_INFO_OFFSETOF_TO_LEN + iPosition, (short) address2);
            } else if (i2 == 4) {
                byteBuffer.putInt(Quiche.QUICHE_SEND_INFO_OFFSETOF_FROM_LEN + iPosition, address);
                byteBuffer.putInt(Quiche.QUICHE_SEND_INFO_OFFSETOF_TO_LEN + iPosition, address2);
            } else {
                if (i2 != 8) {
                    throw new IllegalStateException();
                }
                byteBuffer.putLong(Quiche.QUICHE_SEND_INFO_OFFSETOF_FROM_LEN + iPosition, address);
                byteBuffer.putLong(Quiche.QUICHE_SEND_INFO_OFFSETOF_TO_LEN + iPosition, address2);
            }
            byteBuffer.position(iPosition);
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            throw th;
        }
    }
}
