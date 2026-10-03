package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class j52 {
    public final zrj a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12757c;
    public final j52 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z85 f12758e;
    public boolean f = true;
    public boolean g = false;

    public j52(zrj zrjVar, int i, j52 j52Var, z85 z85Var, boolean z) {
        this.a = zrjVar;
        this.b = i;
        this.f12757c = z;
        this.d = j52Var;
        this.f12758e = z85Var;
    }

    public static j52 a(zrj zrjVar, int i, j52 j52Var, z85 z85Var) {
        return new j52(zrjVar, i, j52Var, z85Var, true);
    }

    public static j52 b(zrj zrjVar, int i, j52 j52Var, z85 z85Var) {
        return new j52(zrjVar, i, j52Var, z85Var, false);
    }
}
