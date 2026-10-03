package com.heytap.nearx.cloudconfig.util;

import com.oplus.aiunit.vision.r7b;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J=\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ=\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/heytap/nearx/cloudconfig/util/LogUtils;", "", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "attach", "", "tag", "format", "", "throwable", "", "obj", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "Lcom/oplus/aiunit/vision/r7b;", "<init>", "()V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class LogUtils {
    public static final LogUtils INSTANCE = new LogUtils();
    private static r7b logger;

    private LogUtils() {
    }

    public static /* synthetic */ void d$default(LogUtils logUtils, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logUtils.d(str, str2, th, objArr);
    }

    public static /* synthetic */ void e$default(LogUtils logUtils, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logUtils.e(str, str2, th, objArr);
    }

    public static /* synthetic */ void i$default(LogUtils logUtils, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logUtils.i(str, str2, th, objArr);
    }

    public static /* synthetic */ void v$default(LogUtils logUtils, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logUtils.v(str, str2, th, objArr);
    }

    public static /* synthetic */ void w$default(LogUtils logUtils, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logUtils.w(str, str2, th, objArr);
    }

    public final void attach(@NotNull r7b logger2) {
        Intrinsics.checkParameterIsNotNull(logger2, "logger");
        logger = logger2;
    }

    public final void d(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        r7b r7bVar = logger;
        if (r7bVar != null) {
            r7bVar.a(tag, format, throwable, obj);
        }
    }

    public final void e(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        r7b r7bVar = logger;
        if (r7bVar != null) {
            r7bVar.c(tag, format, throwable, obj);
        }
    }

    public final void i(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        r7b r7bVar = logger;
        if (r7bVar != null) {
            r7bVar.g(tag, format, throwable, obj);
        }
    }

    public final void v(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        r7b r7bVar = logger;
        if (r7bVar != null) {
            r7bVar.k(tag, format, throwable, obj);
        }
    }

    public final void w(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        r7b r7bVar = logger;
        if (r7bVar != null) {
            r7bVar.m(tag, format, throwable, obj);
        }
    }
}
