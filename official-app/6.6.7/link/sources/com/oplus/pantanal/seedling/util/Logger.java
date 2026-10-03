package com.oplus.pantanal.seedling.util;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/oplus/pantanal/seedling/util/Logger;", "", "()V", "DEBUG_TAG", "", "HEAD_TAG", "addThreadName", "str", "isAddThreadName", "", "d", "", "tag", "content", "debug", "widgetCode", "e", "getSdkTag", "i", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Logger {

    @NotNull
    private static final String DEBUG_TAG = "DEBUG_";

    @NotNull
    private static final String HEAD_TAG = "CardWidget_";

    @NotNull
    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    private final String addThreadName(String str, boolean isAddThreadName) {
        String str2;
        if (isAddThreadName) {
            str2 = "(" + Thread.currentThread().getName() + ") ";
        } else {
            str2 = "";
        }
        return str2 + str;
    }

    public static /* synthetic */ String addThreadName$default(Logger logger, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return logger.addThreadName(str, z);
    }

    private final String getSdkTag(String tag) {
        return HEAD_TAG + tag;
    }

    public final void d(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        if (UtilsKt.isAppDebug()) {
            Log.d(getSdkTag(tag), addThreadName$default(this, content, false, 2, null));
        }
    }

    public final void debug(@NotNull String tag, @NotNull String widgetCode, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(content, "content");
        d(tag, "[DEBUG_" + widgetCode + "]" + addThreadName$default(this, content, false, 2, null));
    }

    public final void e(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Log.e(getSdkTag(tag), addThreadName$default(this, content, false, 2, null));
    }

    public final void i(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Log.d(getSdkTag(tag), addThreadName$default(this, content, false, 2, null));
    }
}
