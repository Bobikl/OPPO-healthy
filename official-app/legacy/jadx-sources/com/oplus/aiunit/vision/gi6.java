package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes19.dex */
public class gi6 {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11767c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11768e;

    @Nullable
    public Bitmap f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public gi6(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.f11767c = str;
        this.d = str2;
        this.f11768e = str3;
    }

    @Nullable
    public Bitmap a() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.f11767c;
    }

    public int e() {
        return this.a;
    }

    public void f(@Nullable Bitmap bitmap) {
        this.f = bitmap;
    }
}
