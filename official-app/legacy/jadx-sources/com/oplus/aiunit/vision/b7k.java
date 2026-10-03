package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/b7k;", "", "", MapSchema.FIELD_NAME_ENTRY, "", "position", "b", "d", "c", "a", "Lcom/heytap/health/base/track/a$b;", "kotlin.jvm.PlatformType", "Lcom/heytap/health/base/track/a$b;", "clickReporter", "showReporter", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b7k {

    @NotNull
    public static final b7k INSTANCE = new b7k();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final com.heytap.health.base.track.a.b clickReporter = com.heytap.health.base.track.a.k().a("pageid", "community.CommunityFragment").a(vik.TAG_MODULE_ID, 3);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final com.heytap.health.base.track.a.b showReporter = com.heytap.health.base.track.a.x().a("pageid", "community.CommunityFragment").a(vik.TAG_MODULE_ID, 3);

    public final void a() {
        clickReporter.a(vik.TAG_POSTION1, 4).b();
    }

    public final void b(int position) {
        clickReporter.a(vik.TAG_POSTION1, 2).c(vik.TAG_POSTION2, Integer.valueOf(position));
    }

    public final void c() {
        clickReporter.a(vik.TAG_POSTION1, 3).b();
    }

    public final void d(int position) {
        showReporter.a(vik.TAG_POSTION1, 2).c(vik.TAG_POSTION2, Integer.valueOf(position));
    }

    public final void e() {
        clickReporter.c(vik.TAG_POSTION1, 1);
    }
}
