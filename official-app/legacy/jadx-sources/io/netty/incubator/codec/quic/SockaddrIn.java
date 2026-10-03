package io.netty.incubator.codec.quic;

import io.netty.util.internal.PlatformDependent;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes10.dex */
final class SockaddrIn {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int IPV4_ADDRESS_LENGTH = 4;
    static final int IPV6_ADDRESS_LENGTH = 16;
    static final byte[] IPV4_MAPPED_IPV6_PREFIX = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1};
    static final byte[] SOCKADDR_IN6_EMPTY_ARRAY = new byte[Quiche.SIZEOF_SOCKADDR_IN6];
    static final byte[] SOCKADDR_IN_EMPTY_ARRAY = new byte[Quiche.SIZEOF_SOCKADDR_IN];

    private SockaddrIn() {
    }

    public static int cmp(long j2, long j3) {
        return Quiche.sockaddr_cmp(j2, j3);
    }

    public static InetSocketAddress getIPv4(ByteBuffer byteBuffer, byte[] bArr) {
        int iPosition = byteBuffer.position();
        try {
            int i = byteBuffer.getShort(Quiche.SOCKADDR_IN_OFFSETOF_SIN_PORT + iPosition) & UShort.MAX_VALUE;
            byteBuffer.position(Quiche.SOCKADDR_IN_OFFSETOF_SIN_ADDR + iPosition + Quiche.IN_ADDRESS_OFFSETOF_S_ADDR);
            byteBuffer.get(bArr);
            try {
                return new InetSocketAddress(InetAddress.getByAddress(bArr), i);
            } catch (UnknownHostException unused) {
                return null;
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static InetSocketAddress getIPv6(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int iPosition = byteBuffer.position();
        try {
            int i = byteBuffer.getShort(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_PORT + iPosition) & UShort.MAX_VALUE;
            byteBuffer.position(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_ADDR + iPosition + Quiche.IN6_ADDRESS_OFFSETOF_S6_ADDR);
            byteBuffer.get(bArr);
            byte[] bArr3 = IPV4_MAPPED_IPV6_PREFIX;
            if (!PlatformDependent.equals(bArr, 0, bArr3, 0, bArr3.length)) {
                try {
                    return new InetSocketAddress(Inet6Address.getByAddress((String) null, bArr, byteBuffer.getInt(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_SCOPE_ID + iPosition)), i);
                } catch (UnknownHostException unused) {
                    return null;
                }
            }
            System.arraycopy(bArr, bArr3.length, bArr2, 0, 4);
            try {
                return new InetSocketAddress(InetAddress.getByAddress(bArr2), i);
            } catch (UnknownHostException unused2) {
                return null;
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static int setAddress(ByteBuffer byteBuffer, InetSocketAddress inetSocketAddress) {
        return setAddress(inetSocketAddress.getAddress() instanceof Inet6Address, byteBuffer, inetSocketAddress);
    }

    public static int setIPv4(ByteBuffer byteBuffer, InetAddress inetAddress, int i) {
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.put(SOCKADDR_IN_EMPTY_ARRAY);
            byteBuffer.putShort(Quiche.SOCKADDR_IN_OFFSETOF_SIN_FAMILY + iPosition, Quiche.AF_INET);
            byteBuffer.putShort(Quiche.SOCKADDR_IN_OFFSETOF_SIN_PORT + iPosition, (short) i);
            byte[] address = inetAddress.getAddress();
            int length = address.length == 16 ? IPV4_MAPPED_IPV6_PREFIX.length : 0;
            byteBuffer.position(Quiche.SOCKADDR_IN_OFFSETOF_SIN_ADDR + iPosition + Quiche.IN_ADDRESS_OFFSETOF_S_ADDR);
            byteBuffer.put(address, length, 4);
            return Quiche.SIZEOF_SOCKADDR_IN;
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static int setIPv6(ByteBuffer byteBuffer, InetAddress inetAddress, int i) {
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.put(SOCKADDR_IN6_EMPTY_ARRAY);
            byteBuffer.putShort(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_FAMILY + iPosition, Quiche.AF_INET6);
            byteBuffer.putShort(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_PORT + iPosition, (short) i);
            byte[] address = inetAddress.getAddress();
            int i2 = Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_ADDR + Quiche.IN6_ADDRESS_OFFSETOF_S6_ADDR;
            if (address.length == 4) {
                int i3 = i2 + iPosition;
                byteBuffer.position(i3);
                byte[] bArr = IPV4_MAPPED_IPV6_PREFIX;
                byteBuffer.put(bArr);
                byteBuffer.position(i3 + bArr.length);
                byteBuffer.put(address, 0, 4);
            } else {
                byteBuffer.position(i2 + iPosition);
                byteBuffer.put(address, 0, 16);
                byteBuffer.putInt(Quiche.SOCKADDR_IN6_OFFSETOF_SIN6_SCOPE_ID + iPosition, ((Inet6Address) inetAddress).getScopeId());
            }
            return Quiche.SIZEOF_SOCKADDR_IN6;
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static int setAddress(boolean z, ByteBuffer byteBuffer, InetSocketAddress inetSocketAddress) {
        if (z) {
            return setIPv6(byteBuffer, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        }
        return setIPv4(byteBuffer, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
    }
}
