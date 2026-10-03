package com.oplus.aiunit.vision;

import android.app.Application;

/* JADX INFO: loaded from: classes8.dex */
public final class npm {
    public final Application a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14592c;
    public final String d;

    public npm(Application application, String str, String str2, String str3) {
        this.a = application;
        this.b = str;
        this.d = str2;
        this.f14592c = str3;
    }

    public String toString() {
        return n04.OPEN_BRACE_REGEX + this.b + "," + this.f14592c + "}";
    }
}
