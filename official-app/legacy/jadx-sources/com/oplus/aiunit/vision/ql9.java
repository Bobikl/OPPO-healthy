package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ql9 {
    void a(String str, String str2, Context context, long j2, Object obj, Map<String, String> map);

    void b(String str, String str2, Context context, Map<String, String> map);

    default long c(long j2) {
        return System.currentTimeMillis() - j2;
    }

    long getStartTime();
}
