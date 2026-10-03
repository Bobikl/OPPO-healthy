package com.lifesense.plugin.ble.device.ancs;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class b extends c {
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8738c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8739e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8740j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8741l;
    private int m;

    public b(byte[] bArr, boolean z) {
        this.a = bArr;
        if (z) {
            d(bArr);
        } else {
            e(bArr);
        }
    }

    public int a() {
        return this.f8738c;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.f8740j;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.f8741l;
    }

    public String i() {
        return com.lifesense.plugin.ble.c.a.d(this.a);
    }

    public boolean j() {
        int i = this.f8738c;
        return (i & 128) == 128 || (i & 144) == 144 || (i & 160) == 160 || (i & 176) == 176 || (i & 192) == 192;
    }

    public String toString() {
        return "AncsPacket{lenOfPacket=" + this.b + ", cmd=" + this.f8738c + ", titleCmd=" + this.d + ", titleLength=" + this.f8739e + ", contentCmd=" + this.f + ", contentLength=" + this.g + ", type=" + this.h + ", category=" + this.i + ", msgId=" + this.f8740j + ", msgStatus=" + this.k + ", controlCmd=" + this.f8741l + ", imageContent=" + this.m + '}';
    }

    private void d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            a(byteBufferOrder.get());
            this.b = b(byteBufferOrder.getShort());
            this.f8738c = a(byteBufferOrder.get());
            this.m = a(byteBufferOrder.get());
            this.k = a(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void e(byte[] bArr) {
        int iA;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            a(bArr[0]);
            int iA2 = a(bArr[1]);
            int iA3 = a(bArr[2]);
            if (iA3 == 1) {
                this.h = iA3;
                this.f8738c = iA3;
                this.i = a(bArr[3]);
                iA = a(bArr[4]);
            } else {
                if (iA3 == 160) {
                    this.h = iA3;
                    this.f8738c = iA3;
                    this.i = a(bArr[3]);
                    this.f8741l = a(bArr[4]);
                    return;
                }
                if (iA3 != 4) {
                    if (iA3 == 161) {
                        this.f8738c = 161;
                        this.h = a(bArr[3]);
                        byte[] bArr2 = new byte[4];
                        System.arraycopy(bArr, 4, bArr2, 0, 4);
                        this.f8740j = a(bArr2);
                        int length = bArr.length - 8;
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, 8, bArr3, 0, length);
                        int i = 0;
                        while (i < length) {
                            byte b = bArr3[i];
                            byte[] bArr4 = new byte[2];
                            System.arraycopy(bArr3, i + 1, bArr4, 0, 2);
                            int iB = b(bArr4);
                            i += 2;
                            if (b == 2) {
                                this.d = 2;
                                this.f8739e = iB;
                            } else if (b == 3) {
                                this.f = 3;
                                this.g = iB;
                            } else {
                                i = length;
                            }
                        }
                        return;
                    }
                    return;
                }
                this.h = iA3;
                this.f8738c = iA3;
                this.i = a(bArr[3]);
                if ((iA2 - 2) - 1 < 4) {
                    iA = a(bArr[4]);
                } else {
                    byte[] bArr5 = new byte[4];
                    System.arraycopy(bArr, 4, bArr5, 0, 4);
                    this.f8740j = a(bArr5);
                    iA = a(bArr[8]);
                }
            }
            this.k = iA;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
