package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public final class rzj {
    public final String a;
    public final qzj b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vfa f16414c;

    public rzj(String str, qzj qzjVar, vfa vfaVar) {
        this.a = str;
        this.b = qzjVar;
        this.f16414c = vfaVar;
    }

    public static rzj a(String str, qzj qzjVar, vfa vfaVar) {
        if (qzjVar == null) {
            throw new IllegalArgumentException("window == null");
        }
        if (vfaVar != null) {
            return new rzj(str, qzjVar, vfaVar);
        }
        throw new IllegalArgumentException("adjuster == null");
    }
}
