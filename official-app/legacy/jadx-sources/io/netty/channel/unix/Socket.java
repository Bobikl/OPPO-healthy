package io.netty.channel.unix;

import io.netty.channel.ChannelException;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.util.CharsetUtil;
import io.netty.util.NetUtil;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;

/* JADX INFO: loaded from: classes10.dex */
public class Socket extends FileDescriptor {

    @Deprecated
    public static final int UDS_SUN_PATH_SIZE = 100;
    private static volatile boolean isIpv6Preferred;
    protected final boolean ipv6;

    public Socket(int i) {
        super(i);
        this.ipv6 = isIPv6(i);
    }

    private static native int accept(int i, byte[] bArr);

    private static native int bind(int i, boolean z, byte[] bArr, int i2, int i3);

    private static native int bindDomainSocket(int i, byte[] bArr);

    private static native int connect(int i, boolean z, byte[] bArr, int i2, int i3);

    private static native int connectDomainSocket(int i, byte[] bArr);

    private static native int disconnect(int i, boolean z);

    private static native int finishConnect(int i);

    private static native int getIntOpt(int i, int i2, int i3) throws IOException;

    private static native void getRawOptAddress(int i, int i2, int i3, long j2, int i4) throws IOException;

    private static native void getRawOptArray(int i, int i2, int i3, byte[] bArr, int i4, int i5) throws IOException;

    private static native int getReceiveBufferSize(int i) throws IOException;

    private static native int getSendBufferSize(int i) throws IOException;

    private static native int getSoError(int i) throws IOException;

    private static native int getSoLinger(int i) throws IOException;

    private static native int getTrafficClass(int i, boolean z) throws IOException;

    public static void initialize() {
        isIpv6Preferred = isIPv6Preferred0(NetUtil.isIpV4StackPreferred());
    }

    private static native int isBroadcast(int i) throws IOException;

    private static native boolean isIPv6(int i);

    public static boolean isIPv6Preferred() {
        return isIpv6Preferred;
    }

    private static native boolean isIPv6Preferred0(boolean z);

    private static native int isKeepAlive(int i) throws IOException;

    private static native int isReuseAddress(int i) throws IOException;

    private static native int isReusePort(int i) throws IOException;

    private static native int isTcpNoDelay(int i) throws IOException;

    private static native int listen(int i, int i2);

    private static native byte[] localAddress(int i);

    private static native int msgFastopen();

    public static Socket newSocketDgram() {
        return new Socket(newSocketDgram0());
    }

    public static int newSocketDgram0() {
        return newSocketDgram0(isIPv6Preferred());
    }

    private static native int newSocketDgramFd(boolean z);

    public static Socket newSocketDomain() {
        return new Socket(newSocketDomain0());
    }

    public static int newSocketDomain0() {
        int iNewSocketDomainFd = newSocketDomainFd();
        if (iNewSocketDomainFd >= 0) {
            return iNewSocketDomainFd;
        }
        throw new ChannelException(Errors.newIOException("newSocketDomain", iNewSocketDomainFd));
    }

    public static Socket newSocketDomainDgram() {
        return new Socket(newSocketDomainDgram0());
    }

    public static int newSocketDomainDgram0() {
        int iNewSocketDomainDgramFd = newSocketDomainDgramFd();
        if (iNewSocketDomainDgramFd >= 0) {
            return iNewSocketDomainDgramFd;
        }
        throw new ChannelException(Errors.newIOException("newSocketDomainDgram", iNewSocketDomainDgramFd));
    }

    private static native int newSocketDomainDgramFd();

    private static native int newSocketDomainFd();

    public static Socket newSocketStream() {
        return new Socket(newSocketStream0());
    }

    public static int newSocketStream0() {
        return newSocketStream0(isIPv6Preferred());
    }

    private static native int newSocketStreamFd(boolean z);

