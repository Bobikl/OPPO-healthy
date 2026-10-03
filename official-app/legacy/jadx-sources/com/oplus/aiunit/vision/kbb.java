package com.oplus.aiunit.vision;

import androidx.core.os.TraceCompat;

/* JADX INFO: loaded from: classes12.dex */
public class kbb {
    public final String[] a = new String[5];
    public final long[] b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13225c = 0;
    public int d = 0;

    public void a(String str) {
        int i = this.f13225c;
        if (i == 5) {
            this.d++;
            return;
        }
        this.a[i] = str;
        this.b[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f13225c++;
    }

    public float b(String str) {
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
            return 0.0f;
        }
        int i2 = this.f13225c - 1;
        this.f13225c = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.a[i2])) {
            TraceCompat.endSection();
            return (System.nanoTime() - this.b[this.f13225c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.a[this.f13225c] + ".");
    }
}
