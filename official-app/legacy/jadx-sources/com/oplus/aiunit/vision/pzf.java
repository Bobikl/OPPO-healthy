package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/pzf;", "", "", "a", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class pzf {

    @NotNull
    public static final pzf INSTANCE = new pzf();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u000e"}, d2 = {"com/oplus/aiunit/vision/pzf$a", "Lcom/heytap/health/rpc/c$b;", "", "tag", "message", "", "v", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "", "caller", "a", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.heytap.health.rpc.c.b {
        @Override // com.heytap.health.rpc.c.b
        @NotNull
        public String a(@Nullable Throwable caller) {
            String strE = a7b.e(caller);
            Intrinsics.checkNotNullExpressionValue(strE, "getStackTraceString(caller)");
            return strE;
        }

        @Override // com.heytap.health.rpc.c.b
        public void d(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @Override // com.heytap.health.rpc.c.b
        public void e(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            a7b.b(tag, message);
        }

        @Override // com.heytap.health.rpc.c.b
        public void i(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            a7b.f(tag, message);
        }

        @Override // com.heytap.health.rpc.c.b
        public void v(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @Override // com.heytap.health.rpc.c.b
        public void w(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            a7b.m(tag, message);
        }
    }

    @JvmStatic
    public static final void a() {
        com.heytap.health.rpc.c.Companion companion = com.heytap.health.rpc.c.INSTANCE;
        companion.f(new a());
        companion.g("init done");
    }
}