    private static native int recv(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int recvAddress(int i, long j2, int i2, int i3);

    private static native int recvFd(int i);

    private static native DatagramSocketAddress recvFrom(int i, ByteBuffer byteBuffer, int i2, int i3) throws IOException;

    private static native DatagramSocketAddress recvFromAddress(int i, long j2, int i2, int i3) throws IOException;

    private static native DomainDatagramSocketAddress recvFromAddressDomainSocket(int i, long j2, int i2, int i3) throws IOException;

    private static native DomainDatagramSocketAddress recvFromDomainSocket(int i, ByteBuffer byteBuffer, int i2, int i3) throws IOException;

    private static native byte[] remoteAddress(int i);

    private static native int send(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int sendAddress(int i, long j2, int i2, int i3);

    private static native int sendFd(int i, int i2);

    private static native int sendTo(int i, boolean z, ByteBuffer byteBuffer, int i2, int i3, byte[] bArr, int i4, int i5, int i6);

    private static native int sendToAddress(int i, boolean z, long j2, int i2, int i3, byte[] bArr, int i4, int i5, int i6);

    private static native int sendToAddressDomainSocket(int i, long j2, int i2, int i3, byte[] bArr);

    private static native int sendToAddresses(int i, boolean z, long j2, int i2, byte[] bArr, int i3, int i4, int i5);

    private static native int sendToAddressesDomainSocket(int i, long j2, int i2, byte[] bArr);

    private static native int sendToDomainSocket(int i, ByteBuffer byteBuffer, int i2, int i3, byte[] bArr);

    private static native void setBroadcast(int i, int i2) throws IOException;

    private static native void setIntOpt(int i, int i2, int i3, int i4) throws IOException;

    private static native void setKeepAlive(int i, int i2) throws IOException;

    private static native void setRawOptAddress(int i, int i2, int i3, long j2, int i4) throws IOException;

    private static native void setRawOptArray(int i, int i2, int i3, byte[] bArr, int i4, int i5) throws IOException;

    private static native void setReceiveBufferSize(int i, int i2) throws IOException;

    private static native void setReuseAddress(int i, int i2) throws IOException;

    private static native void setReusePort(int i, int i2) throws IOException;

    private static native void setSendBufferSize(int i, int i2) throws IOException;

    private static native void setSoLinger(int i, int i2) throws IOException;

    private static native void setTcpNoDelay(int i, int i2) throws IOException;

    private static native void setTrafficClass(int i, boolean z, int i2) throws IOException;

    public static boolean shouldUseIpv6(InternetProtocolFamily internetProtocolFamily) {
        if (internetProtocolFamily == null) {
            return isIPv6Preferred();
        }
        return internetProtocolFamily == InternetProtocolFamily.IPv6;
    }

    private static native int shutdown(int i, boolean z, boolean z2);

    private boolean useIpv6(InetAddress inetAddress) {
        return useIpv6(this, inetAddress);
    }

    public final int accept(byte[] bArr) throws IOException {
        int iAccept = accept(this.fd, bArr);
        if (iAccept >= 0) {
            return iAccept;
        }
        if (iAccept == Errors.ERRNO_EAGAIN_NEGATIVE || iAccept == Errors.ERRNO_EWOULDBLOCK_NEGATIVE) {
            return -1;
        }
        throw Errors.newIOException("accept", iAccept);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            InetAddress address = inetSocketAddress.getAddress();
            NativeInetAddress nativeInetAddressNewInstance = NativeInetAddress.newInstance(address);
            int iBind = bind(this.fd, useIpv6(address), nativeInetAddressNewInstance.address, nativeInetAddressNewInstance.scopeId, inetSocketAddress.getPort());
            if (iBind < 0) {
                throw Errors.newIOException("bind", iBind);
            }
            return;
        }
        if (socketAddress instanceof DomainSocketAddress) {
            int iBindDomainSocket = bindDomainSocket(this.fd, ((DomainSocketAddress) socketAddress).path().getBytes(CharsetUtil.UTF_8));
            if (iBindDomainSocket < 0) {
                throw Errors.newIOException("bind", iBindDomainSocket);
            }
        } else {
            throw new Error("Unexpected SocketAddress implementation " + socketAddress);
        }
    }

    public final boolean connect(SocketAddress socketAddress) throws IOException {
        int iConnectDomainSocket;
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            InetAddress address = inetSocketAddress.getAddress();
            NativeInetAddress nativeInetAddressNewInstance = NativeInetAddress.newInstance(address);
            iConnectDomainSocket = connect(this.fd, useIpv6(address), nativeInetAddressNewInstance.address, nativeInetAddressNewInstance.scopeId, inetSocketAddress.getPort());
        } else {
            if (!(socketAddress instanceof DomainSocketAddress)) {
                throw new Error("Unexpected SocketAddress implementation " + socketAddress);
            }
            iConnectDomainSocket = connectDomainSocket(this.fd, ((DomainSocketAddress) socketAddress).path().getBytes(CharsetUtil.UTF_8));
        }
        if (iConnectDomainSocket < 0) {
            return Errors.handleConnectErrno("connect", iConnectDomainSocket);
        }
        return true;
    }

