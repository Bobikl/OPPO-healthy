package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/z7k;", "", "", b2n.g, "", "day", b2n.f, "d", "c", "f", "Ljava/time/LocalDate;", "date", MapSchema.FIELD_NAME_ENTRY, "", "open", "i", "a", "b", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z7k {
    public static final int $stable = 0;

    public final void a() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).b();
    }

    public final void b() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).b();
    }

    public final void c(int day) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 1).b();
    }

    public final void d() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 2).b();
    }

    public final void e(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 1).b();
    }

    public final void f() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).b();
    }

    public final void g(int day) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void h() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 2).b();
    }

    public final void i(boolean open) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, 1).a("switch", Integer.valueOf(!open ? 1 : 0)).b();
    }
}
