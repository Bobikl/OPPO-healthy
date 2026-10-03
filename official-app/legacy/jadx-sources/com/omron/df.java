package com.omron;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class df {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8890c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8891e;

    public df(byte[] bArr) {
        this.a = bArr[0];
        this.b = bArr[1];
        this.f8890c = ek.b(bArr, 2, true);
        this.d = bArr[4];
        this.f8891e = ek.b(bArr, 5, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===== ");
        sb.append(getClass().getSimpleName());
        sb.append(" =====\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "format:0x%02x, ", Integer.valueOf(this.a)));
        sb.append(String.format(locale, "exponent:%d, ", Integer.valueOf(this.b)));
        sb.append(String.format(locale, "unitUUIDValue:0x%04x, ", Integer.valueOf(this.f8890c)));
        sb.append(String.format(locale, "namespace:0x%02x, ", Integer.valueOf(this.d)));
        sb.append(String.format(locale, "description:0x%04x, ", Integer.valueOf(this.f8891e)));
        return sb.toString();
    }
}
