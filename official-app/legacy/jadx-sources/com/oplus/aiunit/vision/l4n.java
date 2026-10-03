package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class l4n extends m4n {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13519c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f13520e;

    public l4n(Context context, int i, String str, m4n m4nVar) {
        super(m4nVar);
        this.b = i;
        this.d = str;
        this.f13520e = context;
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final void c(boolean z) {
        super.c(z);
        if (z) {
            String str = this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f13519c = jCurrentTimeMillis;
            b2n.d(this.f13520e, str, String.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final boolean d() {
        if (this.f13519c == 0) {
            String strA = b2n.a(this.f13520e, this.d);
            this.f13519c = TextUtils.isEmpty(strA) ? 0L : Long.parseLong(strA);
        }
        return System.currentTimeMillis() - this.f13519c >= ((long) this.b);
    }
}
