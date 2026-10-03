package com.oplus.aiunit.vision;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class lt9 {
    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                i25.c(str, "[closeQuietly] --> " + e2.getMessage());
            }
        }
    }
}
