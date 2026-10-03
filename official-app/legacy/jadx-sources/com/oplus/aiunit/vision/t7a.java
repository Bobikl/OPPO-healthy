package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class t7a {
    public final int a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16916c;

    public t7a(int i, @NonNull String str, int i2) {
        this.a = i;
        this.b = str;
        this.f16916c = i2;
    }

    public static t7a a(int i, String str) {
        return new t7a(i, str, 0);
    }

    public static t7a b(int i) {
        return new t7a(0, "OK", i);
    }

    public String toString() {
        return "IngestResult{code=" + this.a + ", message='" + this.b + "', count=" + this.f16916c + '}';
    }
}
