package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\f\u0010\u000bJ=\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/d7b;", "", "", "tag", "format", "", "throwable", "", "obj", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "c", "d", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class d7b {
    public static final d7b INSTANCE = new d7b();

    public static /* synthetic */ void b(d7b d7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        d7bVar.a(str, str2, th, objArr);
    }

    public static /* synthetic */ void e(d7b d7bVar, String str, String str2, Throwable th, Object[] objArr, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        d7bVar.d(str, str2, th, objArr);
    }

    public final void a(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
    }

    public final void c(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
    }

    public final void d(@NotNull String tag, @NotNull String format, @Nullable Throwable throwable, @NotNull Object... obj) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(format, "format");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
    }
}
