package com.oplus.channel.client.utils;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J$\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u0007J\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J$\u0010\u001e\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u001a\u0010\u001f\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J$\u0010\u001f\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001a\u0010!\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J$\u0010!\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u001a\u0010\"\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J$\u0010\"\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/oplus/channel/client/utils/LogUtil;", "", "()V", "HEAD", "", "KEY_DEBUG_SWITCHER", "ON", "PARAM_LOG_SWITCH_STATUS", "TAG", "debugSwitchObserver", "Landroid/database/ContentObserver;", "debuggable", "", "head", "logInterface", "com/oplus/channel/client/utils/LogUtil$logInterface$1", "Lcom/oplus/channel/client/utils/LogUtil$logInterface$1;", "logSwitchStatusUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "d", "", "tag", "msg", "th", "", "dynamicUpdateDebugSwitch", "context", "Landroid/content/Context;", ParserTag.TAG_URI, MapSchema.FIELD_NAME_ENTRY, "i", "registerDebugContentObserver", "v", "w", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LogUtil {

    @NotNull
    private static final String KEY_DEBUG_SWITCHER = "log_switch_type";

    @NotNull
    private static final String ON = "1";

    @NotNull
    private static final String PARAM_LOG_SWITCH_STATUS = "log_switch_status";

    @NotNull
    private static final String TAG = "ChannelClientLogUtil";

    @Nullable
    private static ContentObserver debugSwitchObserver;
    private static boolean debuggable;

    @NotNull
    public static final LogUtil INSTANCE = new LogUtil();

    @NotNull
    private static final String HEAD = "Channel.Client[1000032]";

    @NotNull
    private static String head = HEAD;
    private static final Uri logSwitchStatusUri = Uri.parse("content://com.oplus.pantanal.ums.decision/log_switch_status");

    @NotNull
    private static final LogUtil$logInterface$1 logInterface = new LogUtil$logInterface$1();

    private LogUtil() {
    }

    @JvmStatic
    public static final void d(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.d(tag, msg);
    }

    @JvmStatic
    public static final void dynamicUpdateDebugSwitch(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = Settings.System.getInt(context.getContentResolver(), "log_switch_type", 0) == 1;
        debuggable = z;
        if (uri == null) {
            return;
        }
        debuggable = z || Intrinsics.areEqual(uri.getQueryParameter(PARAM_LOG_SWITCH_STATUS), "1");
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.e(tag, msg);
    }

    @JvmStatic
    public static final void i(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.i(tag, msg);
    }

    @JvmStatic
    public static final void registerDebugContentObserver(@NotNull final Context context) {
        Object objM5287constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uriFor = Settings.System.getUriFor("log_switch_type");
            dynamicUpdateDebugSwitch(context, uriFor);
            debugSwitchObserver = new ContentObserver() { // from class: com.oplus.channel.client.utils.LogUtil$registerDebugContentObserver$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange, @Nullable Uri uri) {
                    super.onChange(selfChange, uri);
                    LogUtil.dynamicUpdateDebugSwitch(context, uri);
                    LogUtil.i("ChannelClientLogUtil", Intrinsics.stringPlus("onChange: debuggable = ", Boolean.valueOf(LogUtil.debuggable)));
                }
            };
            String pkg = context.getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(HEAD);
            Intrinsics.checkNotNullExpressionValue(pkg, "pkg");
            String strSubstring = pkg.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) pkg, ".", 0, false, 6, (Object) null), pkg.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append('.');
            head = sb.toString();
            ContentObserver contentObserver = debugSwitchObserver;
            if (contentObserver == null) {
                unit = null;
            } else {
                context.getContentResolver().registerContentObserver(logSwitchStatusUri, false, contentObserver);
                context.getContentResolver().registerContentObserver(uriFor, false, contentObserver);
                unit = Unit.INSTANCE;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            e(TAG, "registerContentObserver error", thM5290exceptionOrNullimpl);
        }
    }

    @JvmStatic
    public static final void v(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.v(tag, msg);
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.w(tag, msg);
    }

    @JvmStatic
    public static final void d(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.d(tag, msg, th);
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.e(tag, msg, th);
    }

    @JvmStatic
    public static final void i(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.i(tag, msg, th);
    }

    @JvmStatic
    public static final void v(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.v(tag, msg, th);
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logInterface.w(tag, msg, th);
    }
}
