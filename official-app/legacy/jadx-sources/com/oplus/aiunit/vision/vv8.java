package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/vv8;", "", "", "a", MapSchema.FIELD_NAME_ENTRY, "", "isLast", "", "date", "d", "b", "c", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vv8 {
    public static final int $stable = 0;

    @NotNull
    public static final vv8 INSTANCE = new vv8();

    public final void a() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void b() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 3).a(vik.TAG_POSTION2, 1).b();
    }

    public final void c(@NotNull String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 3).a(vik.TAG_POSTION2, 2).a("element", date).b();
    }

    public final void d(boolean isLast, @NotNull String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(isLast ? 1 : 2)).a("element", date).b();
    }

    public final void e() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).b();
    }
}
