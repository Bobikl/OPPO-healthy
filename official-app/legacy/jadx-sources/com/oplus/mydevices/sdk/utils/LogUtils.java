package com.oplus.mydevices.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.mydevices.sdk.DeviceSdk;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\b\u0010\u0013\u001a\u00020\u0004H\u0003J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/oplus/mydevices/sdk/utils/LogUtils;", "", "()V", "sDebug", "", "sIsDevelopMode", "sLevel", "", "sTagHead", "", "d", "", "msg", "tag", "throwable", "", MapSchema.FIELD_NAME_ENTRY, "ex", "i", "isAssertPanicLog", "isDebug", "isDevelopMode", "registerLogSwitchObserver", "context", "Landroid/content/Context;", "setDebug", FragmentStyle.DEBUG, "setTagHead", "tagHead", "updateDebugLevel", "v", "w", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class LogUtils {
    public static final LogUtils INSTANCE;
    private static boolean sDebug;
    private static boolean sIsDevelopMode;
    private static int sLevel;
    private static String sTagHead;

    static {
        LogUtils logUtils = new LogUtils();
        INSTANCE = logUtils;
        sTagHead = "MyDevices.SDK.";
        sDebug = logUtils.isAssertPanicLog();
        Log.w("LogUtils", "oppoRefreshLogSwitch sDebug : " + sDebug);
        logUtils.updateDebugLevel();
        Context context = DeviceSdk.mApplicationContext;
        if (context != null) {
            logUtils.registerLogSwitchObserver(context);
        }
    }

    private LogUtils() {
    }

    @SuppressLint({"PrivateApi"})
    private final boolean isAssertPanicLog() {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "persist.sys.assert.panic", Boolean.FALSE);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e2) {
            Log.e(sTagHead, "isAssertPanic(): ", e2);
            return false;
        }
    }

    private final void registerLogSwitchObserver(Context context) {
        final Handler handler = null;
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), true, new ContentObserver(handler) { // from class: com.oplus.mydevices.sdk.utils.LogUtils$registerLogSwitchObserver$logSwitchObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                LogUtils.INSTANCE.updateDebugLevel();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDebugLevel() {
        Log.w("LogUtils", "oppoRefreshLogSwitch sDebug : " + sDebug);
        if (sDebug) {
            sLevel = 2;
            sIsDevelopMode = true;
        } else {
            sLevel = 4;
            sIsDevelopMode = false;
        }
    }

    public final void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 3) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.d(str, sb.toString());
        }
    }

    public final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 6) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.e(str, sb.toString());
        }
    }

    public final void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 4) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.i(str, sb.toString());
        }
    }

    public final boolean isDebug() {
        return sDebug;
    }

    public final boolean isDevelopMode() {
        return sIsDevelopMode;
    }

    public final void setDebug(boolean debug) {
        sDebug = debug;
        updateDebugLevel();
    }

    public final void setTagHead(@NotNull String tagHead) {
        Intrinsics.checkNotNullParameter(tagHead, "tagHead");
        sTagHead = tagHead;
    }

    public final void v(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 2) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.v(str, sb.toString());
        }
    }

    public final void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 5) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(")");
            sb.append(msg);
            Log.w(str, sb.toString());
        }
    }

    public final void d(@NotNull String tag, @Nullable String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (sLevel <= 3) {
            Log.d(sTagHead + tag, msg, throwable);
        }
    }

    public final void e(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 6) {
            Log.e(sTagHead, msg);
        }
    }

    public final void i(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 4) {
            Log.i(sTagHead, msg);
        }
    }

    public final void v(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 2) {
            Log.v(sTagHead, msg);
        }
    }

    public final void w(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 5) {
            Log.w(sTagHead, msg);
        }
    }

    public final void d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (sLevel <= 3) {
            Log.d(sTagHead, msg);
        }
    }

    public final void e(@Nullable String msg, @Nullable Throwable ex) {
        if (sLevel <= 6) {
            Log.e(sTagHead, msg, ex);
        }
    }

    public final void e(@NotNull String tag, @Nullable String msg, @Nullable Throwable ex) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (sLevel <= 6) {
            String str = sTagHead + tag;
            StringBuilder sb = new StringBuilder();
            sb.append(msg);
            sb.append(", ");
            sb.append(ex instanceof Exception ? ex.getMessage() : "");
            Log.e(str, sb.toString());
        }
    }
}
