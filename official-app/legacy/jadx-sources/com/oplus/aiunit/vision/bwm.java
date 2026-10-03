package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.smartenginehelper.ParserTag;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class bwm {

    @NotNull
    public static final String feedbacka;

    static {
        StringBuilder sb = new StringBuilder("ro.build.version.");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        sb.append(new String("oppo".getBytes(), UTF_8));
        sb.append(HttpConst.ROM);
        feedbacka = sb.toString();
    }

    @JvmStatic
    @Nullable
    public static final String a(@Nullable String str, @Nullable String str2) {
        Object objM5287constructorimpl;
        String str3;
        String str4 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod(ParserTag.TAG_GET, (Class[]) Arrays.copyOf(new Class[]{String.class, String.class}, 2)).invoke(cls, Arrays.copyOf(new Object[]{str, str2}, 2));
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            str3 = (String) objInvoke;
            try {
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                th = th;
                str4 = str3;
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                str3 = str4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null ? str2 : str3;
    }

    @JvmStatic
    @NotNull
    public static final String b() {
        String strA = a("ro.build.version.oplusrom", "");
        if (TextUtils.isEmpty(strA)) {
            strA = a(feedbacka, "");
        }
        return strA == null ? "" : strA;
    }

    @JvmStatic
    public static final boolean c(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        int i = context.getResources().getConfiguration().screenWidthDp;
        int i2 = context.getResources().getConfiguration().screenHeightDp;
        return (i > 840 && i2 > 480) || (i2 > 840 && i > 600);
    }

    @JvmStatic
    public static final boolean d() {
        return (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
    }

    @JvmStatic
    public static final boolean e(@Nullable Configuration configuration) {
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    @JvmStatic
    public static final int f(@Nullable Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
