package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ/\u0010\u000e\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\r\"\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ$\u0010\u0015\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0006H\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/t7b;", "", "", "logLevel", "Lcom/oplus/aiunit/vision/es9;", "logHook", "", b2n.g, "", "tag", "msg", "j", "b", "", "c", "(Ljava/lang/String;[Ljava/lang/String;)V", b2n.f, MapSchema.FIELD_NAME_KEY, "d", "", "throwable", MapSchema.FIELD_NAME_ENTRY, "i", "a", "I", "f", "()I", "setLogLevel", "(I)V", "Lcom/oplus/aiunit/vision/es9;", "sLogHook", "<init>", "()V", "monitor_release"}, k = 1, mv = {1, 5, 1})
public final class t7b {

    @NotNull
    public static final t7b INSTANCE = new t7b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int logLevel = 3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile es9 sLogHook;

    public final void a() {
        if (sLogHook == null) {
            sLogHook = new u20();
        }
    }

    public final void b(@Nullable String tag, @Nullable String msg) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.d(tag, msg);
    }

    public final void c(@Nullable String tag, @NotNull String... msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.b(tag, msg);
    }

    public final void d(@Nullable String tag, @Nullable String msg) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.e(tag, msg);
    }

    public final void e(@Nullable String tag, @Nullable String msg, @Nullable Throwable throwable) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.e(tag, msg, throwable);
    }

    public final int f() {
        return logLevel;
    }

    public final void g(@Nullable String tag, @Nullable String msg) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.i(tag, msg);
    }

    public final void h(int logLevel2, @Nullable es9 logHook) {
        logLevel = logLevel2;
        if (logHook == null) {
            logHook = new u20();
        }
        sLogHook = logHook;
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.a(logLevel2);
    }

    public final void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.print(tag, msg);
    }

    public final void j(@Nullable String tag, @Nullable String msg) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.v(tag, msg);
    }

    public final void k(@Nullable String tag, @Nullable String msg) {
        a();
        es9 es9Var = sLogHook;
        Intrinsics.checkNotNull(es9Var);
        es9Var.w(tag, msg);
    }
}
