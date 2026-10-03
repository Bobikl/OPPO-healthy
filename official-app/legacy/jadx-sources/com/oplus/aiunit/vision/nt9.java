package com.oplus.aiunit.vision;

import java.io.Closeable;

/* JADX INFO: loaded from: classes19.dex */
public class nt9 {
    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                ltl.b(str, "[closeQuietly] --> " + e2.getMessage());
            }
        }
    }
}
