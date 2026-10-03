package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f503c;
    public Justification d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f504e;
    public float f;
    public float g;

    @ColorInt
    public int h;

    @ColorInt
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f505j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public PointF f506l;

    @Nullable
    public PointF m;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        a(str, str2, f, justification, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public void a(String str, String str2, float f, Justification justification, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.a = str;
        this.b = str2;
        this.f503c = f;
        this.d = justification;
        this.f504e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.f505j = f4;
        this.k = z;
        this.f506l = pointF;
        this.m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f503c)) * 31) + this.d.ordinal()) * 31) + this.f504e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }

    public DocumentData() {
    }
}
