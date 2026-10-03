package com.heytap.accessory.message;

import com.heytap.accessory.utils.buffer.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    public static final String c = "e";
    public a a;
    public int b;

    public e(a aVar) {
        this(aVar, 0);
    }

    public final void a(String str, String str2) {
    }

    public void b() {
        this.a.f().recycle();
    }

    public e(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    public static e a(long j, long j2, int i) {
        return new e(a.c(j, j2, i));
    }

    public static e a(int i) {
        return new e(a.b(i));
    }

    public void a(byte b) throws c {
        if (this.b + 1 <= this.a.g()) {
            a(c, "write byte: " + ((int) b) + " length: 1");
            this.a.a(this.b, b);
            this.b = this.b + 1;
            return;
        }
        throw new c("writeByte");
    }

    public void a(int i, int i2) throws c {
        a(i, i2);
    }

    public void a(long j, int i) throws c {
        if (this.b + i <= this.a.g()) {
            a(c, "testwrite Int: " + j + " length: " + i);
            for (int i2 = i + (-1); i2 >= 0; i2--) {
                this.a.a(this.b, (byte) ((j >> (i2 * 8)) & ((long) 255)));
                this.b++;
            }
            return;
        }
        throw new c("writeInt");
    }

    public void a(String str, int i) throws c {
        if (this.b + i <= this.a.g()) {
            a(c, "write string: " + str + " length: " + i);
            a(str.getBytes(com.heytap.accessory.sdp.service.protocol.a.a), i);
            return;
        }
        throw new c("writeString");
    }

    public void a(String str) throws c {
        a(str, str.length());
    }

    public void a(byte[] bArr, int i) {
        this.a.a(bArr, 0, this.b, i);
        this.b += i;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(Buffer buffer) {
        this.a.a(buffer.getBuffer(), buffer.getOffset(), this.b, buffer.getPayloadLength());
        this.b += buffer.getPayloadLength();
    }

    public a a() {
        return this.a;
    }
}
