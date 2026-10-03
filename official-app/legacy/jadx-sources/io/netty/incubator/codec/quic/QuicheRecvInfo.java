package io.netty.incubator.codec.quic;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheRecvInfo {
    private QuicheRecvInfo() {
    }

    public static boolean isSameAddress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        long jMemoryAddressWithPosition = Quiche.memoryAddressWithPosition(byteBuffer);
        int i = Quiche.SIZEOF_QUICHE_RECV_INFO;
        return SockaddrIn.cmp(jMemoryAddressWithPosition + ((long) i), Quiche.memoryAddressWithPosition(byteBuffer2) + ((long) i)) == 0;
    }

    public static void setRecvInfo(ByteBuffer byteBuffer, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        int iPosition = byteBuffer.position();
        try {
            int i = Quiche.SIZEOF_QUICHE_RECV_INFO + iPosition;
            byteBuffer.position(i);
            long jMemoryAddressWithPosition = Quiche.memoryAddressWithPosition(byteBuffer);
            int address = SockaddrIn.setAddress(byteBuffer, inetSocketAddress);
            byteBuffer.position(i + address);
            long jMemoryAddressWithPosition2 = Quiche.memoryAddressWithPosition(byteBuffer);
            int address2 = SockaddrIn.setAddress(byteBuffer, inetSocketAddress2);
            if (Quiche.SIZEOF_SIZE_T == 4) {
                byteBuffer.putInt(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM + iPosition, (int) jMemoryAddressWithPosition);
                byteBuffer.putInt(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO + iPosition, (int) jMemoryAddressWithPosition2);
            } else {
                byteBuffer.putLong(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM + iPosition, jMemoryAddressWithPosition);
                byteBuffer.putLong(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO + iPosition, jMemoryAddressWithPosition2);
            }
            int i2 = Quiche.SIZEOF_SOCKLEN_T;
            if (i2 == 1) {
                byteBuffer.put(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM_LEN + iPosition, (byte) address);
                byteBuffer.put(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO_LEN + iPosition, (byte) address2);
            } else if (i2 == 2) {
                byteBuffer.putShort(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM_LEN + iPosition, (short) address);
                byteBuffer.putShort(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO_LEN + iPosition, (short) address2);
            } else if (i2 == 4) {
                byteBuffer.putInt(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM_LEN + iPosition, address);
                byteBuffer.putInt(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO_LEN + iPosition, address2);
            } else {
                if (i2 != 8) {
                    throw new IllegalStateException();
                }
                byteBuffer.putLong(Quiche.QUICHE_RECV_INFO_OFFSETOF_FROM_LEN + iPosition, address);
                byteBuffer.putLong(Quiche.QUICHE_RECV_INFO_OFFSETOF_TO_LEN + iPosition, address2);
            }
            byteBuffer.position(iPosition);
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            throw th;
        }
    }
}
