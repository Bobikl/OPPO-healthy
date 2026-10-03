package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes15.dex */
public class ukj {
    @NonNull
    public static String a(@NonNull String str) {
        try {
            return (String) ikf.p("android.os.SystemProperties").c(ParserTag.TAG_GET, str).j();
        } catch (Exception unused) {
            a7b.b("SystemProperties", "get return defaultValue");
            return "";
        }
    }

    @NonNull
    public static String b(@NonNull String str, @Nullable String str2) {
        try {
            return (String) ikf.p("android.os.SystemProperties").c(ParserTag.TAG_GET, str, str2).j();
        } catch (Exception unused) {
            a7b.b("SystemProperties", "get return def");
            return str2 == null ? "" : str2;
        }
    }

    public static boolean c(@NonNull String str, boolean z) {
        try {
            return ((Boolean) ikf.p("android.os.SystemProperties").c("getBoolean", str, Boolean.valueOf(z)).j()).booleanValue();
        } catch (Exception unused) {
            a7b.b("SystemProperties", "getBoolean return defaultValue");
            return z;
        }
    }
}
