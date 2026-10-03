package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rR\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/e7k;", "", "", "duration", "", "result", "", "b", "position", "titleSort", "a", MapSchema.FIELD_NAME_ENTRY, "d", "", "title", "c", "Lcom/heytap/health/base/track/a$b;", "kotlin.jvm.PlatformType", "Lcom/heytap/health/base/track/a$b;", "report", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e7k {

    @NotNull
    public static final e7k INSTANCE = new e7k();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final com.heytap.health.base.track.a.b report = com.heytap.health.base.track.a.k();

    public final void a(int position, int titleSort) {
        report.a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("title_sort", Integer.valueOf(titleSort)).b();
    }

    public final void b(float duration, int result) {
        report.a(vik.TAG_MODULE_ID, 1).a("duration", Float.valueOf(duration)).a("result", Integer.valueOf(result)).b();
    }

    public final void c(int position, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        report.a(vik.TAG_MODULE_ID, 4).a(vik.TAG_POSTION1, Integer.valueOf(position)).a("title", title).b();
    }

    public final void d() {
        report.a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 2).b();
    }

    public final void e() {
        report.a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, 1).b();
    }
}
