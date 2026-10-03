package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;

/* JADX INFO: loaded from: classes3.dex */
public class ho3<T> {
    public boolean a;
    public T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12211c;

    public ho3() {
    }

    public static ho3 a() {
        return new ho3(false, null, AcBaseTraceHelper.VAL_FAIL);
    }

    public static ho3 b(String str) {
        return new ho3(false, null, str);
    }

    public static <T> ho3<T> c(T t) {
        return new ho3<>(true, t, "success");
    }

    public ho3(boolean z, T t, String str) {
        this.a = z;
        this.b = t;
        this.f12211c = str;
    }
}
