package com.oppo.bluetooth.btnet.bluetoothproxyserver.utils;

import com.oplus.aiunit.vision.o5f;
import com.oplus.aiunit.vision.ok9;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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

    public static ok9 a(long j, byte b, byte[] bArr) {
        return new ok9(HTTP_DATA, j, b, bArr.length, bArr);
    }

    public static ok9 b(short s, long j, byte b, int i, byte[] bArr) {
        if (bArr == null) {
            o5f.b("HttpDataFactory", "data is null, not create HttpData instance");
            return null;
        }
        if (i != bArr.length) {
            o5f.b("HttpDataFactory", "length not equal to data's length,  not create HttpData instance");
            return null;
        }
        if (s != 1553 && s != 1554 && s != 1556) {
            switch (s) {
                case 1536:
                case 1540:
                case 1541:
                    break;
                case 1537:
                    return new ok9(HTTP_REQ, j, (byte) 0, i, bArr);
                case 1538:
                    return new ok9(HTTP_RES, j, (byte) 0, i, bArr);
                case 1539:
                    return new ok9(HTTP_DATA, j, b, i, bArr);
                default:
                    switch (s) {
                        case 1543:
                        case 1544:
                        case 1545:
                            break;
                        default:
                            o5f.b("HttpDataFactory", "data type is error:" + ((int) s));
                            return null;
                    }
                    break;
            }
        }
        return new ok9(s, j, b, i, bArr);
    }
}
