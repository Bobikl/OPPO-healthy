package com.heytap.accessory.message;

import com.heytap.accessory.utils.buffer.Buffer;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d {
    public static final String c = "d";
    public a a;
    public int b = 0;

    public d(a aVar) {
        this.a = aVar;
    }

    public final void a(String str, String str2) {
    }

    public int b(int i, String str) throws c {
        if (this.b + i > this.a.g()) {
            throw new c(str);
        }
        int iD = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            iD |= (this.a.d(this.b) & 255) << (i2 * 8);
            this.b++;
        }
        a(c, "readInt: " + iD + " length: " + i + " descLog:" + str);
        return iD;
    }

    public long c(int i, String str) throws c {
        if (this.b + i > this.a.g()) {
            throw new c(str);
        }
        long jD = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            jD |= (((long) this.a.d(this.b)) & 255) << (i2 * 8);
            this.b++;
        }
        a(c, "readInt: " + jD + " length: " + i + " descLog:" + str);
        return jD;
    }

    public String d(int i, String str) throws c {
        if (this.b + i > this.a.g()) {
            com.heytap.accessory.base.logging.a.e(c, "PayloadLength = " + this.a.g() + "offset = " + this.b + "readLength = " + i);
            throw new c(str);
        }
        String strA = this.a.a(this.b, i);
        this.b += i;
        a(c, "readStringByLength: " + strA + " length: " + i + " descLog:" + str);
        return strA;
    }

    public static d a(int i, Buffer buffer, int i2) {
        return new d(a.b(i, buffer, i2));
    }

    public byte a(String str) throws c {
        if (this.b + 1 <= this.a.g()) {
            byte bD = this.a.d(this.b);
            this.b++;
            a(c, "readByte: " + ((int) bD) + " length: 1 descLog:" + str);
            return bD;
        }
        throw new c(str);
    }

    public String b(byte b, String str) {
        int i = this.b;
        while (i < this.a.g() && this.a.d(i) != b) {
            i++;
        }
        int i2 = this.b;
        int i3 = i - i2;
        if (i3 <= 0 && this.a.d(i2) == b) {
            this.b++;
        }
        String strA = this.a.a(this.b, i3);
        this.b = i + 1;
        a(c, "readStringBySymbol: " + strA + " length: " + i3 + " descLog:" + str);
        return strA;
    }

    public byte[] a(byte b, String str) throws c {
        int i = this.b;
        while (i < this.a.g() && this.a.d(i) != b) {
            i++;
        }
        int i2 = this.b;
        int i3 = i - i2;
        if (i3 > 0) {
            byte[] bArr = new byte[i3];
            this.a.a(i2, bArr, 0, i3);
            this.b = i + 1;
            a(c, "readStringBySymbol: " + Arrays.toString(bArr) + " length: " + i3 + " descLog:" + str);
            return bArr;
        }
        throw new c(str);
    }

    public byte[] a(int i, String str) throws c {
        if (this.b + i <= this.a.g()) {
            byte[] bArr = new byte[i];
            this.a.a(this.b, bArr, 0, i);
            this.b += i;
            a(c, "readStringByLength: " + Arrays.toString(bArr) + " length: " + i + " descLog:" + str);
            return bArr;
        }
        com.heytap.accessory.base.logging.a.e(c, "PayloadLength = " + this.a.g() + "offset = " + this.b + "readLength = " + i);
        throw new c(str);
    }

    public boolean a(byte b) {
        return this.b + 1 <= this.a.g() && this.a.d(this.b) == b;
    }

    public int a() {
        return this.b;
    }
}
