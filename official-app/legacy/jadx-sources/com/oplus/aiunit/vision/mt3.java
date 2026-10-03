package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class mt3 {
    public final File a;
    public final wb7 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du5 f14215c;
    public final u3i d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final di8 f14216e;

    public mt3(File file, wb7 wb7Var, du5 du5Var, u3i u3iVar, di8 di8Var) {
        this.a = file;
        this.b = wb7Var;
        this.f14215c = du5Var;
        this.d = u3iVar;
        this.f14216e = di8Var;
    }

    public File a(String str) {
        return new File(this.a, this.b.a(str));
    }
}