    public final void disconnect() throws IOException {
        int iDisconnect = disconnect(this.fd, this.ipv6);
        if (iDisconnect < 0) {
            Errors.handleConnectErrno("disconnect", iDisconnect);
        }
    }

    public final boolean finishConnect() throws IOException {
        int iFinishConnect = finishConnect(this.fd);
        if (iFinishConnect < 0) {
            return Errors.handleConnectErrno("finishConnect", iFinishConnect);
        }
        return true;
    }

    public int getIntOpt(int i, int i2) throws IOException {
        return getIntOpt(this.fd, i, i2);
    }

    public void getRawOpt(int i, int i2, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.isDirect()) {
            getRawOptAddress(this.fd, i, i2, ((long) byteBuffer.position()) + Buffer.memoryAddress(byteBuffer), byteBuffer.remaining());
        } else if (byteBuffer.hasArray()) {
            getRawOptArray(this.fd, i, i2, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            getRawOptArray(this.fd, i, i2, bArr, 0, iRemaining);
            byteBuffer.put(bArr);
        }
        byteBuffer.position(byteBuffer.limit());
    }

    public final int getReceiveBufferSize() throws IOException {
        return getReceiveBufferSize(this.fd);
    }

    public final int getSendBufferSize() throws IOException {
        return getSendBufferSize(this.fd);
    }

    public final int getSoError() throws IOException {
        return getSoError(this.fd);
    }

    public final int getSoLinger() throws IOException {
        return getSoLinger(this.fd);
    }

    public final int getTrafficClass() throws IOException {
        return getTrafficClass(this.fd, this.ipv6);
    }

    public final boolean isBroadcast() throws IOException {
        return isBroadcast(this.fd) != 0;
    }

    public final boolean isInputShutdown() {
        return FileDescriptor.isInputShutdown(this.state);
    }

    public final boolean isKeepAlive() throws IOException {
        return isKeepAlive(this.fd) != 0;
    }

    public final boolean isOutputShutdown() {
        return FileDescriptor.isOutputShutdown(this.state);
    }

    public final boolean isReuseAddress() throws IOException {
        return isReuseAddress(this.fd) != 0;
    }

    public final boolean isReusePort() throws IOException {
        return isReusePort(this.fd) != 0;
    }

    public final boolean isShutdown() {
        int i = this.state;
        return FileDescriptor.isInputShutdown(i) && FileDescriptor.isOutputShutdown(i);
    }

    public final boolean isTcpNoDelay() throws IOException {
        return isTcpNoDelay(this.fd) != 0;
    }

    public final void listen(int i) throws IOException {
        int iListen = listen(this.fd, i);
        if (iListen < 0) {
            throw Errors.newIOException("listen", iListen);
        }
    }

    public final InetSocketAddress localAddress() {
        byte[] bArrLocalAddress = localAddress(this.fd);
        if (bArrLocalAddress == null) {
            return null;
        }
        return NativeInetAddress.address(bArrLocalAddress, 0, bArrLocalAddress.length);
    }

    public int recv(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int iRecv = recv(intValue(), byteBuffer, i, i2);
        if (iRecv > 0) {
            return iRecv;
        }
        if (iRecv == 0) {
            return -1;
        }
        return Errors.ioResult("recv", iRecv);
    }

