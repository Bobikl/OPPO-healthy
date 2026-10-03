package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes13.dex */
public class psc {
    public static final int BOTTOM_CENTER = 7;
    public static final int BOTTOM_LEFT = 6;
    public static final int BOTTOM_RIGHT = 8;
    public static final int MIDDLE_CENTER = 4;
    public static final int MIDDLE_LEFT = 3;
    public static final int MIDDLE_RIGHT = 5;
    public static final int TOP_CENTER = 1;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 2;
    public static final mk3 x = new mk3();
    public Texture a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15462c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15463e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15464j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15465l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15466n;
    public float o;
    public float p;
    public float[] q;
    public int r;
    public final mk3 s;
    public float t;
    public float u;
    public float v;
    public float w;

    public psc(xtj xtjVar, int i, int i2, int i3, int i4) {
        this.q = new float[180];
        this.s = new mk3(mk3.WHITE);
        this.t = -1.0f;
        this.u = -1.0f;
        this.v = -1.0f;
        this.w = -1.0f;
        if (xtjVar == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int iC = (xtjVar.c() - i) - i2;
        int iB = (xtjVar.b() - i3) - i4;
        xtj[] xtjVarArr = new xtj[9];
        if (i3 > 0) {
            if (i > 0) {
                xtjVarArr[0] = new xtj(xtjVar, 0, 0, i, i3);
            }
            if (iC > 0) {
                xtjVarArr[1] = new xtj(xtjVar, i, 0, iC, i3);
            }
            if (i2 > 0) {
                xtjVarArr[2] = new xtj(xtjVar, i + iC, 0, i2, i3);
            }
        }
        if (iB > 0) {
            if (i > 0) {
                xtjVarArr[3] = new xtj(xtjVar, 0, i3, i, iB);
            }
            if (iC > 0) {
                xtjVarArr[4] = new xtj(xtjVar, i, i3, iC, iB);
            }
            if (i2 > 0) {
                xtjVarArr[5] = new xtj(xtjVar, i + iC, i3, i2, iB);
            }
        }
        if (i4 > 0) {
            if (i > 0) {
                xtjVarArr[6] = new xtj(xtjVar, 0, i3 + iB, i, i4);
            }
            if (iC > 0) {
                xtjVarArr[7] = new xtj(xtjVar, i, i3 + iB, iC, i4);
            }
            if (i2 > 0) {
                xtjVarArr[8] = new xtj(xtjVar, i + iC, i3 + iB, i2, i4);
            }
        }
        if (i == 0 && iC == 0) {
            xtjVarArr[1] = xtjVarArr[2];
            xtjVarArr[4] = xtjVarArr[5];
            xtjVarArr[7] = xtjVarArr[8];
            xtjVarArr[2] = null;
            xtjVarArr[5] = null;
            xtjVarArr[8] = null;
        }
        if (i3 == 0 && iB == 0) {
            xtjVarArr[3] = xtjVarArr[6];
            xtjVarArr[4] = xtjVarArr[7];
            xtjVarArr[5] = xtjVarArr[8];
            xtjVarArr[6] = null;
            xtjVarArr[7] = null;
            xtjVarArr[8] = null;
        }
        l(xtjVarArr);
    }

    public final int a(xtj xtjVar, boolean z, boolean z2) {
        Texture texture = this.a;
        if (texture == null) {
            this.a = xtjVar.f();
        } else if (texture != xtjVar.f()) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float f = xtjVar.b;
        float f2 = xtjVar.f18763e;
        float f3 = xtjVar.d;
        float f4 = xtjVar.f18762c;
        Texture.TextureFilter textureFilterI = this.a.i();
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        if (textureFilterI == textureFilter || this.a.o() == textureFilter) {
            if (z) {
                float fE = 0.5f / this.a.E();
                f += fE;
                f3 -= fE;
            }
            if (z2) {
                float fB = 0.5f / this.a.B();
                f2 -= fB;
                f4 += fB;
            }
        }
        float[] fArr = this.q;
        int i = this.r;
        fArr[i + 3] = f;
        fArr[i + 4] = f2;
        fArr[i + 8] = f;
        fArr[i + 9] = f4;
        fArr[i + 13] = f3;
        fArr[i + 14] = f4;
        fArr[i + 18] = f3;
        fArr[i + 19] = f2;
        this.r = i + 20;
        return i;
    }

    public float b() {
        return this.p;
    }

    public float c() {
        return this.k;
    }

    public float d() {
        float f = this.w;
        return f == -1.0f ? b() : f;
    }

    public float e() {
        float f = this.t;
        return f == -1.0f ? c() : f;
    }

    public float f() {
        float f = this.u;
        return f == -1.0f ? h() : f;
    }

    public float g() {
        float f = this.v;
        return f == -1.0f ? i() : f;
    }

    public float h() {
        return this.f15465l;
    }

    public float i() {
        return this.o;
    }

    public float j() {
        return this.o + this.f15466n + this.p;
    }

    public float k() {
        return this.k + this.m + this.f15465l;
    }

    public final void l(xtj[] xtjVarArr) {
        xtj xtjVar = xtjVarArr[6];
        if (xtjVar != null) {
            this.b = a(xtjVar, false, false);
            this.k = xtjVarArr[6].c();
            this.p = xtjVarArr[6].b();
        } else {
            this.b = -1;
        }
        xtj xtjVar2 = xtjVarArr[7];
        if (xtjVar2 != null) {
            this.f15462c = a(xtjVar2, (xtjVarArr[6] == null && xtjVarArr[8] == null) ? false : true, false);
            this.m = Math.max(this.m, xtjVarArr[7].c());
            this.p = Math.max(this.p, xtjVarArr[7].b());
        } else {
            this.f15462c = -1;
        }
        xtj xtjVar3 = xtjVarArr[8];
        if (xtjVar3 != null) {
            this.d = a(xtjVar3, false, false);
            this.f15465l = Math.max(this.f15465l, xtjVarArr[8].c());
            this.p = Math.max(this.p, xtjVarArr[8].b());
        } else {
            this.d = -1;
        }
        xtj xtjVar4 = xtjVarArr[3];
        if (xtjVar4 != null) {
            this.f15463e = a(xtjVar4, false, (xtjVarArr[0] == null && xtjVarArr[6] == null) ? false : true);
            this.k = Math.max(this.k, xtjVarArr[3].c());
            this.f15466n = Math.max(this.f15466n, xtjVarArr[3].b());
        } else {
            this.f15463e = -1;
        }
        xtj xtjVar5 = xtjVarArr[4];
        if (xtjVar5 != null) {
            this.f = a(xtjVar5, (xtjVarArr[3] == null && xtjVarArr[5] == null) ? false : true, (xtjVarArr[1] == null && xtjVarArr[7] == null) ? false : true);
            this.m = Math.max(this.m, xtjVarArr[4].c());
            this.f15466n = Math.max(this.f15466n, xtjVarArr[4].b());
        } else {
            this.f = -1;
        }
        xtj xtjVar6 = xtjVarArr[5];
        if (xtjVar6 != null) {
            this.g = a(xtjVar6, false, (xtjVarArr[2] == null && xtjVarArr[8] == null) ? false : true);
            this.f15465l = Math.max(this.f15465l, xtjVarArr[5].c());
            this.f15466n = Math.max(this.f15466n, xtjVarArr[5].b());
        } else {
            this.g = -1;
        }
        xtj xtjVar7 = xtjVarArr[0];
        if (xtjVar7 != null) {
            this.h = a(xtjVar7, false, false);
            this.k = Math.max(this.k, xtjVarArr[0].c());
            this.o = Math.max(this.o, xtjVarArr[0].b());
        } else {
            this.h = -1;
        }
        xtj xtjVar8 = xtjVarArr[1];
        if (xtjVar8 != null) {
            this.i = a(xtjVar8, (xtjVarArr[0] == null && xtjVarArr[2] == null) ? false : true, false);
            this.m = Math.max(this.m, xtjVarArr[1].c());
            this.o = Math.max(this.o, xtjVarArr[1].b());
        } else {
            this.i = -1;
        }
        xtj xtjVar9 = xtjVarArr[2];
        if (xtjVar9 != null) {
            this.f15464j = a(xtjVar9, false, false);
            this.f15465l = Math.max(this.f15465l, xtjVarArr[2].c());
            this.o = Math.max(this.o, xtjVarArr[2].b());
        } else {
            this.f15464j = -1;
        }
        int i = this.r;
        float[] fArr = this.q;
        if (i < fArr.length) {
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.q = fArr2;
        }
    }

    public void m(float f, float f2) {
        this.k *= f;
        this.f15465l *= f;
        this.o *= f2;
        this.p *= f2;
        this.m *= f;
        this.f15466n *= f2;
        float f3 = this.t;
        if (f3 != -1.0f) {
            this.t = f3 * f;
        }
        float f4 = this.u;
        if (f4 != -1.0f) {
            this.u = f4 * f;
        }
        float f5 = this.v;
        if (f5 != -1.0f) {
            this.v = f5 * f2;
        }
        float f6 = this.w;
        if (f6 != -1.0f) {
            this.w = f6 * f2;
        }
    }

    public void n(float f, float f2, float f3, float f4) {
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.w = f4;
    }

    public psc(xtj xtjVar) {
        this.q = new float[180];
        this.s = new mk3(mk3.WHITE);
        this.t = -1.0f;
        this.u = -1.0f;
        this.v = -1.0f;
        this.w = -1.0f;
        l(new xtj[]{null, null, null, null, xtjVar, null, null, null, null});
    }

    public psc(psc pscVar, mk3 mk3Var) {
        this.q = new float[180];
        mk3 mk3Var2 = new mk3(mk3.WHITE);
        this.s = mk3Var2;
        this.t = -1.0f;
        this.u = -1.0f;
        this.v = -1.0f;
        this.w = -1.0f;
        this.a = pscVar.a;
        this.b = pscVar.b;
        this.f15462c = pscVar.f15462c;
        this.d = pscVar.d;
        this.f15463e = pscVar.f15463e;
        this.f = pscVar.f;
        this.g = pscVar.g;
        this.h = pscVar.h;
        this.i = pscVar.i;
        this.f15464j = pscVar.f15464j;
        this.k = pscVar.k;
        this.f15465l = pscVar.f15465l;
        this.m = pscVar.m;
        this.f15466n = pscVar.f15466n;
        this.o = pscVar.o;
        this.p = pscVar.p;
        this.t = pscVar.t;
        this.v = pscVar.v;
        this.w = pscVar.w;
        this.u = pscVar.u;
        float[] fArr = new float[pscVar.q.length];
        this.q = fArr;
        float[] fArr2 = pscVar.q;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.r = pscVar.r;
        mk3Var2.e(mk3Var);
    }
}
