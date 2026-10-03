package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/j85;", "", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "", "success", b2n.g, "a", "", "msg", "b", "c", "d", "f", "Ljava/lang/String;", "MOUDLE_ID_DELETE", "<init>", "()V", "account_impl_release"}, k = 1, mv = {1, 8, 0})
public final class j85 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String MOUDLE_ID_DELETE = "deleteAccount";

    public final void a() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "deleteCloud").b();
    }

    public final void b(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "deleteCloud").a(vik.TAG_POSTION2, msg).b();
    }

    public final void c(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "deleteDb").a(vik.TAG_POSTION2, msg).b();
    }

    public final void d() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "deleteModuleData").b();
    }

    public final void e() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "hasDevices").b();
    }

    public final void f() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "notifyLogout").b();
    }

    public final void g() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "start").b();
    }

    public final void h(boolean success) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, this.MOUDLE_ID_DELETE).a(vik.TAG_POSTION1, "verify").a(vik.TAG_POSTION2, Boolean.valueOf(success)).b();
    }
}
