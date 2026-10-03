package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Packet implements Serializable {
    private static final int FIRST_TCP_DATA = 40;
    public static final int IP4_HEADER_SIZE = 20;
    private static final String TAG = "Packet";
    public static final int TCP_HEADER_SIZE = 20;
    public static final int UDP_HEADER_SIZE = 8;
    public ByteBuffer backingBuffer;
    boolean cancelSending;
    private String hostName;
    public IP4Header ip4Header;
    private boolean isHttp;
    public boolean isICMP;
    private boolean isSSL;
    public boolean isTCP;
    public boolean isUDP;
    public ICMPHeader mICMPHeader;
    public int playLoadSize;
    boolean releaseAfterWritingToDevice;
    private String requestUrl;
    public TCPHeader tcpHeader;
    public UDPHeader udpHeader;
    private String urlPath;

    public static class IP4Header implements Serializable {
        byte IHL;
        short TTL;
        public InetAddress destinationAddress;
        int headerChecksum;
        int headerLength;
        int identificationAndFlagsAndFragmentOffset;
        int optionsAndPadding;
        TransportProtocol protocol;
        private short protocolNum;
        public InetAddress sourceAddress;
        int totalLength;
        short typeOfService;
        public byte version;

        public enum TransportProtocol {
            TCP(6),
            UDP(17),
            ICMP(1),
            Other(255);

            private int protocolNumber;

            TransportProtocol(int i) {
                this.protocolNumber = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static TransportProtocol numberToEnum(int i) {
                if (i == 6) {
                    return TCP;
                }
                if (i == 17) {
                    return UDP;
                }
                return i == 1 ? ICMP : Other;
            }

            public int getNumber() {
                return this.protocolNumber;
            }
        }

        public IP4Header duplicate() {
            IP4Header iP4Header = new IP4Header();
            iP4Header.version = this.version;
            iP4Header.IHL = this.IHL;
            iP4Header.headerLength = this.headerLength;
            iP4Header.typeOfService = this.typeOfService;
            iP4Header.totalLength = this.totalLength;
            iP4Header.identificationAndFlagsAndFragmentOffset = this.identificationAndFlagsAndFragmentOffset;
            iP4Header.TTL = this.TTL;
            iP4Header.protocolNum = this.protocolNum;
            iP4Header.protocol = this.protocol;
            iP4Header.headerChecksum = this.headerChecksum;
            iP4Header.sourceAddress = this.sourceAddress;
            iP4Header.destinationAddress = this.destinationAddress;
            iP4Header.optionsAndPadding = this.optionsAndPadding;
            return iP4Header;
        }

        public void fillHeader(ByteBuffer byteBuffer) {
            byteBuffer.put((byte) ((this.version << 4) | this.IHL));
            byteBuffer.put((byte) this.typeOfService);
            byteBuffer.putShort((short) this.totalLength);
            byteBuffer.putInt(this.identificationAndFlagsAndFragmentOffset);
            byteBuffer.put((byte) this.TTL);
            byteBuffer.put((byte) this.protocol.getNumber());
            byteBuffer.putShort((short) this.headerChecksum);
            byteBuffer.put(this.sourceAddress.getAddress());
            byteBuffer.put(this.destinationAddress.getAddress());
        }

        public String toString() {
            return "IP4Header{version=" + ((int) this.version) + ", IHL=" + ((int) this.IHL) + ", typeOfService=" + ((int) this.typeOfService) + ", totalLength=" + this.totalLength + ", identificationAndFlagsAndFragmentOffset=" + this.identificationAndFlagsAndFragmentOffset + ", TTL=" + ((int) this.TTL) + ", protocol=" + ((int) this.protocolNum) + ":" + this.protocol + ", headerChecksum=" + this.headerChecksum + ", sourceAddress=" + this.sourceAddress.getHostAddress() + ", destinationAddress=" + this.destinationAddress.getHostAddress() + '}';
        }

        private IP4Header() {
        }

        private IP4Header(ByteBuffer byteBuffer) throws UnknownHostException {
            byte b = byteBuffer.get();
            this.version = (byte) (b >> 4);
            byte b2 = (byte) (b & 15);
            this.IHL = b2;
            this.headerLength = b2 << 2;
            this.typeOfService = a.d(byteBuffer.get());
            this.totalLength = a.f(byteBuffer.getShort());
            this.identificationAndFlagsAndFragmentOffset = byteBuffer.getInt();
            this.TTL = a.d(byteBuffer.get());
            short sD = a.d(byteBuffer.get());
            this.protocolNum = sD;
            this.protocol = TransportProtocol.numberToEnum(sD);
            this.headerChecksum = a.f(byteBuffer.getShort());
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr, 0, 4);
            this.sourceAddress = InetAddress.getByAddress(bArr);
            byteBuffer.get(bArr, 0, 4);
            this.destinationAddress = InetAddress.getByAddress(bArr);
        }
    }

    public static class TCPHeader implements Serializable {
        public static final int ACK = 16;
        public static final int FIN = 1;
        public static final int PSH = 8;
        public static final int RST = 4;
        public static final int SYN = 2;
        public static final int URG = 32;
        public long acknowledgementNumber;
        int checksum;
        public byte dataOffsetAndReserved;
        public int destinationPort;
        public byte flags;
        public int headerLength;
        byte[] optionsAndPadding;
        public long sequenceNumber;
        public int sourcePort;
        int urgentPointer;
        public int window;

        public TCPHeader duplicate() {
            TCPHeader tCPHeader = new TCPHeader();
            tCPHeader.sourcePort = this.sourcePort;
            tCPHeader.destinationPort = this.destinationPort;
            tCPHeader.sequenceNumber = this.sequenceNumber;
            tCPHeader.acknowledgementNumber = this.acknowledgementNumber;
            tCPHeader.dataOffsetAndReserved = this.dataOffsetAndReserved;
            tCPHeader.headerLength = this.headerLength;
            tCPHeader.flags = this.flags;
            tCPHeader.window = this.window;
            tCPHeader.checksum = this.checksum;
            tCPHeader.urgentPointer = this.urgentPointer;
            tCPHeader.optionsAndPadding = this.optionsAndPadding;
            return tCPHeader;
        }

        public void fillHeader(ByteBuffer byteBuffer) {
            byteBuffer.putShort((short) this.sourcePort);
            byteBuffer.putShort((short) this.destinationPort);
            byteBuffer.putInt((int) this.sequenceNumber);
            byteBuffer.putInt((int) this.acknowledgementNumber);
            byteBuffer.put(this.dataOffsetAndReserved);
            byteBuffer.put(this.flags);
            byteBuffer.putShort((short) this.window);
            byteBuffer.putShort((short) this.checksum);
            byteBuffer.putShort((short) this.urgentPointer);
        }

        public int getWindow() {
            return this.window;
        }

        public boolean isACK() {
            return (this.flags & 16) == 16;
        }

        public boolean isFIN() {
            return (this.flags & 1) == 1;
        }

        public boolean isPSH() {
            return (this.flags & 8) == 8;
        }

        public boolean isRST() {
            return (this.flags & 4) == 4;
        }

        public boolean isSYN() {
            return (this.flags & 2) == 2;
        }

        public boolean isURG() {
            return (this.flags & 32) == 32;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TCPHeader{");
            sb.append("sourcePort=");
            sb.append(this.sourcePort);
            sb.append(", destinationPort=");
            sb.append(this.destinationPort);
            sb.append(", sequenceNumber=");
            sb.append(this.sequenceNumber);
            sb.append(", acknowledgementNumber=");
            sb.append(this.acknowledgementNumber);
            sb.append(", headerLength=");
            sb.append(this.headerLength);
            sb.append(", clientWindow=");
            sb.append(this.window);
            sb.append(", checksum=");
            sb.append(this.checksum);
            sb.append(", flags=");
            if (isFIN()) {
                sb.append(" FIN");
            }
            if (isSYN()) {
                sb.append(" SYN");
            }
            if (isRST()) {
                sb.append(" RST");
            }
            if (isPSH()) {
                sb.append(" PSH");
            }
            if (isACK()) {
                sb.append(" ACK");
            }
            if (isURG()) {
                sb.append(" URG");
            }
            sb.append('}');
            return sb.toString();
        }

        private TCPHeader(ByteBuffer byteBuffer) {
            this.sourcePort = a.f(byteBuffer.getShort());
            this.destinationPort = a.f(byteBuffer.getShort());
            this.sequenceNumber = a.e(byteBuffer.getInt());
            this.acknowledgementNumber = a.e(byteBuffer.getInt());
            byte b = byteBuffer.get();
            this.dataOffsetAndReserved = b;
            this.headerLength = (b & 240) >> 2;
            this.flags = byteBuffer.get();
            this.window = a.f(byteBuffer.getShort());
            this.checksum = a.f(byteBuffer.getShort());
            this.urgentPointer = a.f(byteBuffer.getShort());
            int i = this.headerLength - 20;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.optionsAndPadding = bArr;
                byteBuffer.get(bArr, 0, i);
            }
        }

        public TCPHeader() {
        }
    }

    public static class a {
        public static short d(byte b) {
            return (short) (b & 255);
        }

        public static long e(int i) {
            return ((long) i) & 4294967295L;
        }

        public static int f(short s) {
            return s & 65535;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Packet(ByteBuffer byteBuffer) throws UnknownHostException {
        this.releaseAfterWritingToDevice = true;
        this.cancelSending = false;
        this.playLoadSize = 0;
        Object[] objArr = 0;
        IP4Header iP4Header = new IP4Header(byteBuffer);
        this.ip4Header = iP4Header;
        IP4Header.TransportProtocol transportProtocol = iP4Header.protocol;
        if (transportProtocol == IP4Header.TransportProtocol.TCP) {
            this.tcpHeader = new TCPHeader(byteBuffer);
            this.isTCP = true;
        } else if (transportProtocol == IP4Header.TransportProtocol.UDP) {
            this.udpHeader = new UDPHeader(byteBuffer);
            this.isUDP = true;
        } else if (transportProtocol == IP4Header.TransportProtocol.ICMP) {
            this.mICMPHeader = new ICMPHeader(byteBuffer);
            this.isICMP = true;
        }
        this.backingBuffer = byteBuffer;
        this.playLoadSize = byteBuffer.limit() - byteBuffer.position();
    }

    public static int checksum(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            int i4 = i2 + ((bArr[i3] & 255) << 8);
            i2 = (i4 >> 16) + (65535 & i4);
        }
        for (int i5 = 1; i5 < i; i5 += 2) {
            int i6 = i2 + (bArr[i5] & 255);
            i2 = (i6 >> 16) + (i6 & 65535);
        }
        return ((i2 & 65535) + (i2 >> 16)) ^ 65535;
    }

    private void fillHeader(ByteBuffer byteBuffer) {
        this.ip4Header.fillHeader(byteBuffer);
        if (this.isUDP) {
            this.udpHeader.fillHeader(byteBuffer);
        } else if (this.isTCP) {
            this.tcpHeader.fillHeader(byteBuffer);
        }
    }

    private void updateIP4Checksum() {
        ByteBuffer byteBufferDuplicate = this.backingBuffer.duplicate();
        int iF = 0;
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.putShort(10, (short) 0);
        for (int i = this.ip4Header.headerLength; i > 0; i -= 2) {
            iF += a.f(byteBufferDuplicate.getShort());
        }
        while (true) {
            int i2 = iF >> 16;
            if (i2 <= 0) {
                int i3 = ~iF;
                this.ip4Header.headerChecksum = i3;
                this.backingBuffer.putShort(10, (short) i3);
                return;
            }
            iF = (iF & 65535) + i2;
        }
    }

    public Packet duplicated() {
        Packet packet = new Packet();
        packet.ip4Header = this.ip4Header.duplicate();
        TCPHeader tCPHeader = this.tcpHeader;
        if (tCPHeader != null) {
            packet.tcpHeader = tCPHeader.duplicate();
        }
        UDPHeader uDPHeader = this.udpHeader;
        if (uDPHeader != null) {
            packet.udpHeader = uDPHeader.duplicate();
        }
        ICMPHeader iCMPHeader = this.mICMPHeader;
        if (iCMPHeader != null) {
            packet.mICMPHeader = iCMPHeader.duplicate();
        }
        packet.isTCP = this.isTCP;
        packet.isUDP = this.isUDP;
        packet.isICMP = this.isICMP;
        return packet;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Packet)) {
            return false;
        }
        Packet packet = (Packet) obj;
        return packet.getIpAndPort().equals(getIpAndPort()) && packet.isUDP && packet.getUdpHeader().sourcePort == getUdpHeader().sourcePort;
    }

    public ByteBuffer getBackingBuffer() {
        return this.backingBuffer;
    }

    public String getHostName() {
        return this.hostName;
    }

    public IP4Header getIp4Header() {
        return this.ip4Header;
    }

    public String getIpAndPort() {
        IP4Header iP4Header = this.ip4Header;
        if (iP4Header == null) {
            return null;
        }
        InetAddress inetAddress = iP4Header.destinationAddress;
        if (this.isUDP) {
            UDPHeader uDPHeader = this.udpHeader;
            return "UDP:" + inetAddress.getHostAddress() + ":" + uDPHeader.destinationPort + " " + uDPHeader.sourcePort;
        }
        TCPHeader tCPHeader = this.tcpHeader;
        return "TCP:" + inetAddress.getHostAddress() + ":" + tCPHeader.destinationPort + " " + tCPHeader.sourcePort;
    }

    public int getPlayLoadSize() {
        return this.playLoadSize;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public TCPHeader getTcpHeader() {
        return this.tcpHeader;
    }

    public UDPHeader getUdpHeader() {
        return this.udpHeader;
    }

    public String getUrlPath() {
        return this.urlPath;
    }

    public int hashCode() {
        return this.isUDP ? getUdpHeader().sourcePort : getTcpHeader().sourcePort;
    }

    public boolean isCancelSending() {
        return this.cancelSending;
    }

    public boolean isHttp() {
        return this.isHttp;
    }

    public boolean isReleaseAfterWritingToDevice() {
        return this.releaseAfterWritingToDevice;
    }

    public boolean isSSL() {
        return this.isSSL;
    }

    public boolean isTCP() {
        return this.isTCP;
    }

    public boolean isUDP() {
        return this.isUDP;
    }

    public void swapSourceAndDestination() {
        IP4Header iP4Header = this.ip4Header;
        InetAddress inetAddress = iP4Header.destinationAddress;
        iP4Header.destinationAddress = iP4Header.sourceAddress;
        iP4Header.sourceAddress = inetAddress;
        if (this.isUDP) {
            UDPHeader uDPHeader = this.udpHeader;
            int i = uDPHeader.destinationPort;
            uDPHeader.destinationPort = uDPHeader.sourcePort;
            uDPHeader.sourcePort = i;
            return;
        }
        if (this.isTCP) {
            TCPHeader tCPHeader = this.tcpHeader;
            int i2 = tCPHeader.destinationPort;
            tCPHeader.destinationPort = tCPHeader.sourcePort;
            tCPHeader.sourcePort = i2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Packet{");
        sb.append("ip4Header=");
        sb.append(this.ip4Header);
        if (this.isTCP) {
            sb.append(", tcpHeader=");
            sb.append(this.tcpHeader);
        } else if (this.isUDP) {
            sb.append(", udpHeader=");
            sb.append(this.udpHeader);
        } else if (this.isICMP) {
            sb.append(", icmpHeader=");
            sb.append(this.mICMPHeader);
        }
        sb.append(", payloadSize=");
        sb.append(this.backingBuffer.limit() - this.backingBuffer.position());
        sb.append('}');
        return sb.toString();
    }

    public void updateICMPBuffer(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        this.ip4Header.totalLength = i + 20;
        fillHeader(byteBuffer);
        ICMPHeader iCMPHeader = this.mICMPHeader;
        if (iCMPHeader != null) {
            iCMPHeader.updateHeader(byteBuffer);
        }
        this.backingBuffer = byteBuffer;
        updateIP4Checksum();
    }

    public void updateUDPBuffer(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(0);
        fillHeader(byteBuffer);
        this.backingBuffer = byteBuffer;
        int i2 = i + 8;
        byteBuffer.putShort(24, (short) i2);
        this.udpHeader.length = i2;
        this.backingBuffer.putShort(26, (short) 0);
        this.udpHeader.checksum = 0;
        int i3 = i2 + 20;
        this.backingBuffer.putShort(2, (short) i3);
        this.ip4Header.totalLength = i3;
        updateIP4Checksum();
        this.playLoadSize = i;
    }

    public static class UDPHeader implements Serializable {
        public int checksum;
        public int destinationPort;
        public int length;
        public int sourcePort;

        public UDPHeader(ByteBuffer byteBuffer) {
            this.sourcePort = a.f(byteBuffer.getShort());
            this.destinationPort = a.f(byteBuffer.getShort());
            this.length = a.f(byteBuffer.getShort());
            this.checksum = a.f(byteBuffer.getShort());
        }

        public UDPHeader duplicate() {
            UDPHeader uDPHeader = new UDPHeader();
            uDPHeader.sourcePort = this.sourcePort;
            uDPHeader.destinationPort = this.destinationPort;
            uDPHeader.length = this.length;
            uDPHeader.checksum = this.checksum;
            return uDPHeader;
        }

        public void fillHeader(ByteBuffer byteBuffer) {
            byteBuffer.putShort((short) this.sourcePort);
            byteBuffer.putShort((short) this.destinationPort);
            byteBuffer.putShort((short) this.length);
            byteBuffer.putShort((short) this.checksum);
        }

        public String toString() {
            return "UDPHeader{sourcePort=" + this.sourcePort + ", destinationPort=" + this.destinationPort + ", playoffSize=" + this.length + ", checksum=" + this.checksum + '}';
        }

        public UDPHeader() {
        }
    }

    public static class ICMPHeader implements Serializable {
        public static final int ECHO_REPLY = 0;
        public static final int ECHO_REQUEST = 8;
        public int checksum;
        public byte code;
        public long quench;
        public long seq;
        public byte type;

        public ICMPHeader(ByteBuffer byteBuffer) {
            this.type = byteBuffer.get();
            this.code = byteBuffer.get();
            this.checksum = a.f(byteBuffer.getShort());
            this.quench = a.e(byteBuffer.getInt());
            this.seq = a.d(byteBuffer.get());
        }

        public ICMPHeader duplicate() {
            ICMPHeader iCMPHeader = new ICMPHeader();
            iCMPHeader.type = this.type;
            iCMPHeader.code = this.code;
            iCMPHeader.checksum = this.checksum;
            iCMPHeader.quench = this.quench;
            return iCMPHeader;
        }

        public void fillHeader(ByteBuffer byteBuffer) {
            byteBuffer.put(this.type);
            byteBuffer.put(this.code);
            byteBuffer.putShort((short) this.checksum);
            byteBuffer.putInt((int) this.quench);
        }

        public String toString() {
            return "ICMPHeader{type=" + ((int) this.type) + ", code=" + ((int) this.code) + ", checksum=" + this.checksum + ", quench=" + this.quench + ", seq=" + this.seq + '}';
        }

        public void updateHeader(ByteBuffer byteBuffer) {
            this.type = byteBuffer.get();
            this.code = byteBuffer.get();
            this.checksum = a.f(byteBuffer.getShort());
            this.quench = a.e(byteBuffer.getInt());
        }

        public ICMPHeader() {
        }
    }

    private Packet() {
        this.releaseAfterWritingToDevice = true;
        this.cancelSending = false;
        this.playLoadSize = 0;
    }
}
