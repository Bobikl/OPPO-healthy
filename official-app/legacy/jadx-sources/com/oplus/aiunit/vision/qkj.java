package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class qkj {
    @NotNull
    public static String a(@NotNull String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, "");
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable unused) {
            return "";
        }
    }
}
