package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class n4n extends m4n {
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14341c;

    public n4n(Context context, boolean z) {
        this.b = context;
        this.f14341c = z;
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final boolean d() {
        return p0n.K(this.b) == 1 || this.f14341c;
    }
}
