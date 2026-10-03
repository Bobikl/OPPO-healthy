package com.oplus.aiunit.vision;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class cw7 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10267c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Typeface f10268e;

    public cw7(String str, String str2, String str3, float f) {
        this.a = str;
        this.b = str2;
        this.f10267c = str3;
        this.d = f;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f10267c;
    }

    @Nullable
    public Typeface d() {
        return this.f10268e;
    }

    public void e(@Nullable Typeface typeface) {
        this.f10268e = typeface;
    }
}
