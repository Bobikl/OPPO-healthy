package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class i6n {
    public String a;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12401c = 0;
    public double d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f12402e = 0.0d;
    public double f = 0.0d;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12403j = false;

    public i6n(String str) {
        this.a = str;
    }

    public final double a(i6n i6nVar) {
        if (i6nVar != null) {
            return t6n.a(this.f12402e, this.d, i6nVar.f12402e, i6nVar.d);
        }
        return 0.0d;
    }
}