    public int recvAddress(long j2, int i, int i2) throws IOException {
        int iRecvAddress = recvAddress(intValue(), j2, i, i2);
        if (iRecvAddress > 0) {
            return iRecvAddress;
        }
        if (iRecvAddress == 0) {
            return -1;
        }
        return Errors.ioResult("recvAddress", iRecvAddress);
    }

    public final int recvFd() throws IOException {
        int iRecvFd = recvFd(this.fd);
        if (iRecvFd > 0) {
            return iRecvFd;
        }
        if (iRecvFd == 0) {
            return -1;
        }
        if (iRecvFd == Errors.ERRNO_EAGAIN_NEGATIVE || iRecvFd == Errors.ERRNO_EWOULDBLOCK_NEGATIVE) {
            return 0;
        }
        throw Errors.newIOException("recvFd", iRecvFd);
    }

    public final DatagramSocketAddress recvFrom(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        return recvFrom(this.fd, byteBuffer, i, i2);
    }

    public final DatagramSocketAddress recvFromAddress(long j2, int i, int i2) throws IOException {
        return recvFromAddress(this.fd, j2, i, i2);
    }

    public final DomainDatagramSocketAddress recvFromAddressDomainSocket(long j2, int i, int i2) throws IOException {
        return recvFromAddressDomainSocket(this.fd, j2, i, i2);
    }

    public final DomainDatagramSocketAddress recvFromDomainSocket(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        return recvFromDomainSocket(this.fd, byteBuffer, i, i2);
    }

    public final InetSocketAddress remoteAddress() {
        byte[] bArrRemoteAddress = remoteAddress(this.fd);
        if (bArrRemoteAddress == null) {
            return null;
        }
        return NativeInetAddress.address(bArrRemoteAddress, 0, bArrRemoteAddress.length);
    }

    public int send(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int iSend = send(intValue(), byteBuffer, i, i2);
        return iSend >= 0 ? iSend : Errors.ioResult("send", iSend);
    }

    public int sendAddress(long j2, int i, int i2) throws IOException {
        int iSendAddress = sendAddress(intValue(), j2, i, i2);
        return iSendAddress >= 0 ? iSendAddress : Errors.ioResult("sendAddress", iSendAddress);
    }

    public final int sendFd(int i) throws IOException {
        int iSendFd = sendFd(this.fd, i);
        if (iSendFd >= 0) {
            return iSendFd;
        }
        if (iSendFd == Errors.ERRNO_EAGAIN_NEGATIVE || iSendFd == Errors.ERRNO_EWOULDBLOCK_NEGATIVE) {
            return -1;
        }
        throw Errors.newIOException("sendFd", iSendFd);
    }

    public final int sendTo(ByteBuffer byteBuffer, int i, int i2, InetAddress inetAddress, int i3) throws IOException {
        return sendTo(byteBuffer, i, i2, inetAddress, i3, false);
    }

    public final int sendToAddress(long j2, int i, int i2, InetAddress inetAddress, int i3) throws IOException {
        return sendToAddress(j2, i, i2, inetAddress, i3, false);
    }

    public final int sendToAddressDomainSocket(long j2, int i, int i2, byte[] bArr) throws IOException {
        int iSendToAddressDomainSocket = sendToAddressDomainSocket(this.fd, j2, i, i2, bArr);
        return iSendToAddressDomainSocket >= 0 ? iSendToAddressDomainSocket : Errors.ioResult("sendToAddressDomainSocket", iSendToAddressDomainSocket);
    }

    public final int sendToAddresses(long j2, int i, InetAddress inetAddress, int i2) throws IOException {
        return sendToAddresses(j2, i, inetAddress, i2, false);
    }

    public final int sendToAddressesDomainSocket(long j2, int i, byte[] bArr) throws IOException {
        int iSendToAddressesDomainSocket = sendToAddressesDomainSocket(this.fd, j2, i, bArr);
        return iSendToAddressesDomainSocket >= 0 ? iSendToAddressesDomainSocket : Errors.ioResult("sendToAddressesDomainSocket", iSendToAddressesDomainSocket);
    }

