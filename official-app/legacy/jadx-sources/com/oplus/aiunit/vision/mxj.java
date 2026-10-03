package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class mxj extends ytj {
    public final mk3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14262j;
    public int k;

    public mxj() {
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f14262j = 1.0f;
        this.k = 12;
    }

    @Override // com.oplus.aiunit.vision.ytj
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public mxj n(mk3 mk3Var) {
        mxj mxjVar = new mxj(this);
        mxjVar.i.e(mk3Var);
        mxjVar.a(j());
        mxjVar.b(f());
        mxjVar.e(h());
        mxjVar.c(d());
        return mxjVar;
    }

    public mxj(ytj ytjVar) {
        super(ytjVar);
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f14262j = 1.0f;
        this.k = 12;
    }
}
