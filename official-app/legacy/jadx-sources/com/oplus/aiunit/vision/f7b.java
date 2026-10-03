package com.oplus.aiunit.vision;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.sdk.ULog;
import com.pantanal.server.content.sdk.StaticSdk;
import io.protostuff.MapSchema;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007J\"\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/f7b;", "", "", "i", "Landroid/net/Uri;", ParserTag.TAG_URI, MapSchema.FIELD_NAME_KEY, "", "tag", "message", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, b2n.g, LogFieldKey.MESSAGE_KEY, "d", "f", "", "tr", b2n.f, "a", "Landroid/net/Uri;", "logSwitchStatusUri", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "b", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "mDispatcher", "", "<set-?>", "c", "Z", "j", "()Z", "isDebuggable", "sDebugThread", "", "I", "sLevel", "Landroid/database/ContentObserver;", "Landroid/database/ContentObserver;", "logSwitchObserver", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class f7b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean sDebugThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static int sLevel;

    @NotNull
    public static final f7b INSTANCE = new f7b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static final Uri logSwitchStatusUri = Uri.parse("content://com.oplus.pantanal.ums.decision/log_switch_status");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final MainCoroutineDispatcher mDispatcher = Dispatchers.getMain();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final ContentObserver logSwitchObserver = new a(new Handler(Looper.getMainLooper()));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isDebuggable = true;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/f7b$a", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            ULog.d("LogUtils", Intrinsics.stringPlus("logSwitchObserver onChange ", uri));
            f7b.k(uri);
        }
    }

    static {
        i();
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 3) {
            if (!sDebugThread) {
                ULog.d(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION);
                return;
            }
            ULog.d(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION);
        }
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (isDebuggable) {
            if (!sDebugThread) {
                ULog.d(Intrinsics.stringPlus("StaticSDK.", tag), message);
                return;
            }
            ULog.d(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message);
        }
    }

    @JvmStatic
    public static final void f(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 6) {
            if (!sDebugThread) {
                ULog.e(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION);
                return;
            }
            ULog.e(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION);
        }
    }

    @JvmStatic
    public static final void g(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 6) {
            if (!sDebugThread) {
                ULog.e(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION, tr);
                return;
            }
            ULog.e(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION, tr);
        }
    }

    @JvmStatic
    public static final void h(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 4) {
            if (!sDebugThread) {
                ULog.i(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION);
                return;
            }
            ULog.i(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION);
        }
    }

    @JvmStatic
    public static final void i() {
        if (isDebuggable) {
            sLevel = 2;
            sDebugThread = true;
        } else {
            sLevel = 4;
            sDebugThread = false;
        }
    }

    @JvmStatic
    public static final void k(@Nullable Uri uri) {
        boolean zAreEqual = Intrinsics.areEqual(uri == null ? null : uri.getQueryParameter("log_switch_status"), "1");
        isDebuggable = zAreEqual;
        ULog.d("LogUtils", Intrinsics.stringPlus("oppoRefreshLogSwitch sDebuggable : ", Boolean.valueOf(zAreEqual)));
        i();
    }

    @JvmStatic
    public static final void l(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 2) {
            if (!sDebugThread) {
                ULog.v(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION);
                return;
            }
            ULog.v(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION);
        }
    }

    @JvmStatic
    public static final void m(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 5) {
            if (!sDebugThread) {
                ULog.w(Intrinsics.stringPlus("StaticSDK.", tag), message + ",in version " + StaticSdk.VERSION);
                return;
            }
            ULog.w(Intrinsics.stringPlus("StaticSDK.", tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + message + ",in version " + StaticSdk.VERSION);
        }
    }

    public final boolean j() {
        return isDebuggable;
    }
}
