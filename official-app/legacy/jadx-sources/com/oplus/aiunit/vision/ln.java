package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ!\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/ln;", "", "", "isMainProcess", "", "f", b2n.g, b2n.f, "", "msg", "d", "", "code", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "c", MapSchema.FIELD_NAME_ENTRY, "a", "", "J", "reportLoginErrorTime", "reportSsoidErrorTime", "<init>", "()V", "account_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ln {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static long reportLoginErrorTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long reportSsoidErrorTime;

    @NotNull
    public static final ln INSTANCE = new ln();
    public static final int $stable = 8;

    @JvmStatic
    public static final void f(boolean isMainProcess) {
        if (System.currentTimeMillis() - reportSsoidErrorTime > 3600000) {
            com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.i(4007).a("type", "ssoidEmpty").a("msg", "ssoidEmpty").a("isMainProcessor", Boolean.valueOf(isMainProcess)).a("isSystemLogin", Boolean.valueOf(um.c().x()));
            if (isMainProcess) {
                bVarA.a("token", um.c().getToken()).b();
            } else {
                bVarA.b();
            }
        }
    }

    public final void a(@Nullable Integer code, @Nullable String msg) {
        com.heytap.health.base.track.a.i(4007).a("type", "getAccountInfo").a("status_code", code).a("msg", msg).b();
    }

    public final void b(@Nullable Integer code, @Nullable String msg) {
        com.heytap.health.base.track.a.i(4007).a("type", "getAccountToken").a("status_code", code).a("msg", msg).b();
    }

    public final void c(@Nullable Integer code, @Nullable String msg) {
        com.heytap.health.base.track.a.i(4007).a("type", "getV1Token").a("status_code", code).a("msg", msg).b();
    }

    public final void d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (System.currentTimeMillis() - reportLoginErrorTime > 30000) {
            reportLoginErrorTime = System.currentTimeMillis();
            com.heytap.health.base.track.a.i(4007).a("type", "login").a("msg", msg).b();
        }
    }

    public final void e(@Nullable Integer code, @Nullable String msg) {
        com.heytap.health.base.track.a.i(4007).a("type", "refresh").a("status_code", code).a("msg", msg).b();
    }

    public final void g() {
        com.heytap.health.base.track.a.i(4007).a("type", "verifySsoid").a("msg", "Verification ended").b();
    }

    public final void h() {
        com.heytap.health.base.track.a.i(4007).a("type", "verifySsoid").a("msg", "Start verifying ssoid").b();
    }
}
