package com.oplus.aiunit.vision;

import androidx.fragment.app.Fragment;
import com.heytap.health.base.track.NxTrackHelper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/z6k;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "a", "Lcom/heytap/health/base/track/a$b;", "kotlin.jvm.PlatformType", "Lcom/heytap/health/base/track/a$b;", "showReporter", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z6k {

    @NotNull
    public static final z6k INSTANCE = new z6k();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final com.heytap.health.base.track.a.b showReporter = com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1);

    public final void a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        showReporter.c("pageid", NxTrackHelper.x(fragment));
    }
}
