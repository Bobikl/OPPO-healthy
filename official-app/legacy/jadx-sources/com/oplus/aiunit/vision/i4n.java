package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class i4n extends m4n {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12384c;

    public i4n(String str, m4n m4nVar) {
        super(m4nVar);
        this.b = 30;
        this.f12384c = str;
    }

    public static int f(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            c2n.r(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final boolean d() {
        return f(this.f12384c) >= this.b;
    }
}
