package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class z85 implements c95 {
    public final zrj a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19314c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z85 f19315e;
    public z85 f;
    public int g = 1;
    public int h = 1;

    public z85(zrj zrjVar, char c2, boolean z, boolean z2, z85 z85Var) {
        this.a = zrjVar;
        this.b = c2;
        this.f19314c = z;
        this.d = z2;
        this.f19315e = z85Var;
    }

    @Override // com.oplus.aiunit.vision.c95
    public boolean a() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.c95
    public int b() {
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.c95
    public boolean c() {
        return this.f19314c;
    }

    @Override // com.oplus.aiunit.vision.c95
    public int length() {
        return this.g;
    }
}
