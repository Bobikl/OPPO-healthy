package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ylj;", "", "", "b", "", "isLast", "", "date", "a", "", "position", "name", "c", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ylj {
    public static final int $stable = 0;

    @NotNull
    public static final ylj INSTANCE = new ylj();

    public final void a(boolean isLast, @NotNull String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(isLast ? 1 : 2)).a("element", date).b();
    }

    public final void b() {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, 1).b();
    }

    public final void c(int position, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("element", name).b();
    }
}
