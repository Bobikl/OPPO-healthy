package com.oplus.aiunit.vision;

import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class iw7 {
    public final List<nyg> a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f12673c;
    public final double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12674e;
    public final String f;

    public iw7(List<nyg> list, char c2, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c2;
        this.f12673c = d;
        this.d = d2;
        this.f12674e = str;
        this.f = str2;
    }

    public static int c(char c2, String str, String str2) {
        return (((c2 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<nyg> a() {
        return this.a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return c(this.b, this.f, this.f12674e);
    }
}
