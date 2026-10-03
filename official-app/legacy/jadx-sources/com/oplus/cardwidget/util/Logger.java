package com.oplus.cardwidget.util;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0003J\b\u0010\u000f\u001a\u00020\u0004H\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/oplus/cardwidget/util/Logger;", "", "()V", "DEBUG_TAG", "", "HEAD_TAG", "KEY_DEBUG_SWITCHER", "TAG", "VERSION_CODE", "debugSwitchObserver", "Landroid/database/ContentObserver;", "isDebuggable", "", "buildLogMsg", "content", "buildMsgSuffix", "d", "", "tag", FragmentStyle.DEBUG, "widgetCode", "dynamicUpdateDebugSwitch", "context", "Landroid/content/Context;", MapSchema.FIELD_NAME_ENTRY, "error", "i", UTraceSQLiteHelperKt.COL_INFO, "registerDebugSwitchObserver", "w", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Logger {

    @NotNull
    private static final String DEBUG_TAG = "DEBUG_";

    @NotNull
    private static final String HEAD_TAG = "CardWidget.";

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static final String KEY_DEBUG_SWITCHER = "log_switch_type";

    @NotNull
    private static final String TAG = "Logger";

    @NotNull
    private static final String VERSION_CODE = "2000008";

    @Nullable
    private static ContentObserver debugSwitchObserver;
    private static boolean isDebuggable;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/cardwidget/util/Logger$a", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ContentObserver {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(null);
            this.a = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            Logger.dynamicUpdateDebugSwitch(this.a);
            Logger.INSTANCE.d(Logger.TAG, "onChange: isDebuggable = " + Logger.isDebuggable);
        }
    }

    private Logger() {
    }

    @JvmStatic
    private static final String buildLogMsg(String content) {
        return content + "," + buildMsgSuffix();
    }

    @JvmStatic
    private static final String buildMsgSuffix() {
        return "[sdk:v2000008]";
    }

    @JvmStatic
    public static final void dynamicUpdateDebugSwitch(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        isDebuggable = Settings.System.getInt(context.getContentResolver(), "log_switch_type", 0) == 1;
    }

    @JvmStatic
    public static final void registerDebugSwitchObserver(@NotNull Context context) {
        Object objM5287constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            debugSwitchObserver = new a(context);
            Uri uriFor = Settings.System.getUriFor("log_switch_type");
            ContentObserver contentObserver = debugSwitchObserver;
            if (contentObserver != null) {
                context.getContentResolver().registerContentObserver(uriFor, false, contentObserver);
                contentObserver.onChange(false);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            INSTANCE.e(TAG, "registerDebugSwitchObserver error: " + thM5290exceptionOrNullimpl);
        }
    }

    public final void d(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        if (isDebuggable) {
            Log.d(HEAD_TAG + tag, buildLogMsg(content));
        }
    }

    public final void debug(@NotNull String tag, @NotNull String widgetCode, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(content, "content");
        d(tag, "[DEBUG_" + widgetCode + "]" + buildLogMsg(content));
    }

    public final void e(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Log.e(HEAD_TAG + tag, buildLogMsg(content));
    }

    public final void error(@NotNull String tag, @NotNull String widgetCode, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(content, "content");
        e(tag, "[DEBUG_" + widgetCode + "]" + buildLogMsg(content));
    }

    public final void i(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Log.i(HEAD_TAG + tag, buildLogMsg(content));
    }

    public final void info(@NotNull String tag, @NotNull String widgetCode, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(content, "content");
        i(tag, "[DEBUG_" + widgetCode + "]" + buildLogMsg(content));
    }

    public final void w(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Log.w(HEAD_TAG + tag, buildLogMsg(content));
    }
}
