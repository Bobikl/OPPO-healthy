package com.heytap.accessory.sdp.endpoint;

import com.heytap.accessory.pair.connectivity.bt.BtRfConnection;
import com.heytap.accessory.utils.buffer.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class f {
    public static final String a = "f";

    public static int a(int i) {
        return i == 4 ? 7680 : 131072;
    }

    public static int b(int i) {
        return i == 4 ? 235 : 65525;
    }

    public static byte c(Buffer buffer) {
        byte[] buffer2 = buffer.getBuffer();
        int length = buffer.getLength();
        if (buffer2 != null && length >= 4 && length <= 1024) {
            return buffer2[(buffer.getOffset() + 4) - 1];
        }
        com.heytap.accessory.base.logging.a.b(a, "getStatusCode: payload is null or exceeded max limit, len: " + length);
        return (byte) -1;
    }

    public static byte a(Buffer buffer) {
        byte[] buffer2 = buffer.getBuffer();
        int length = buffer.getLength();
        if (buffer2 != null && length >= 1 && length <= 1024) {
            return buffer2[buffer.getOffset()];
        }
        com.heytap.accessory.base.logging.a.b(a, "getMessageType: payload is null or exceeded max limit, len: " + length);
        return (byte) -1;
    }

    public static int b(Buffer buffer) {
        byte[] buffer2 = buffer.getBuffer();
        int length = buffer.getLength();
        if (buffer2 != null && length >= 3 && length <= 1024) {
            return (buffer2[buffer.getOffset() + 2] & 255) | ((buffer2[buffer.getOffset() + 1] << 8) & BtRfConnection.MAXIMUM_PAYLOAD_SIZE_IN_BYTES);
        }
        com.heytap.accessory.base.logging.a.b(a, "getMessageType: payload is null or exceeded max limit, len: " + length);
        return -1;
    }
}
