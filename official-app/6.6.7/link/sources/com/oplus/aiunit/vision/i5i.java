package com.oplus.aiunit.vision;

import java.io.Closeable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class i5i {
    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    o5f.a("SocketUtils", "failed to close resource error is:" + e.getMessage());
                }
            }
        }
    }
}
