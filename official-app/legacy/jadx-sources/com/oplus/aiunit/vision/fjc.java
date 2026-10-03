package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/fjc;", "", "", "tag", "msg", "", "a", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, "b", "", "t", "c", "", "logPriority", "", "d", "Z", "sIsDebug", "Lcom/oplus/aiunit/vision/a6b;", "Lcom/oplus/aiunit/vision/a6b;", "sLogDelegate", "Ljava/lang/String;", "sTag", "I", "sLogPriority", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class fjc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final boolean sIsDebug = false;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static int sLogPriority;

    @NotNull
    public static final fjc INSTANCE = new fjc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static a6b sLogDelegate = new i7b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String sTag = "[UIKit]";

    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (INSTANCE.d(3)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(3, tag, msg, null);
        }
    }

    @JvmStatic
    public static final void b(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (INSTANCE.d(6)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(6, tag, msg, null);
        }
    }

    @JvmStatic
    public static final void c(@NotNull Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (INSTANCE.d(6)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(6, sTag, null, t);
        }
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (INSTANCE.d(4)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(4, tag, msg, null);
        }
    }

    @JvmStatic
    public static final void f(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (INSTANCE.d(5)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(5, sTag, msg, null);
        }
    }

    @JvmStatic
    public static final void g(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (INSTANCE.d(5)) {
            a6b a6bVar = sLogDelegate;
            Intrinsics.checkNotNull(a6bVar);
            a6bVar.log(5, tag, msg, null);
        }
    }

    public final boolean d(int logPriority) {
        return sLogDelegate != null && sIsDebug && logPriority >= sLogPriority;
    }
}
