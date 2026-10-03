package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class oki {
    public bv1 a;
    public bv1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nuk f14973c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14974e;
    public float f;

    public oki() {
        nuk nukVar = new nuk();
        this.f14973c = nukVar;
        nukVar.d(0.0f, 0.0f);
        this.d = Float.MAX_VALUE;
        this.f14974e = 6.0f;
        this.f = 0.8f;
    }

    public String toString() {
        return "SpringDef{target=" + this.f14973c + ", frequencyHz=" + this.f14974e + ", dampingRatio=" + this.f + "}@" + hashCode();
    }
}
