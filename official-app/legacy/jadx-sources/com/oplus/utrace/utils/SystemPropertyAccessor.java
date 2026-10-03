package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.util.Log;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wrapper.os.SystemProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/utils/SystemPropertyAccessor;", "", "()V", "STRING_EMPTY", "", "TAG", ParserTag.TAG_GET, "key", "defValue", "getBoolean", "", "getInt", "", "getLong", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public final class SystemPropertyAccessor {

    @NotNull
    public static final SystemPropertyAccessor INSTANCE = new SystemPropertyAccessor();

    @NotNull
    private static final String STRING_EMPTY = "";

    @NotNull
    private static final String TAG = "UTrace.Lib.SystemPropertyAccessor";

    private SystemPropertyAccessor() {
    }

    @NotNull
    public final String get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = SystemProperties.get(key, "");
            Intrinsics.checkNotNullExpressionValue(str, "get(key, STRING_EMPTY)");
            return str;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(TAG, "getString error key=" + key + "! " + thM5290exceptionOrNullimpl.getMessage());
            }
            return "";
        }
    }

    public final boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            return SystemProperties.getBoolean(key, defValue);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(TAG, "getBoolean error key=" + key + "! " + thM5290exceptionOrNullimpl.getMessage());
            }
            return defValue;
        }
    }

    public final int getInt(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            return SystemProperties.getInt(key, defValue);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(TAG, "getInt error key=" + key + "! " + thM5290exceptionOrNullimpl.getMessage());
            }
            return defValue;
        }
    }

    public final long getLong(@NotNull String key, long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            return SystemProperties.getLong(key, defValue);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(TAG, "getLong error key=" + key + "! " + thM5290exceptionOrNullimpl.getMessage());
            }
            return defValue;
        }
    }

    @NotNull
    public final String get(@NotNull String key, @Nullable String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = SystemProperties.get(key, defValue);
            Intrinsics.checkNotNullExpressionValue(str, "get(key, defValue)");
            return str;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Log.e(TAG, "getString defValue error key=" + key + "! " + thM5290exceptionOrNullimpl.getMessage());
            }
            return defValue == null ? "" : defValue;
        }
    }
}
