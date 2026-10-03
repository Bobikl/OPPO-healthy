package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
public class xab {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18556c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18557e;

    @Nullable
    public Bitmap f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public xab(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.f18556c = str;
        this.d = str2;
        this.f18557e = str3;
    }

    public xab a(float f) {
        xab xabVar = new xab((int) (this.a * f), (int) (this.b * f), this.f18556c, this.d, this.f18557e);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            xabVar.g(Bitmap.createScaledBitmap(bitmap, xabVar.a, xabVar.b, true));
        }
        return xabVar;
    }

    @Nullable
    public Bitmap b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f18556c;
    }

    public int f() {
        return this.a;
    }

    public void g(@Nullable Bitmap bitmap) {
        this.f = bitmap;
    }
}
