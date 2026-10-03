package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class mvk {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14249c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14250e;
    public String f;
    public int g;
    public final int h;

    public mvk(int i, int i2, String str) {
        this(i, i2, str, 0);
    }

    public static mvk a() {
        return new mvk(256, 3, wxg.BINORMAL_ATTRIBUTE);
    }

    public static mvk b(int i) {
        return new mvk(64, 2, wxg.BONEWEIGHT_ATTRIBUTE + i, i);
    }

    public static mvk c() {
        return new mvk(4, 4, 5121, true, wxg.COLOR_ATTRIBUTE);
    }

    public static mvk d() {
        return new mvk(2, 4, k18.GL_FLOAT, false, wxg.COLOR_ATTRIBUTE);
    }

    public static mvk e() {
        return new mvk(8, 3, wxg.NORMAL_ATTRIBUTE);
    }

    public static mvk f() {
        return new mvk(1, 3, wxg.POSITION_ATTRIBUTE);
    }

    public static mvk g() {
        return new mvk(128, 3, wxg.TANGENT_ATTRIBUTE);
    }

    public static mvk h(int i) {
        return new mvk(16, 2, wxg.TEXCOORD_ATTRIBUTE + i, i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof mvk) {
            return i((mvk) obj);
        }
        return false;
    }

    public int hashCode() {
        return (((j() * 541) + this.b) * 541) + this.f.hashCode();
    }

    public boolean i(mvk mvkVar) {
        return mvkVar != null && this.a == mvkVar.a && this.b == mvkVar.b && this.d == mvkVar.d && this.f14249c == mvkVar.f14249c && this.f.equals(mvkVar.f) && this.g == mvkVar.g;
    }

    public int j() {
        return (this.h << 8) + (this.g & 255);
    }

    public int k() {
        int i = this.d;
        if (i == 5126 || i == 5132) {
            return this.b * 4;
        }
        switch (i) {
            case k18.GL_BYTE /* 5120 */:
            case 5121:
                return this.b;
            case 5122:
            case 5123:
                return this.b * 2;
            default:
                return 0;
        }
    }

    public mvk(int i, int i2, String str, int i3) {
        this(i, i2, i == 4 ? 5121 : k18.GL_FLOAT, i == 4, str, i3);
    }

    public mvk(int i, int i2, int i3, boolean z, String str) {
        this(i, i2, i3, z, str, 0);
    }

    public mvk(int i, int i2, int i3, boolean z, String str, int i4) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.f14249c = z;
        this.f = str;
        this.g = i4;
        this.h = Integer.numberOfTrailingZeros(i);
    }
}
