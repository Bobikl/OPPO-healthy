package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import com.oplus.drs.core.config.entity.DebugModeEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class n25 {
    public static DebugModeEntity a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return null;
            }
            String strD = d(uri.getQueryParameter("appId"));
            if (TextUtils.isEmpty(strD)) {
                return null;
            }
            return new DebugModeEntity(strD, d(uri.getQueryParameter(DebugModeEntity.KEY_AREA)), b(uri.getQueryParameter("uploadType"), 0), b(uri.getQueryParameter(DebugModeEntity.KEY_SAMPLE), 0), c(uri.getQueryParameter(DebugModeEntity.KEY_START_AT), 0L), c(uri.getQueryParameter(DebugModeEntity.KEY_END_AT), 0L), d(uri.getQueryParameter("code")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long c(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j2;
        }
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }
}
