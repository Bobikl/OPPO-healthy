package com.coui.component.responsiveui;

import android.util.Log;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\r¨\u0006#"}, d2 = {"Lcom/coui/component/responsiveui/ResponsiveUILog;", "", "", "tag", "", "logStatus", "", "level", "", "isLoggable", "a", "Z", "getLOG_VERBOSE", "()Z", "LOG_VERBOSE", "b", "getLOG_DEBUG", "LOG_DEBUG", "c", "getLOG_INFO", "LOG_INFO", "d", "getLOG_WARN", "LOG_WARN", MapSchema.FIELD_NAME_ENTRY, "getLOG_ERROR", "LOG_ERROR", "f", "getLOG_ASSERT", "LOG_ASSERT", b2n.f, "getLOG_SILENT", "LOG_SILENT", "<init>", "()V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class ResponsiveUILog {

    @NotNull
    public static final ResponsiveUILog INSTANCE = new ResponsiveUILog();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final boolean LOG_VERBOSE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final boolean LOG_DEBUG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final boolean LOG_INFO;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final boolean LOG_WARN;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final boolean LOG_ERROR;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final boolean LOG_ASSERT;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final boolean LOG_SILENT;

    static {
        boolean zIsLoggable = Log.isLoggable("COUI", 2);
        LOG_VERBOSE = zIsLoggable;
        boolean zIsLoggable2 = Log.isLoggable("COUI", 3);
        LOG_DEBUG = zIsLoggable2;
        boolean zIsLoggable3 = Log.isLoggable("COUI", 4);
        LOG_INFO = zIsLoggable3;
        boolean zIsLoggable4 = Log.isLoggable("COUI", 5);
        LOG_WARN = zIsLoggable4;
        boolean zIsLoggable5 = Log.isLoggable("COUI", 6);
        LOG_ERROR = zIsLoggable5;
        boolean zIsLoggable6 = Log.isLoggable("COUI", 7);
        LOG_ASSERT = zIsLoggable6;
        LOG_SILENT = (zIsLoggable || zIsLoggable2 || zIsLoggable3 || zIsLoggable4 || zIsLoggable5 || zIsLoggable6) ? false : true;
    }

    public final boolean getLOG_ASSERT() {
        return LOG_ASSERT;
    }

    public final boolean getLOG_DEBUG() {
        return LOG_DEBUG;
    }

    public final boolean getLOG_ERROR() {
        return LOG_ERROR;
    }

    public final boolean getLOG_INFO() {
        return LOG_INFO;
    }

    public final boolean getLOG_SILENT() {
        return LOG_SILENT;
    }

    public final boolean getLOG_VERBOSE() {
        return LOG_VERBOSE;
    }

    public final boolean getLOG_WARN() {
        return LOG_WARN;
    }

    public final boolean isLoggable(@Nullable String tag, int level) {
        return Log.isLoggable(tag, level);
    }

    public final void logStatus(@NotNull String tag) {
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        boolean zIsLoggable = Intrinsics.areEqual(tag, "COUI") ? LOG_VERBOSE : Log.isLoggable(tag, 2);
        boolean zIsLoggable2 = Intrinsics.areEqual(tag, "COUI") ? LOG_DEBUG : Log.isLoggable(tag, 3);
        boolean zIsLoggable3 = Intrinsics.areEqual(tag, "COUI") ? LOG_INFO : Log.isLoggable(tag, 2);
        boolean zIsLoggable4 = Intrinsics.areEqual(tag, "COUI") ? LOG_WARN : Log.isLoggable(tag, 2);
        boolean zIsLoggable5 = Intrinsics.areEqual(tag, "COUI") ? LOG_ERROR : Log.isLoggable(tag, 2);
        boolean zIsLoggable6 = Intrinsics.areEqual(tag, "COUI") ? LOG_ASSERT : Log.isLoggable(tag, 2);
        if (Intrinsics.areEqual(tag, "COUI")) {
            z = LOG_SILENT;
        } else {
            z = (zIsLoggable || zIsLoggable2 || zIsLoggable3 || zIsLoggable4 || zIsLoggable5 || zIsLoggable6) ? false : true;
        }
        Log.println(7, "COUI", StringsKt__IndentKt.trimIndent("\n            Log status for tag: " + tag + "\n            VERBOSE: " + zIsLoggable + "\n            DEBUG: " + zIsLoggable2 + "\n            INFO: " + zIsLoggable3 + "\n            WARN: " + zIsLoggable4 + "\n            ERROR: " + zIsLoggable5 + "\n            ASSERT: " + zIsLoggable6 + "\n            SILENT: " + z + "\n            "));
    }

    public final void logStatus() {
        logStatus("COUI");
    }
}
