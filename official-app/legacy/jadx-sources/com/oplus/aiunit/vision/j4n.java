package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class j4n extends m4n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f12754c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12755e;
    public int f;
    public String b = "iKey";
    public int g = 0;

    public j4n(Context context, boolean z, int i, int i2, String str) {
        f(context, z, i, i2, str, 0);
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final int a() {
        int i;
        if ((p0n.K(this.f12754c) == 1 || (i = this.f12755e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        m4n m4nVar = this.a;
        return m4nVar != null ? Math.max(i, m4nVar.a()) : i;
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final void b(int i) {
        if (p0n.K(this.f12754c) == 1) {
            return;
        }
        String strC = w0n.c(System.currentTimeMillis(), "yyyyMMdd");
        String strA = b2n.a(this.f12754c, this.b);
        if (!TextUtils.isEmpty(strA)) {
            String[] strArrSplit = strA.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2) {
                b2n.g(this.f12754c, this.b);
            } else if (strC.equals(strArrSplit[0])) {
                i += Integer.parseInt(strArrSplit[1]);
            }
        }
        b2n.d(this.f12754c, this.b, strC + "|" + i);
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final boolean d() {
        if (p0n.K(this.f12754c) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String strA = b2n.a(this.f12754c, this.b);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit != null && strArrSplit.length >= 2) {
            return !w0n.c(System.currentTimeMillis(), "yyyyMMdd").equals(strArrSplit[0]) || Integer.parseInt(strArrSplit[1]) < this.f;
        }
        b2n.g(this.f12754c, this.b);
        return true;
    }

    public final void f(Context context, boolean z, int i, int i2, String str, int i3) {
        this.f12754c = context;
        this.d = z;
        this.f12755e = i;
        this.f = i2;
        this.b = str;
        this.g = i3;
    }

    public j4n(Context context, boolean z, int i, int i2, String str, int i3) {
        f(context, z, i, i2, str, i3);
    }
}
