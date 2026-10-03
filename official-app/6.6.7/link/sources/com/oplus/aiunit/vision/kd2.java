package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class kd2 {
    public byte[] a;
    public int b;

    public kd2(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.a = new byte[i];
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            return;
        }
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.b + i2;
        if (i4 > this.a.length) {
            e(i4);
        }
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b = i4;
    }

    public byte[] b() {
        return this.a;
    }

    public int c() {
        return this.a.length;
    }

    public void d() {
        this.b = 0;
    }

    public final void e(int i) {
        byte[] bArr = new byte[Math.max(this.a.length << 1, i)];
        System.arraycopy(this.a, 0, bArr, 0, this.b);
        this.a = bArr;
    }

    public int f() {
        return this.b;
    }

    public byte[] g() {
        int i = this.b;
        byte[] bArr = new byte[i];
        if (i > 0) {
            System.arraycopy(this.a, 0, bArr, 0, i);
        }
        return bArr;
    }
}
