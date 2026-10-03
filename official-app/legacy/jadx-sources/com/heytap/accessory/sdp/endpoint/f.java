package com.heytap.accessory.sdp.endpoint;

import com.heytap.accessory.utils.buffer.Buffer;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public static final String a = "f";

    public static int a(int i) {
        if (i == 4) {
            return k18.GL_KEEP;
        }
        return 131072;
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
            return (buffer2[buffer.getOffset() + 2] & 255) | ((buffer2[buffer.getOffset() + 1] << 8) & 65535);
        }
        com.heytap.accessory.base.logging.a.b(a, "getMessageType: payload is null or exceeded max limit, len: " + length);
        return -1;
    }
}
