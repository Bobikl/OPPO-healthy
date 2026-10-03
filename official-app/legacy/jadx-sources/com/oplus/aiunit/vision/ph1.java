package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class ph1 extends vj0 {
    public static final String Alias = "blended";
    public static final long Type = vj0.g(Alias);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15373l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15374n;
    public float o;

    public ph1() {
        this(null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj0 vj0Var) {
        long j2 = this.i;
        long j3 = vj0Var.i;
        if (j2 != j3) {
            return (int) (j2 - j3);
        }
        ph1 ph1Var = (ph1) vj0Var;
        boolean z = this.f15373l;
        if (z != ph1Var.f15373l) {
            return z ? 1 : -1;
        }
        int i = this.m;
        int i2 = ph1Var.m;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.f15374n;
        int i4 = ph1Var.f15374n;
        if (i3 != i4) {
            return i3 - i4;
        }
        if (onb.g(this.o, ph1Var.o)) {
            return 0;
        }
        return this.o < ph1Var.o ? 1 : -1;
    }

    @Override // com.oplus.aiunit.vision.vj0
    public int hashCode() {
        return (((((((super.hashCode() * 947) + (this.f15373l ? 1 : 0)) * 947) + this.m) * 947) + this.f15374n) * 947) + rzc.b(this.o);
    }

    public ph1(boolean z, int i, int i2, float f) {
        super(Type);
        this.f15373l = z;
        this.m = i;
        this.f15374n = i2;
        this.o = f;
    }

    public ph1(int i, int i2, float f) {
        this(true, i, i2, f);
    }

    public ph1(ph1 ph1Var) {
        this(ph1Var == null || ph1Var.f15373l, ph1Var == null ? k18.GL_SRC_ALPHA : ph1Var.m, ph1Var == null ? k18.GL_ONE_MINUS_SRC_ALPHA : ph1Var.f15374n, ph1Var == null ? 1.0f : ph1Var.o);
    }
}
