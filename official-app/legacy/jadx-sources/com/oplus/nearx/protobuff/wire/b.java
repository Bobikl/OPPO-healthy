package com.oplus.nearx.protobuff.wire;

import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public final BufferedSink a;

    public b(BufferedSink bufferedSink) {
        this.a = bufferedSink;
    }

    public static int a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long b(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static int c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long d(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int e(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int f(int i, FieldEncoding fieldEncoding) {
        return (i << 3) | fieldEncoding.value;
    }

    public static int g(int i) {
        return i(f(i, FieldEncoding.VARINT));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public static int h(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i3++;
            } else if (cCharAt < 2048) {
                i3 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i3 += 3;
            } else if (cCharAt > 56319 || (i = i2 + 1) >= length || str.charAt(i) < 56320 || str.charAt(i) > 57343) {
                i3++;
            } else {
                i3 += 4;
                i2 = i;
            }
            i2++;
        }
        return i3;
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public void k(ByteString byteString) throws IOException {
        this.a.write(byteString);
    }

    public void l(int i) throws IOException {
        this.a.writeIntLe(i);
    }

    public void m(long j2) throws IOException {
        this.a.writeLongLe(j2);
    }

    public void n(int i) throws IOException {
        if (i >= 0) {
            q(i);
        } else {
            r(i);
        }
    }

    public void o(String str) throws IOException {
        this.a.writeUtf8(str);
    }

    public void p(int i, FieldEncoding fieldEncoding) throws IOException {
        q(f(i, fieldEncoding));
    }

    public void q(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.a.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.a.writeByte(i);
    }

    public void r(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.a.writeByte((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.a.writeByte((int) j2);
    }
}
