package com.oppo.bluetooth.btnet.bluetoothproxyserver.utils;

import com.lifesense.android.bluetooth.core.bean.NetstrapPacket;
import com.oplus.aiunit.vision.c3f;
import com.oplus.aiunit.vision.ij9;

/* JADX INFO: loaded from: classes9.dex */
public class HttpDataFactory {
    public static final short BTNET_FLUSH_ACK_MSG = 1556;
    public static final int DEF_LENGTH = 10240;
    public static final short DNS_DATA = 1545;
    public static final byte DNS_G_ONLY = 0;
    public static final short DNS_REQ = 1540;
    public static final short DNS_RES = 1541;
    public static final short HTTP_ACK_REQ = 1553;
    public static final short HTTP_ACK_RSP = 1554;
    public static final short HTTP_DATA = 1539;
    public static final byte[] HTTP_DATA_EOT = {4};
    public static final byte HTTP_G_CONTINUE = 2;
    public static final byte HTTP_G_END = 3;
    public static final byte HTTP_G_FIRST = 1;
    public static final byte HTTP_G_INTERRUPT = 4;
    public static final byte HTTP_G_ONLY = 0;
    public static final byte HTTP_G_PHONE_FLUSH_GATE = 9;
    public static final byte HTTP_G_SOCKET_PAUSE = 5;
    public static final byte HTTP_G_SOCKET_PAUSE_ACK = 7;
    public static final byte HTTP_G_SOCKET_RESUME = 6;
    public static final byte HTTP_G_SOCKET_RESUME_ACK = 8;
    public static final short HTTP_REQ = 1537;
    public static final short HTTP_RES = 1538;
    public static final short NO_MORE_DATA = 1536;
    public static final short SOCKET = 1544;
    public static final short TCPIP_DATA = 1542;
    public static final short TLS = 1543;
    public static final byte TLS_G_ONLY = 0;

    public enum DataGroup {
        HTTP_G_ONLY,
        HTTP_G_FIRST,
        HTTP_G_CONTINUE,
        HTTP_G_END
    }

    public enum DataType {
        HTTP_REQ,
        HTTP_RES,
        HTTP_DATA
    }

    public static ij9 a(long j2, byte b, byte[] bArr) {
        return new ij9(HTTP_DATA, j2, b, bArr.length, bArr);
    }

    public static ij9 b(short s, long j2, byte b, int i, byte[] bArr) {
        if (bArr == null) {
            c3f.b("HttpDataFactory", "data is null, not create HttpData instance");
            return null;
        }
        if (i != bArr.length) {
            c3f.b("HttpDataFactory", "length not equal to data's length,  not create HttpData instance");
            return null;
        }
        if (s != 1553 && s != 1554 && s != 1556) {
            switch (s) {
                case 1536:
                case NetstrapPacket.PDU_TYPE_WRITE_BLE_MAC_REQ /* 1540 */:
                case NetstrapPacket.PDU_TYPE_READ_BLE_MAC_REQ /* 1541 */:
                    break;
                case 1537:
                    return new ij9(HTTP_REQ, j2, (byte) 0, i, bArr);
                case NetstrapPacket.PDU_TYPE_WRITE_WIFI_MAC_REQ /* 1538 */:
                    return new ij9(HTTP_RES, j2, (byte) 0, i, bArr);
                case NetstrapPacket.PDU_TYPE_READ_WIFI_MAC_REQ /* 1539 */:
                    return new ij9(HTTP_DATA, j2, b, i, bArr);
                default:
                    switch (s) {
                        case NetstrapPacket.PDU_TYPE_WRITE_MAC_SOURCE_REQ /* 1543 */:
                        case NetstrapPacket.PDU_TYPE_READ_MAC_SOURCE_REQ /* 1544 */:
                        case 1545:
                            break;
                        default:
                            c3f.b("HttpDataFactory", "data type is error:" + ((int) s));
                            return null;
                    }
                    break;
            }
        }
        return new ij9(s, j2, b, i, bArr);
    }
}
