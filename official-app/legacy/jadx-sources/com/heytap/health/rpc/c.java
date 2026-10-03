package com.heytap.health.rpc;

import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/rpc/c;", "", "Companion", "a", "b", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
public final class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "RpcLog";
    public static boolean a;

    @Nullable
    public static b b;

    /* JADX INFO: renamed from: com.heytap.health.rpc.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/rpc/c$a;", "", "Lcom/heytap/health/rpc/c$b;", "logDelegate", "", "f", "", "msg", b2n.f, "a", "d", b2n.g, "b", "", "caller", "c", "", "isDebug", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "setDebug", "(Z)V", "TAG", "Ljava/lang/String;", "delegate", "Lcom/heytap/health/rpc/c$b;", "<init>", "()V", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull String msg) {
            b bVar;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (!e() || (bVar = c.b) == null) {
                return;
            }
            bVar.d(c.TAG, msg);
        }

        public final void b(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            b bVar = c.b;
            if (bVar != null) {
                bVar.e(c.TAG, msg);
            }
        }

        @NotNull
        public final String c(@Nullable Throwable caller) {
            String strA;
            b bVar = c.b;
            return (bVar == null || (strA = bVar.a(caller)) == null) ? "" : strA;
        }

        public final void d(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            b bVar = c.b;
            if (bVar != null) {
                bVar.i(c.TAG, msg);
            }
        }

        public final boolean e() {
            return c.a;
        }

        public final void f(@NotNull b logDelegate) {
            Intrinsics.checkNotNullParameter(logDelegate, "logDelegate");
            c.b = logDelegate;
        }

        public final void g(@NotNull String msg) {
            b bVar;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (!e() || (bVar = c.b) == null) {
                return;
            }
            bVar.v(c.TAG, msg);
        }

        public final void h(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            b bVar = c.b;
            if (bVar != null) {
                bVar.w(c.TAG, msg);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/rpc/c$b;", "", "", "tag", "message", "", "v", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "", "caller", "a", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        @NotNull
        String a(@Nullable Throwable caller);

        void d(@NotNull String tag, @NotNull String message);

        void e(@NotNull String tag, @NotNull String message);

        void i(@NotNull String tag, @NotNull String message);

        void v(@NotNull String tag, @NotNull String message);

        void w(@NotNull String tag, @NotNull String message);
    }
}
