package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class it7 extends vj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12648l;
    public static final String ShininessAlias = "shininess";
    public static final long Shininess = vj0.g(ShininessAlias);
    public static final String AlphaTestAlias = "alphaTest";
    public static final long AlphaTest = vj0.g(AlphaTestAlias);

    public it7(long j2, float f) {
        super(j2);
        this.f12648l = f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj0 vj0Var) {
        long j2 = this.i;
        long j3 = vj0Var.i;
        if (j2 != j3) {
            return (int) (j2 - j3);
        }
        float f = ((it7) vj0Var).f12648l;
        if (onb.g(this.f12648l, f)) {
            return 0;
        }
        return this.f12648l < f ? -1 : 1;
    }

    @Override // com.oplus.aiunit.vision.vj0
    public int hashCode() {
        return (super.hashCode() * 977) + rzc.b(this.f12648l);
    }
}
