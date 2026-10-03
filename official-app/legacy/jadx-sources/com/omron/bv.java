package com.omron;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.oplus.aiunit.vision.k18;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class bv extends bs {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f8853j = Pattern.compile("^[0-9A-Fa-f]{32}$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8854e;
    private String f;
    private int g;
    private int h;
    private int i;

    public bv(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
        f(bArr);
    }

    private int a(byte[] bArr) {
        return bArr[21] & 255;
    }

    private int b(byte[] bArr) {
        return bArr[20];
    }

    private int c(byte[] bArr) {
        return bArr[19] & 255;
    }

    private int e(byte[] bArr) {
        return bArr[2] & 255;
    }

    private void f(byte[] bArr) {
        if (bArr == null || bArr.length < 22) {
            throw new IllegalArgumentException("The byte sequence cannot be parsed as a ucode.");
        }
        this.f8854e = e(bArr);
        this.f = d(bArr);
        this.g = c(bArr);
        this.h = b(bArr);
        this.i = a(bArr);
    }

    public int d() {
        switch (this.g & 15) {
            case 0:
                return 10;
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 80;
            case 4:
                return 160;
            case 5:
                return 320;
            case 6:
                return GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
            case 7:
                return k18.GL_INVALID_ENUM;
            case 8:
                return 2560;
            case 9:
                return k18.GL_BYTE;
            default:
                return 10240;
        }
    }

    @Override // com.omron.bs, com.omron.by
    public String toString() {
        return String.format("ucode(Version=%d,Ucode=%s,Status=%d,BatteryLow=%s,Interval=%d,Power=%d,Count=%d)", Integer.valueOf(this.f8854e), this.f, Integer.valueOf(this.g), Boolean.valueOf(e()), Integer.valueOf(d()), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public static bv a(int i, int i2, byte[] bArr, int i3) {
        if (bArr == null || bArr.length < 22) {
            return null;
        }
        return new bv(i, i2, bArr, i3);
    }

    private String d(byte[] bArr) {
        return String.format("%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X", Integer.valueOf(bArr[18] & 255), Integer.valueOf(bArr[17] & 255), Integer.valueOf(bArr[16] & 255), Integer.valueOf(bArr[15] & 255), Integer.valueOf(bArr[14] & 255), Integer.valueOf(bArr[13] & 255), Integer.valueOf(bArr[12] & 255), Integer.valueOf(bArr[11] & 255), Integer.valueOf(bArr[10] & 255), Integer.valueOf(bArr[9] & 255), Integer.valueOf(bArr[8] & 255), Integer.valueOf(bArr[7] & 255), Integer.valueOf(bArr[6] & 255), Integer.valueOf(bArr[5] & 255), Integer.valueOf(bArr[4] & 255), Integer.valueOf(bArr[3] & 255));
    }

    public boolean e() {
        return (this.g & 32) != 0;
    }
}
