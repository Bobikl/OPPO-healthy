package com.oplus.aiunit.vision;

import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public class r1i {
    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e2) {
                    c3f.a("SocketUtils", "failed to close resource error is:" + e2.getMessage());
                }
            }
        }
    }
}