    public final int sendToDomainSocket(ByteBuffer byteBuffer, int i, int i2, byte[] bArr) throws IOException {
        int iSendToDomainSocket = sendToDomainSocket(this.fd, byteBuffer, i, i2, bArr);
        return iSendToDomainSocket >= 0 ? iSendToDomainSocket : Errors.ioResult("sendToDomainSocket", iSendToDomainSocket);
    }

    public final void setBroadcast(boolean z) throws IOException {
        setBroadcast(this.fd, z ? 1 : 0);
    }

    public void setIntOpt(int i, int i2, int i3) throws IOException {
        setIntOpt(this.fd, i, i2, i3);
    }

    public final void setKeepAlive(boolean z) throws IOException {
        setKeepAlive(this.fd, z ? 1 : 0);
    }

    public void setRawOpt(int i, int i2, ByteBuffer byteBuffer) throws IOException {
        int iLimit = byteBuffer.limit();
        if (byteBuffer.isDirect()) {
            setRawOptAddress(this.fd, i, i2, ((long) byteBuffer.position()) + Buffer.memoryAddress(byteBuffer), byteBuffer.remaining());
        } else if (byteBuffer.hasArray()) {
            setRawOptArray(this.fd, i, i2, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            setRawOptArray(this.fd, i, i2, bArr, 0, iRemaining);
        }
        byteBuffer.position(iLimit);
    }

    public final void setReceiveBufferSize(int i) throws IOException {
        setReceiveBufferSize(this.fd, i);
    }

    public final void setReuseAddress(boolean z) throws IOException {
        setReuseAddress(this.fd, z ? 1 : 0);
    }

    public final void setReusePort(boolean z) throws IOException {
        setReusePort(this.fd, z ? 1 : 0);
    }

    public final void setSendBufferSize(int i) throws IOException {
        setSendBufferSize(this.fd, i);
    }

    public final void setSoLinger(int i) throws IOException {
        setSoLinger(this.fd, i);
    }

    public final void setTcpNoDelay(boolean z) throws IOException {
        setTcpNoDelay(this.fd, z ? 1 : 0);
    }

    public final void setTrafficClass(int i) throws IOException {
        setTrafficClass(this.fd, this.ipv6, i);
    }

    public final void shutdown() throws IOException {
        shutdown(true, true);
    }

    @Override // io.netty.channel.unix.FileDescriptor
    public String toString() {
        return "Socket{fd=" + this.fd + '}';
    }

    public static int newSocketDgram0(InternetProtocolFamily internetProtocolFamily) {
        return newSocketDgram0(shouldUseIpv6(internetProtocolFamily));
    }

    public static int newSocketStream0(InternetProtocolFamily internetProtocolFamily) {
        return newSocketStream0(shouldUseIpv6(internetProtocolFamily));
    }

    public static boolean useIpv6(Socket socket, InetAddress inetAddress) {
        return socket.ipv6 || (inetAddress instanceof Inet6Address);
    }

    public final int sendTo(ByteBuffer byteBuffer, int i, int i2, InetAddress inetAddress, int i3, boolean z) throws IOException {
        byte[] bArrIpv4MappedIpv6Address;
        int scopeId;
        if (inetAddress instanceof Inet6Address) {
            bArrIpv4MappedIpv6Address = inetAddress.getAddress();
            scopeId = ((Inet6Address) inetAddress).getScopeId();
        } else {
            bArrIpv4MappedIpv6Address = NativeInetAddress.ipv4MappedIpv6Address(inetAddress.getAddress());
            scopeId = 0;
        }
        int iSendTo = sendTo(this.fd, useIpv6(inetAddress), byteBuffer, i, i2, bArrIpv4MappedIpv6Address, scopeId, i3, z ? msgFastopen() : 0);
        if (iSendTo >= 0) {
            return iSendTo;
        }
        if (iSendTo == Errors.ERRNO_EINPROGRESS_NEGATIVE && z) {
            return 0;
        }
        if (iSendTo != Errors.ERROR_ECONNREFUSED_NEGATIVE) {
            return Errors.ioResult("sendTo", iSendTo);
        }
        throw new PortUnreachableException("sendTo failed");
    }

    public final int sendToAddress(long j2, int i, int i2, InetAddress inetAddress, int i3, boolean z) throws IOException {
        byte[] bArrIpv4MappedIpv6Address;
        int scopeId;
        if (inetAddress instanceof Inet6Address) {
            bArrIpv4MappedIpv6Address = inetAddress.getAddress();
            scopeId = ((Inet6Address) inetAddress).getScopeId();
        } else {
            bArrIpv4MappedIpv6Address = NativeInetAddress.ipv4MappedIpv6Address(inetAddress.getAddress());
            scopeId = 0;
        }
        int iSendToAddress = sendToAddress(this.fd, useIpv6(inetAddress), j2, i, i2, bArrIpv4MappedIpv6Address, scopeId, i3, z ? msgFastopen() : 0);
        if (iSendToAddress >= 0) {
            return iSendToAddress;
        }
        if (iSendToAddress == Errors.ERRNO_EINPROGRESS_NEGATIVE && z) {
            return 0;
        }
        if (iSendToAddress != Errors.ERROR_ECONNREFUSED_NEGATIVE) {
            return Errors.ioResult("sendToAddress", iSendToAddress);
        }
        throw new PortUnreachableException("sendToAddress failed");
    }

    public final int sendToAddresses(long j2, int i, InetAddress inetAddress, int i2, boolean z) throws IOException {
        byte[] bArrIpv4MappedIpv6Address;
        int scopeId;
        if (inetAddress instanceof Inet6Address) {
            bArrIpv4MappedIpv6Address = inetAddress.getAddress();
            scopeId = ((Inet6Address) inetAddress).getScopeId();
        } else {
            bArrIpv4MappedIpv6Address = NativeInetAddress.ipv4MappedIpv6Address(inetAddress.getAddress());
            scopeId = 0;
        }
        int iSendToAddresses = sendToAddresses(this.fd, useIpv6(inetAddress), j2, i, bArrIpv4MappedIpv6Address, scopeId, i2, z ? msgFastopen() : 0);
        if (iSendToAddresses >= 0) {
            return iSendToAddresses;
        }
        if (iSendToAddresses == Errors.ERRNO_EINPROGRESS_NEGATIVE && z) {
            return 0;
        }
        if (iSendToAddresses != Errors.ERROR_ECONNREFUSED_NEGATIVE) {
            return Errors.ioResult("sendToAddresses", iSendToAddresses);
        }
        throw new PortUnreachableException("sendToAddresses failed");
    }

    public final void shutdown(boolean z, boolean z2) throws IOException {
        int i;
        int iInputShutdown;
        do {
            i = this.state;
            if (FileDescriptor.isClosed(i)) {
                throw new ClosedChannelException();
            }
            iInputShutdown = (!z || FileDescriptor.isInputShutdown(i)) ? i : FileDescriptor.inputShutdown(i);
            if (z2 && !FileDescriptor.isOutputShutdown(iInputShutdown)) {
                iInputShutdown = FileDescriptor.outputShutdown(iInputShutdown);
            }
            if (iInputShutdown == i) {
                return;
            }
        } while (!casState(i, iInputShutdown));
        int iShutdown = shutdown(this.fd, z, z2);
        if (iShutdown < 0) {
            Errors.ioResult("shutdown", iShutdown);
        }
    }

    public static int newSocketDgram0(boolean z) {
        int iNewSocketDgramFd = newSocketDgramFd(z);
        if (iNewSocketDgramFd >= 0) {
            return iNewSocketDgramFd;
        }
        throw new ChannelException(Errors.newIOException("newSocketDgram", iNewSocketDgramFd));
    }

    public static int newSocketStream0(boolean z) {
        int iNewSocketStreamFd = newSocketStreamFd(z);
        if (iNewSocketStreamFd >= 0) {
            return iNewSocketStreamFd;
        }
        throw new ChannelException(Errors.newIOException("newSocketStream", iNewSocketStreamFd));
    }
}
