package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "activity", "", "a", "", "FOLD_COLUMNSCOUNT", "I", "lib_ui_release"}, k = 2, mv = {1, 8, 0})
public final class wek {
    public static final int FOLD_COLUMNSCOUNT = 4;

    public static final boolean a(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return com.heytap.health.base.resposiveui.config.a.m(activity).q().getValue() == NearUIConfig.Status.FOLD;
    }
}
