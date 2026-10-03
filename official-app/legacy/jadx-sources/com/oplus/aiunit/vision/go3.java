package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;

/* JADX INFO: loaded from: classes2.dex */
public class go3<T> {
    public boolean a;
    public T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11828c;

    public go3() {
    }

    public static go3 a() {
        return new go3(false, null, AcBaseTraceHelper.VAL_FAIL);
    }

    public static <T> go3<T> b(T t) {
        return new go3<>(true, t, "success");
    }

    public go3(boolean z, T t, String str) {
        this.a = z;
        this.b = t;
        this.f11828c = str;
    }
}
