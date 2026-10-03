package com.oplus.seedling.sdk;

import androidx.annotation.Keep;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.aiunit.vision.sbe;
import com.oplus.utrace.sdk.ULog;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated(message = "请使用PantaLog打印日志")
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0003J\b\u0010\u0014\u001a\u00020\u0004H\u0003J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001fH\u0007J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u001c\u0010!\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/oplus/seedling/sdk/LogUtils;", "", "()V", "HEAD", "", "isDebuggable", "", "()Z", "setDebuggable", "(Z)V", "pluginCommitHash", "pluginVersionName", "sDebugThread", "sLevel", "", "sdkCommitHash", sbe.PAY_SDK_VERSION_NAME, "buildLogMsg", "msg", "printThread", "buildMsgSuffix", "d", "", "tag", "message", "throwable", "", FragmentStyle.DEBUG, MapSchema.FIELD_NAME_ENTRY, "tr", "getSeedlingPluginVersionInfo", "", "i", "injectPluginVersionInfo", "pluginGitCommitHash", "v", "w", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogUtils {

    @NotNull
    private static final String HEAD = "SeedlingSdk.";

    @Nullable
    private static String pluginCommitHash;

    @Nullable
    private static String pluginVersionName;

    @NotNull
    public static final LogUtils INSTANCE = new LogUtils();
    private static boolean isDebuggable = true;
    private static boolean sDebugThread = true;
    private static int sLevel = 2;

    @Nullable
    private static String sdkVersionName = "1.3.130";

    @Nullable
    private static String sdkCommitHash = "5a024cf";

    private LogUtils() {
    }

    @JvmStatic
    private static final String buildLogMsg(String msg, boolean printThread) {
        if (!printThread) {
            return msg + "," + buildMsgSuffix();
        }
        return "(" + Thread.currentThread().getName() + ") " + msg + "," + buildMsgSuffix();
    }

    public static /* synthetic */ String buildLogMsg$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return buildLogMsg(str, z);
    }

    @JvmStatic
    private static final String buildMsgSuffix() {
        return "[sdk:v" + sdkVersionName + "-" + sdkCommitHash + ",plugin:v" + pluginVersionName + "-" + pluginCommitHash + "]";
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 3) {
            ULog.d(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    public static final void debug(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (isDebuggable) {
            ULog.d(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 6) {
            ULog.e(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    @NotNull
    public static final List<String> getSeedlingPluginVersionInfo() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{pluginCommitHash, pluginVersionName});
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 4) {
            ULog.i(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    public static final void injectPluginVersionInfo(@Nullable String pluginVersionName2, @Nullable String pluginGitCommitHash) {
        pluginVersionName = pluginVersionName2;
        pluginCommitHash = pluginGitCommitHash;
    }

    @JvmStatic
    public static final void v(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 2) {
            ULog.v(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 5) {
            ULog.d(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    public final boolean isDebuggable() {
        return isDebuggable;
    }

    public final void setDebuggable(boolean z) {
        isDebuggable = z;
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 3) {
            ULog.d(HEAD + tag, buildLogMsg(message, sDebugThread));
        }
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (sLevel <= 6) {
            ULog.e(HEAD + tag, buildLogMsg(message, sDebugThread), tr);
        }
    }
}
