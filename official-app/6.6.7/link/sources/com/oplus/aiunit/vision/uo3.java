package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class uo3<T> {
    public boolean a;
    public T b;
    public String c;

    public uo3() {
    }

    public static uo3 a() {
        return new uo3(false, null, "fail");
    }

    public static <T> uo3<T> b(T t) {
        return new uo3<>(true, t, "success");
    }

    public uo3(boolean z, T t, String str) {
        this.a = z;
        this.b = t;
        this.c = str;
    }
}
