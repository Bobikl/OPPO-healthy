package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class yjk {
    public static volatile yjk a;

    public static yjk a() {
        if (a == null) {
            synchronized (yjk.class) {
                if (a == null) {
                    a = new yjk();
                }
            }
        }
        return a;
    }

    public zx9 b() {
        return null;
    }
}
