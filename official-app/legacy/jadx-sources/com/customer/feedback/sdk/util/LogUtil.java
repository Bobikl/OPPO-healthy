package com.customer.feedback.sdk.util;

import android.util.Log;
import com.customer.feedback.sdk.feedbacka;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.kwm;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import io.protostuff.MapSchema;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0003J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J$\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0013H\u0007J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/customer/feedback/sdk/util/LogUtil;", "", "()V", "SEPRATEOR", "", "TAG", "isDebugMode", "", "()Z", "setDebugMode", "(Z)V", "special", "checkDebug", "d", "", "tag", "debugInfo", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Exception;", "", "i", "setIsDebugMode", "v", "w", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogUtil {

    @NotNull
    public static final LogUtil INSTANCE = new LogUtil();

    @NotNull
    private static final String SEPRATEOR = "->";

    @NotNull
    public static final String TAG = "feedbackSDK";
    private static boolean isDebugMode;

    @NotNull
    private static final String special;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = feedbacka.f2201feedbackf;
        special = "feedbackSDK16.1.8";
        isDebugMode = checkDebug();
    }

    private LogUtil() {
    }

    @JvmStatic
    private static final boolean checkDebug() {
        return StringsKt__StringsJVMKt.equals(kwm.f("persist.sys.assert.panic", SpeechConstant.FALSE_STR), SpeechConstant.TRUE_STR, true) || StringsKt__StringsJVMKt.equals(kwm.f(SystemSettingsUtilsKt.LOG_ON_MKT, SpeechConstant.FALSE_STR), SpeechConstant.TRUE_STR, true);
    }

    @JvmStatic
    public static final void d(@Nullable String tag, @NotNull String debugInfo) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.d(tag, special + SEPRATEOR + debugInfo);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if (isDebugMode) {
            Log.e(tag, special + SEPRATEOR + e2);
        }
    }

    @JvmStatic
    public static final void i(@Nullable String tag, @NotNull String debugInfo) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.i(tag, special + SEPRATEOR + debugInfo);
        }
    }

    @JvmStatic
    public static final void setIsDebugMode(boolean isDebugMode2) {
        isDebugMode = isDebugMode2;
    }

    @JvmStatic
    public static final void v(@Nullable String tag, @NotNull String debugInfo) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.v(tag, special + SEPRATEOR + debugInfo);
        }
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @NotNull String debugInfo) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.w(tag, special + SEPRATEOR + debugInfo);
        }
    }

    public final boolean isDebugMode() {
        return isDebugMode;
    }

    public final void setDebugMode(boolean z) {
        isDebugMode = z;
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull String debugInfo) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.e(tag, special + SEPRATEOR + debugInfo);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull String debugInfo, @Nullable Exception e2) {
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        if (isDebugMode) {
            Log.e(tag, special + SEPRATEOR + debugInfo, e2);
        }
    }
}
